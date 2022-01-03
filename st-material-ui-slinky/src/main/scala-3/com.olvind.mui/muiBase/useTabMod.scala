package com.olvind.mui.muiBase

import com.olvind.mui.react.mod.FocusEventHandler
import com.olvind.mui.react.mod.MouseEventHandler
import com.olvind.mui.react.mod.Ref
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticMouseEvent
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
        js.Function2[/* event */ SyntheticEvent[Event, Element], /* value */ Double | String, Unit]
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
      
      inline def setOnChange(value: (/* event */ SyntheticEvent[Event, Element], /* value */ Double | String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClick(value: SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFocus(value: SyntheticFocusEvent[Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
