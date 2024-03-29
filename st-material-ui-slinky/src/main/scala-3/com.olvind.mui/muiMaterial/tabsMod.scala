package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTabsTypeMappropsOve
import com.olvind.mui.muiMaterial.tabsTabsClassesMod.TabsClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@mui/material/Tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/material-ui/react-tabs/)
    *
    * API:
    *
    * - [Tabs API](https://mui.com/material-ui/api/tabs/)
    */
  @JSImport("@mui/material/Tabs", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTabsTypeMappropsOve, Element] = js.native
  
  inline def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Tabs", "tabsClasses")
  @js.native
  val tabsClasses: TabsClasses = js.native
}
