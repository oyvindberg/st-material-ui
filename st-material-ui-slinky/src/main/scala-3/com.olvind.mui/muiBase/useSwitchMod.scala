package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.Ref
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSwitchMod {
  
  trait SwitchInputProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: FocusEventHandler[Element]
    
    var onChange: ChangeEventHandler[HTMLInputElement]
    
    var onFocus: FocusEventHandler[Element]
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var ref: Ref[Any]
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object SwitchInputProps {
    
    inline def apply(
      onBlur: SyntheticFocusEvent[Element] => Unit,
      onChange: ChangeEvent[HTMLInputElement] => Unit,
      onFocus: SyntheticFocusEvent[Element] => Unit
    ): SwitchInputProps = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1(onBlur), onChange = js.Any.fromFunction1(onChange), onFocus = js.Any.fromFunction1(onFocus), ref = null)
      __obj.asInstanceOf[SwitchInputProps]
    }
    
    extension [Self <: SwitchInputProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait SwitchState extends StObject {
    
    var checked: Boolean
    
    var disabled: Boolean
    
    var focusVisible: Boolean
    
    var readOnly: Boolean
  }
  object SwitchState {
    
    inline def apply(checked: Boolean, disabled: Boolean, focusVisible: Boolean, readOnly: Boolean): SwitchState = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchState]
    }
    
    extension [Self <: SwitchState](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait UseSwitchProps extends StObject {
    
    /**
      * If `true`, the component is checked.
      */
    var checked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default checked state. Use when the component is not controlled.
      */
    var defaultChecked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the component is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
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
  }
  object UseSwitchProps {
    
    inline def apply(): UseSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseSwitchProps]
    }
    
    extension [Self <: UseSwitchProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
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
    }
  }
  
  @js.native
  trait UseSwitchResult
    extends StObject
       with SwitchState {
    
    /**
      * Returns props for an HTML `input` element that is a part of a Switch.
      */
    def getInputProps(): SwitchInputProps = js.native
    def getInputProps(otherProps: HTMLAttributes[HTMLInputElement]): SwitchInputProps = js.native
  }
}
