package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.muiBaseBooleans.`false`
import com.olvind.mui.muiBase.muiBaseStrings.horizontal
import com.olvind.mui.muiBase.muiBaseStrings.ltr
import com.olvind.mui.muiBase.muiBaseStrings.rtl
import com.olvind.mui.muiBase.muiBaseStrings.vertical
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsContextMod {
  
  @js.native
  trait TabsContextValue extends StObject {
    
    /**
      * The direction of the text.
      */
    var direction: js.UndefOr[ltr | rtl] = js.native
    
    /**
      * Id used as a prefix for the current Tabs.
      */
    var idPrefix: js.UndefOr[String] = js.native
    
    def onSelected(event: ReactEventFrom[Element], value: String): Unit = js.native
    /**
      * Callback for setting new value.
      */
    def onSelected(event: ReactEventFrom[Element], value: Double): Unit = js.native
    @JSName("onSelected")
    def onSelected_false(event: ReactEventFrom[Element], value: `false`): Unit = js.native
    
    /**
      * The component orientation (layout flow direction).
      */
    var orientation: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * If `true` the selected tab changes on focus. Otherwise it only
      * changes on activation.
      */
    var selectionFollowsFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * The currently selected tab's value.
      */
    var value: Double | String | `false` = js.native
  }
}
