package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsMenuListTypeMapul
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMenuListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Menu](https://mui.com/joy-ui/react-menu/)
    *
    * API:
    *
    * - [MenuList API](https://mui.com/joy-ui/api/menu-list/)
    */
  @JSImport("@mui/joy/MenuList/MenuList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsMenuListTypeMapul, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsMenuListTypeMapul, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `menuListMenuListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsMenuListTypeMapul, Element | Null] = default
}
