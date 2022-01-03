package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapMe
import com.olvind.mui.muiMaterial.anon.`22`
import com.olvind.mui.muiMaterial.listListMod.ExtendListTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMenuListMod extends Shortcut {
  
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
  @JSImport("@mui/material/MenuList/MenuList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = js.native
  
  type MenuListClassKey = /* keyof std.NonNullable<@mui/material.anon.PartialListClasses | undefined> */ String
  
  type MenuListProps[D /* <: ElementType */, P] = OverrideProps[MenuListTypeMap[P, D], D]
  
  type MenuListTypeMap[P, D /* <: ElementType */] = ExtendListTypeMap[`22`[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element]
  
  /* This means you don't have to write `default`, but can instead just say `menuListMenuListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = default
}
