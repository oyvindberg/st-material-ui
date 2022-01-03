package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapMe
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMod extends Shortcut {
  
  /**
    * A permanently displayed menu following https://www.w3.org/TR/wai-aria-practices/#menubutton.
    * It's exposed to help customization of the [`Menu`](https://mui.com/api/menu/) component if you
    * use it separately you need to move focus into the component manually. Once
    * the focus is placed inside the component it is fully keyboard accessible.
    *
    * Demos:
    *
    * - [Menus](https://mui.com/components/menus/)
    *
    * API:
    *
    * - [MenuList API](https://mui.com/api/menu-list/)
    * - inherits [List API](https://mui.com/api/list/)
    */
  @JSImport("@mui/material/MenuList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element]
  
  /* This means you don't have to write `default`, but can instead just say `menuListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = default
}
