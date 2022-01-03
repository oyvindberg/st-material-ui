package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.formControlUnstyledPropsMod.NativeFormControlElement
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlContextMod extends Shortcut {
  
  /**
    * @ignore - internal component.
    */
  @JSImport("@mui/base/FormControlUnstyled/FormControlContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[FormControlUnstyledState]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.error
    - `com.olvind.mui`.muiBase.muiBaseStrings.onChange
    - `com.olvind.mui`.muiBase.muiBaseStrings.required
    - `com.olvind.mui`.muiBase.muiBaseStrings.value
  */
  trait ContextFromPropsKey extends StObject
  object ContextFromPropsKey {
    
    inline def disabled: com.olvind.mui.muiBase.muiBaseStrings.disabled = "disabled".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.disabled]
    
    inline def error: com.olvind.mui.muiBase.muiBaseStrings.error = "error".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.error]
    
    inline def onChange: com.olvind.mui.muiBase.muiBaseStrings.onChange = "onChange".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.onChange]
    
    inline def required: com.olvind.mui.muiBase.muiBaseStrings.required = "required".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.required]
    
    inline def value: com.olvind.mui.muiBase.muiBaseStrings.value = "value".asInstanceOf[com.olvind.mui.muiBase.muiBaseStrings.value]
  }
  
  /* Inlined parent std.Pick<@mui/base.@mui/base/FormControlUnstyled/FormControlUnstyledProps.default<@mui/base.@mui/base/FormControlUnstyled/FormControlUnstyledProps.FormControlUnstyledTypeMap<{}, 'div'>['defaultComponent'], {}>, @mui/base.@mui/base/FormControlUnstyled/FormControlContext.ContextFromPropsKey> */
  trait FormControlUnstyledState extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var filled: Boolean
    
    var focused: Boolean
    
    def onBlur(): Unit
    
    var onChange: js.UndefOr[ChangeEventHandler[NativeFormControlElement]] = js.undefined
    
    def onFocus(): Unit
    
    def registerEffect(): Unit
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object FormControlUnstyledState {
    
    inline def apply(
      filled: Boolean,
      focused: Boolean,
      onBlur: () => Unit,
      onFocus: () => Unit,
      registerEffect: () => Unit
    ): FormControlUnstyledState = {
      val __obj = js.Dynamic.literal(filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), registerEffect = js.Any.fromFunction0(registerEffect))
      __obj.asInstanceOf[FormControlUnstyledState]
    }
    
    extension [Self <: FormControlUnstyledState](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnChange(value: ChangeEvent[NativeFormControlElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      inline def setRegisterEffect(value: () => Unit): Self = StObject.set(x, "registerEffect", js.Any.fromFunction0(value))
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = Context[js.UndefOr[FormControlUnstyledState]]
  
  /* This means you don't have to write `default`, but can instead just say `formControlContextMod.foo` */
  override def _to: Context[js.UndefOr[FormControlUnstyledState]] = default
}
