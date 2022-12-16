package com.olvind.mui.muiBase.anon

import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/base.@mui/base/SwitchUnstyled/SwitchUnstyled.types.SwitchUnstyledOwnProps & {  checked :boolean,   disabled :boolean,   focusVisible :boolean,   readOnly :boolean} */
trait SwitchUnstyledOwnProps extends StObject {
  
  /**
    * If `true`, the component is checked.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Class name applied to the root element.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * The default checked state. Use when the component is not controlled.
    */
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var focusVisible: Boolean
  
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  /**
    * Callback fired when the state is changed.
    *
    * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
    * You can pull out the new value by accessing `event.target.value` (string).
    * You can pull out the new checked state by accessing `event.target.checked` (boolean).
    */
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  
  var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  var onFocusVisible: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  
  /**
    * If `true`, the component is read only.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the `input` element is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The props used for each slot inside the Switch.
    * @default {}
    */
  var slotProps: js.UndefOr[Track] = js.undefined
  
  /**
    * The components used for each slot inside the Switch.
    * Either a string to use a HTML element or a component.
    * @default {}
    */
  var slots: js.UndefOr[Thumb] = js.undefined
}
object SwitchUnstyledOwnProps {
  
  inline def apply(focusVisible: Boolean): SwitchUnstyledOwnProps = {
    val __obj = js.Dynamic.literal(focusVisible = focusVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchUnstyledOwnProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SwitchUnstyledOwnProps] (val x: Self) extends AnyVal {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
    
    inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnFocusVisible(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1(value))
    
    inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSlotProps(value: Track): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: Thumb): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
