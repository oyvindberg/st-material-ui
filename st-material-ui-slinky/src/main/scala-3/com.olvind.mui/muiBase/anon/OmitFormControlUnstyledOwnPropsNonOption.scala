package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledState
import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.NativeFormControlElement
import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Omit<FormControlUnstyledOwnProps, NonOptionalOwnerState> & Required<Pick<FormControlUnstyledProps<FormControlUnstyledTypeMap<{}, 'div'>['defaultComponent'], {}>, NonOptionalOwnerState>> & {  filled :boolean,   focused :boolean} */
trait OmitFormControlUnstyledOwnPropsNonOption extends StObject {
  
  var children: js.UndefOr[
    ReactElement | (js.Function1[/* state */ FormControlUnstyledState, ReactElement])
  ] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var disabled: Boolean
  
  var error: Boolean
  
  var filled: Boolean
  
  var focused: Boolean
  
  var onChange: js.UndefOr[ChangeEventHandler[NativeFormControlElement]] = js.undefined
  
  var required: Boolean
  
  var slotProps: js.UndefOr[`3`] = js.undefined
  
  var slots: js.UndefOr[`1`] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object OmitFormControlUnstyledOwnPropsNonOption {
  
  inline def apply(disabled: Boolean, error: Boolean, filled: Boolean, focused: Boolean, required: Boolean): OmitFormControlUnstyledOwnPropsNonOption = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitFormControlUnstyledOwnPropsNonOption]
  }
  
  extension [Self <: OmitFormControlUnstyledOwnPropsNonOption](x: Self) {
    
    inline def setChildren(value: ReactElement | (js.Function1[/* state */ FormControlUnstyledState, ReactElement])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* state */ FormControlUnstyledState => ReactElement): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: ChangeEvent[NativeFormControlElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSlotProps(value: `3`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: `1`): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
