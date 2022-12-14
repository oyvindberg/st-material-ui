package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.Dispatch
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.SetStateAction
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlContextMod extends Shortcut {
  
  /**
    * @ignore - internal component.
    */
  @JSImport("@mui/material/FormControl/FormControlContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[FormControlState]] = js.native
  
  object ContextFromPropsKey {
    
    inline def color: "color" = "color".asInstanceOf["color"]
    
    inline def disabled: "disabled" = "disabled".asInstanceOf["disabled"]
    
    inline def error: "error" = "error".asInstanceOf["error"]
    
    inline def fullWidth: "fullWidth" = "fullWidth".asInstanceOf["fullWidth"]
    
    inline def hiddenLabel: "hiddenLabel" = "hiddenLabel".asInstanceOf["hiddenLabel"]
    
    inline def margin: "margin" = "margin".asInstanceOf["margin"]
    
    inline def onBlur: "onBlur" = "onBlur".asInstanceOf["onBlur"]
    
    inline def onFocus: "onFocus" = "onFocus".asInstanceOf["onFocus"]
    
    inline def required: "required" = "required".asInstanceOf["required"]
    
    inline def size: "size" = "size".asInstanceOf["size"]
    
    inline def variant: "variant" = "variant".asInstanceOf["variant"]
  }
  type ContextFromPropsKey = "color" | "disabled" | "error" | "fullWidth" | "hiddenLabel" | "margin" | "onBlur" | "onFocus" | "required" | "size" | "variant"
  
  /* Inlined parent std.Pick<@mui/material.@mui/material/FormControl/FormControl.FormControlProps<@mui/material.@mui/material/FormControl/FormControl.FormControlTypeMap<{}, 'div'>['defaultComponent'], {}>, @mui/material.@mui/material/FormControl/FormControlContext.ContextFromPropsKey> */
  trait FormControlState extends StObject {
    
    var adornedStart: Boolean
    
    var color: js.UndefOr["primary" | "secondary" | "error" | "info" | "success" | "warning"] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var filled: Boolean
    
    var focused: Boolean
    
    var fullWidth: js.UndefOr[Boolean] = js.undefined
    
    var hiddenLabel: js.UndefOr[Boolean] = js.undefined
    
    var margin: js.UndefOr["dense" | "normal" | "none"] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    def onEmpty(): Unit
    
    def onFilled(): Unit
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.undefined
    
    def registerEffect(): Unit
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var setAdornedStart: Dispatch[SetStateAction[Boolean]]
    
    var size: js.UndefOr["small" | "medium"] = js.undefined
    
    var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
  }
  object FormControlState {
    
    inline def apply(
      adornedStart: Boolean,
      filled: Boolean,
      focused: Boolean,
      onEmpty: Callback,
      onFilled: Callback,
      registerEffect: Callback,
      setAdornedStart: SetStateAction[Boolean] => Callback
    ): FormControlState = {
      val __obj = js.Dynamic.literal(adornedStart = adornedStart.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onEmpty = onEmpty.toJsFn, onFilled = onFilled.toJsFn, registerEffect = registerEffect.toJsFn, setAdornedStart = js.Any.fromFunction1((t0: SetStateAction[Boolean]) => setAdornedStart(t0).runNow()))
      __obj.asInstanceOf[FormControlState]
    }
    
    extension [Self <: FormControlState](x: Self) {
      
      inline def setAdornedStart(value: Boolean): Self = StObject.set(x, "adornedStart", value.asInstanceOf[js.Any])
      
      inline def setColor(value: "primary" | "secondary" | "error" | "info" | "success" | "warning"): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
      
      inline def setHiddenLabel(value: Boolean): Self = StObject.set(x, "hiddenLabel", value.asInstanceOf[js.Any])
      
      inline def setHiddenLabelUndefined: Self = StObject.set(x, "hiddenLabel", js.undefined)
      
      inline def setMargin(value: "dense" | "normal" | "none"): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnEmpty(value: Callback): Self = StObject.set(x, "onEmpty", value.toJsFn)
      
      inline def setOnFilled(value: Callback): Self = StObject.set(x, "onFilled", value.toJsFn)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setRegisterEffect(value: Callback): Self = StObject.set(x, "registerEffect", value.toJsFn)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSetAdornedStart(value: SetStateAction[Boolean] => Callback): Self = StObject.set(x, "setAdornedStart", js.Any.fromFunction1((t0: SetStateAction[Boolean]) => value(t0).runNow()))
      
      inline def setSize(value: "small" | "medium"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[FormControlState]]
  
  /* This means you don't have to write `default`, but can instead just say `formControlFormControlContextMod.foo` */
  override def _to: Context[js.UndefOr[FormControlState]] = default
}
