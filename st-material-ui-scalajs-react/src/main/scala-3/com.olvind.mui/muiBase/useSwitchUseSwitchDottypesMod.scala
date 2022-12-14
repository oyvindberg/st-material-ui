package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.ChangeEventHandler
import com.olvind.mui.react.mod.FocusEventHandler
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSwitchUseSwitchDottypesMod {
  
  trait UseSwitchParameters extends StObject {
    
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
  object UseSwitchParameters {
    
    inline def apply(): UseSwitchParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseSwitchParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseSwitchParameters] (val x: Self) extends AnyVal {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      inline def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnFocusVisible(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocusVisible", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnFocusVisibleUndefined: Self = StObject.set(x, "onFocusVisible", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
}
