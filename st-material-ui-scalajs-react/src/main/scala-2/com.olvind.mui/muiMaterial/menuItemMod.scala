package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriachecked
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapMenu
import com.olvind.mui.muiMaterial.menuItemClassesMod.MenuItemClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMod {
  
  @JSImport("@mui/material/MenuItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Menus](https://mui.com/components/menus/)
    *
    * API:
    *
    * - [MenuItem API](https://mui.com/api/menu-item/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/MenuItem", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    Element | Null
  ] = js.native
  
  @scala.inline
  def getMenuItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/MenuItem", "menuItemClasses")
  @js.native
  val menuItemClasses: MenuItemClasses = js.native
}
