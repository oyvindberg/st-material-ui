package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.NativeFormControlElement
import com.olvind.mui.react.mod.ChangeEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filled extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var filled: Boolean
  
  var focused: Boolean
  
  def onBlur(): Unit
  
  var onChange: js.UndefOr[ChangeEventHandler[NativeFormControlElement]] = js.undefined
  
  def onFocus(): Unit
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object Filled {
  
  inline def apply(filled: Boolean, focused: Boolean, onBlur: Callback, onFocus: Callback): Filled = {
    val __obj = js.Dynamic.literal(filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onFocus = onFocus.toJsFn)
    __obj.asInstanceOf[Filled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Filled] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
    
    inline def setOnChange(value: ReactEventFrom[NativeFormControlElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[NativeFormControlElement & Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
