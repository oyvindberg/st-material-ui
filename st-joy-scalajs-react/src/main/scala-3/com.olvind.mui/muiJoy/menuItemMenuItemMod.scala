package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OverridePropsExtendMenuItemTypeMapMenuIt
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMenuItemMod extends Shortcut {
  
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
  @JSImport("@mui/joy/MenuItem/MenuItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendMenuItemTypeMapMenuIt, Element] = js.native
  
  type _To = js.Function1[/* props */ OverridePropsExtendMenuItemTypeMapMenuIt, Element]
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMenuItemMod.foo` */
  override def _to: js.Function1[/* props */ OverridePropsExtendMenuItemTypeMapMenuIt, Element] = default
}
