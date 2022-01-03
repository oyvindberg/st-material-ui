package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.HTMLAttributes
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSwitchMod {
  
  @js.native
  trait SwitchInputProps extends StObject {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onBlur: FocusEventHandler[Element] = js.native
    
    var onChange: ChangeEventHandler[HTMLInputElement] = js.native
    
    var onFocus: FocusEventHandler[Element] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var ref: Ref[Any] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object SwitchInputProps {
    
    @scala.inline
    def apply(
      onBlur: ReactFocusEventFrom[Element with Element] => Callback,
      onChange: ReactEventFrom[HTMLInputElement with Element] => Callback,
      onFocus: ReactFocusEventFrom[Element with Element] => Callback
    ): SwitchInputProps = {
      val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => onBlur(t0).runNow()), onChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement with Element]) => onChange(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => onFocus(t0).runNow()), ref = null)
      __obj.asInstanceOf[SwitchInputProps]
    }
    
    @scala.inline
    implicit class SwitchInputPropsMutableBuilder[Self <: SwitchInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnBlur(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnChange(value: ReactEventFrom[HTMLInputElement with Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnFocus(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait SwitchState extends StObject {
    
    var checked: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var focusVisible: Boolean = js.native
    
    var readOnly: Boolean = js.native
  }
  object SwitchState {
    
    @scala.inline
    def apply(checked: Boolean, disabled: Boolean, focusVisible: Boolean, readOnly: Boolean): SwitchState = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchState]
    }
    
    @scala.inline
    implicit class SwitchStateMutableBuilder[Self <: SwitchState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: Boolean): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UseSwitchProps extends StObject {
    
    /**
      * If `true`, the component is checked.
      */
    var checked: js.UndefOr[Boolean] = js.native
    
    /**
      * The default checked state. Use when the component is not controlled.
      */
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the component is disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.native
    
    /**
      * Callback fired when the state is changed.
      *
      * @param {React.ChangeEvent<HTMLInputElement>} event The event source of the callback.
      * You can pull out the new value by accessing `event.target.value` (string).
      * You can pull out the new checked state by accessing `event.target.checked` (boolean).
      */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.native
    
    var onFocusVisible: js.UndefOr[FocusEventHandler[Element]] = js.native
    
    /**
      * If `true`, the component is read only.
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the `input` element is required.
      */
    var required: js.UndefOr[Boolean] = js.native
  }
  object UseSwitchProps {
    
    @scala.inline
    def apply(): UseSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseSwitchProps]
    }
    
    @scala.inline
    implicit class UseSwitchPropsMutableBuilder[Self <: UseSwitchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnBlur(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: ReactEventFrom[HTMLInputElement with Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnFocusVisible(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
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
