package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.ltr
import com.olvind.mui.muiBase.muiBaseStrings.rtl
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTabsMod {
  
  @js.native
  trait UseTabsProps extends StObject {
    
    /**
      * The default value. Use when the component is not controlled.
      */
    var defaultValue: js.UndefOr[String | Double | `false`] = js.native
    
    /**
      * The direction of the text.
      * @default 'ltr'
      */
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    /**
      * Callback invoked when new value is being set.
      */
    var onChange: js.UndefOr[
        js.Function2[/* event */ SyntheticEvent[Event, Element], /* value */ Double | String, Unit]
      ] = js.native
    
    /**
      * The component orientation (layout flow direction).
      * @default 'horizontal'
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * If `true` the selected tab changes on focus. Otherwise it only
      * changes on activation.
      */
    var selectionFollowsFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * The value of the currently selected `Tab`.
      * If you don't want any selected `Tab`, you can set this prop to `false`.
      */
    var value: js.UndefOr[String | Double | `false`] = js.native
  }
  object UseTabsProps {
    
    @scala.inline
    def apply(): UseTabsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseTabsProps]
    }
    
    @scala.inline
    implicit class UseTabsPropsMutableBuilder[Self <: UseTabsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultValue(value: String | Double | `false`): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* event */ SyntheticEvent[Event, Element], /* value */ Double | String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setSelectionFollowsFocus(value: Boolean): Self = StObject.set(x, "selectionFollowsFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionFollowsFocusUndefined: Self = StObject.set(x, "selectionFollowsFocus", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double | `false`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
