package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTabListTypeMapdiv
import com.olvind.mui.muiJoy.tabListTabListClassesMod.TabListClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListMod {
  
  @JSImport("@mui/joy/TabList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/TabList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTabListTypeMapdiv, Element | Null] = js.native
  
  inline def getTabListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/TabList", "tabListClasses")
  @js.native
  val tabListClasses: TabListClasses = js.native
}
