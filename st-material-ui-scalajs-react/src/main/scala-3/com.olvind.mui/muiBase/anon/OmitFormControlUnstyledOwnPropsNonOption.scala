package com.olvind.mui.muiBase.anon

import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledSlots
import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.FormControlUnstyledState
import com.olvind.mui.muiBase.formControlUnstyledFormControlUnstyledDottypesMod.NativeFormControlElement
import com.olvind.mui.react.mod.ChangeEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Omit<FormControlUnstyledOwnProps, NonOptionalOwnerState> & Required<Pick<FormControlUnstyledProps<FormControlUnstyledTypeMap<{}, 'div'>['defaultComponent'], {}>, NonOptionalOwnerState>> & {  filled :boolean,   focused :boolean} */
trait OmitFormControlUnstyledOwnPropsNonOption extends StObject {
  
  var children: js.UndefOr[Node | (js.Function1[/* state */ FormControlUnstyledState, Node])] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var defaultValue: js.UndefOr[Any] = js.undefined
  
  var disabled: Boolean
  
  var error: Boolean
  
  var filled: Boolean
  
  var focused: Boolean
  
  var onChange: js.UndefOr[ChangeEventHandler[NativeFormControlElement]] = js.undefined
  
  var required: Boolean
  
  var slotProps: js.UndefOr[`1`] = js.undefined
  
  var slots: js.UndefOr[FormControlUnstyledSlots] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
}
object OmitFormControlUnstyledOwnPropsNonOption {
  
  inline def apply(disabled: Boolean, error: Boolean, filled: Boolean, focused: Boolean, required: Boolean): OmitFormControlUnstyledOwnPropsNonOption = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitFormControlUnstyledOwnPropsNonOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitFormControlUnstyledOwnPropsNonOption] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Node | (js.Function1[/* state */ FormControlUnstyledState, Node])): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenFunction1(value: /* state */ FormControlUnstyledState => Node): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: ReactEventFrom[NativeFormControlElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[NativeFormControlElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSlotProps(value: `1`): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: FormControlUnstyledSlots): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
