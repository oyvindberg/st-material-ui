package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTabsTypeMapdiv
import com.olvind.mui.muiJoy.tabsTabsClassesMod.TabsClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("@mui/joy/Tabs", JSImport.Namespace)
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
    * - [Tabs API](https://mui.com/joy-ui/api/tabs/)
    */
  @JSImport("@mui/joy/Tabs", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTabsTypeMapdiv, Element | Null] = js.native
  
  inline def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Tabs", "tabsClasses")
  @js.native
  val tabsClasses: TabsClasses = js.native
}
