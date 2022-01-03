package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabMod {
  
  trait UseTabProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback invoked when new value is being set.
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[Element], /* value */ Double | String, Unit]
      ] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.undefined
    
    var ref: Ref[Any]
    
    /**
      * You can provide your own value. Otherwise, we fall back to the child position index.
      */
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object UseTabProps {
    
    inline def apply(): UseTabProps = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[UseTabProps]
    }
    
    extension [Self <: UseTabProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[Element], /* value */ Double | String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ Double | String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[Element & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
