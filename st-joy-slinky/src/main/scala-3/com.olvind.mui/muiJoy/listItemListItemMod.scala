package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemMod extends Shortcut {
  
  @JSImport("@mui/joy/ListItem/ListItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element | Null] = default
}
