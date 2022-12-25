package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsMenuListTypeMapul
import com.olvind.mui.muiJoy.menuListMenuListClassesMod.MenuListClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMod {
  
  @JSImport("@mui/joy/MenuList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/MenuList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsMenuListTypeMapul, Element | Null] = js.native
  
  inline def getMenuListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/MenuList", "menuListClasses")
  @js.native
  val menuListClasses: MenuListClasses = js.native
}
