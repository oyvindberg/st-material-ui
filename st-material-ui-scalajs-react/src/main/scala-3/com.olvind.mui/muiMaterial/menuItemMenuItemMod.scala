package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriachecked
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapMenu
import com.olvind.mui.muiMaterial.anon.`20`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMenuItemMod extends Shortcut {
  
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
  @JSImport("@mui/material/MenuItem/MenuItem", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    Element | Null
  ] = js.native
  
  type MenuItemProps[D /* <: ElementType */, P] = OverrideProps[MenuItemTypeMap[P, D], D]
  
  type MenuItemTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[`20`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMenuItemMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapMenu | DefaultComponentPropsExtendButtonBaseTypAriachecked, 
    Element | Null
  ] = default
}
