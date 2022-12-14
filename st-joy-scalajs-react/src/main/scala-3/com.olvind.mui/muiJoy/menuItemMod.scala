package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OverridePropsExtendMenuItemTypeMapMenuIt
import com.olvind.mui.muiJoy.menuItemMenuItemClassesMod.MenuItemClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("@mui/joy/MenuItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Menu](https://mui.com/joy-ui/react-menu/)
    *
    * API:
    *
    * - [MenuItem API](https://mui.com/joy-ui/api/menu-item/)
    * - inherits [ListItemButton API](https://mui.com/joy-ui/api/list-item-button/)
    */
  @JSImport("@mui/joy/MenuItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendMenuItemTypeMapMenuIt, Element] = js.native
  
  inline def getMenuItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/MenuItem", "menuItemClasses")
  @js.native
  val menuItemClasses: MenuItemClasses = js.native
}
