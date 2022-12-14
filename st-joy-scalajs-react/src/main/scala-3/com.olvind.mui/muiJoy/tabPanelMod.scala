package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTabPanelTypeMapdiv
import com.olvind.mui.muiJoy.tabPanelTabPanelClassesMod.TabPanelClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelMod {
  
  @JSImport("@mui/joy/TabPanel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/joy-ui/react-tabs/)
    *
    * API:
    *
    * - [TabPanel API](https://mui.com/joy-ui/api/tab-panel/)
    */
  @JSImport("@mui/joy/TabPanel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTabPanelTypeMapdiv, Element | Null] = js.native
  
  inline def getTabPanelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabPanelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/TabPanel", "tabPanelClasses")
  @js.native
  val tabPanelClasses: TabPanelClasses = js.native
}
