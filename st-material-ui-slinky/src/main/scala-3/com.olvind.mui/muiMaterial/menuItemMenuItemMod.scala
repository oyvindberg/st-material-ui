package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriachecked
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapMenu
import com.olvind.mui.muiMaterial.anon.`23`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMenuItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Menu](https://mui.com/material-ui/react-menu/)
    *
    * API:
    *
    * - [MenuItem API](https://mui.com/material-ui/api/menu-item/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/MenuItem/MenuItem", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    ReactElement | Null
  ] = js.native
  
  type MenuItemProps[D /* <: ReactElement */, P] = OverrideProps[MenuItemTypeMap[P, D], D]
  
  type MenuItemTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`23`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMenuItemMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    ReactElement | Null
  ] = default
}
