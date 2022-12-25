package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTabTypeMapbutton
import com.olvind.mui.muiJoy.tabTabClassesMod.TabClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabMod {
  
  @JSImport("@mui/joy/Tab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Tab", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTabTypeMapbutton, Element | Null] = js.native
  
  inline def getTabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Tab", "tabClasses")
  @js.native
  val tabClasses: TabClasses = js.native
}
