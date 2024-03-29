package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.NativeFormControlElement
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Pick<FormControlUnstyledProps<FormControlUnstyledTypeMap<{}, 'div'>['defaultComponent'], {}>, ContextFromPropsKey> & {  filled :boolean,   focused :boolean, onBlur (): void, onFocus (): void} */
trait PickFormControlUnstyledPropsFormControlU extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the form element has some value.
    */
  var filled: Boolean
  
  /**
    * If `true`, the form element is focused and not disabled.
    */
  var focused: Boolean
  
  /**
    * Callback fired when the form element has lost focus.
    */
  def onBlur(): Unit
  
  var onChange: js.UndefOr[ChangeEventHandler[NativeFormControlElement]] = js.undefined
  
  /**
    * Callback fired when the form element receives focus.
    */
  def onFocus(): Unit
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object PickFormControlUnstyledPropsFormControlU {
  
  inline def apply(filled: Boolean, focused: Boolean, onBlur: () => Unit, onFocus: () => Unit): PickFormControlUnstyledPropsFormControlU = {
    val __obj = js.Dynamic.literal(filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus))
    __obj.asInstanceOf[PickFormControlUnstyledPropsFormControlU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickFormControlUnstyledPropsFormControlU] (val x: Self) extends AnyVal {
    
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
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
