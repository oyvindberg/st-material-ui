package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.ltr
import com.olvind.mui.muiBase.muiBaseStrings.rtl
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabsMod {
  
  trait UseTabsProps extends StObject {
    
    /**
      * The default value. Use when the component is not controlled.
      */
    var defaultValue: js.UndefOr[String | Double | `false`] = js.undefined
    
    /**
      * The direction of the text.
      * @default 'ltr'
      */
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    /**
      * Callback invoked when new value is being set.
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ ReactEventFrom[Element], /* value */ Double | String, Unit]
      ] = js.undefined
    
    /**
      * The component orientation (layout flow direction).
      * @default 'horizontal'
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.undefined
    
    /**
      * If `true` the selected tab changes on focus. Otherwise it only
      * changes on activation.
      */
    var selectionFollowsFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The value of the currently selected `Tab`.
      * If you don't want any selected `Tab`, you can set this prop to `false`.
      */
    var value: js.UndefOr[String | Double | `false`] = js.undefined
  }
  object UseTabsProps {
    
    inline def apply(): UseTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseTabsProps]
    }
    
    extension [Self <: UseTabsProps](x: Self) {
      
      inline def setDefaultValue(value: String | Double | `false`): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnChange(value: (/* event */ ReactEventFrom[Element], /* value */ Double | String) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Element], t1: /* value */ Double | String) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
      
      inline def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
      
      inline def setValue(value: String | Double | `false`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
