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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabMod {
  
  @js.native
  trait UseTabProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback invoked when new value is being set.
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[Element], /* value */ Double | String, Unit]
      ] = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[Element]] = js.native
    
    var onFocus: js.UndefOr[FocusEventHandler[Element]] = js.native
    
    var ref: Ref[Any] = js.native
    
    /**
      * You can provide your own value. Otherwise, we fall back to the child position index.
      */
    var value: js.UndefOr[Double | String] = js.native
  }
  object UseTabProps {
    
    @scala.inline
    def apply(): UseTabProps = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[UseTabProps]
    }
    
    @scala.inline
    implicit class UseTabPropsMutableBuilder[Self <: UseTabProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ ReactEventFrom[Element], /* value */ Double | String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ Double | String) => (value(t0, t1)).runNow()))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(value: ReactMouseEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnFocus(value: ReactFocusEventFrom[Element with Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Element with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
