package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SystemStyleObject
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAnimation extends StObject {
  
  /**
    * The content of the component.
    */
  var children: js.UndefOr[ReactElement] = js.undefined
  
  /**
    * Override or extend the styles applied to the component.
    */
  var classes: js.UndefOr[PartialInputLabelClasses] = js.undefined
  
  var color: js.UndefOr[
    js.UndefOr[String] & (js.UndefOr["primary" | "secondary" | "error" | "info" | "success" | "warning"])
  ] = js.undefined
  
  /**
    * If `true`, the transition animation is disabled.
    * @default false
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label is displayed in an error state.
    */
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the `input` of this label is focused.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `dense`, will adjust vertical spacing. This is normally obtained via context from
    * FormControl.
    */
  var margin: js.UndefOr["dense"] = js.undefined
  
  /**
    * if `true`, the label will indicate that the `input` is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the label is shrunk.
    */
  var shrink: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size of the component.
    * @default 'normal'
    */
  var size: js.UndefOr["small" | "normal"] = js.undefined
  
  /**
    * The system prop that allows defining system overrides as well as additional CSS styles.
    */
  var sx: js.UndefOr[SxProps[Theme]] = js.undefined
  
  /**
    * The variant to use.
    */
  var variant: js.UndefOr["standard" | "outlined" | "filled"] = js.undefined
}
object DisableAnimation {
  
  inline def apply(): DisableAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableAnimation] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClasses(value: PartialInputLabelClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setColor(
      value: js.UndefOr[String] & (js.UndefOr["primary" | "secondary" | "error" | "info" | "success" | "warning"])
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setMargin(value: "dense"): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setShrink(value: Boolean): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
    
    inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
    
    inline def setSize(value: "small" | "normal"): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSx(value: SxProps[Theme]): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxFunction1(value: Theme => SystemStyleObject[Theme]): Self = StObject.set(x, "sx", js.Any.fromFunction1(value))
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    
    inline def setSxVarargs(value: (Boolean | SystemStyleObject[Theme] | (js.Function1[Theme, SystemStyleObject[Theme]]))*): Self = StObject.set(x, "sx", js.Array(value*))
    
    inline def setVariant(value: "standard" | "outlined" | "filled"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
