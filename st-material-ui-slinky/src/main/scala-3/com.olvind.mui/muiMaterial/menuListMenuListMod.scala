package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendListTypeMapMe
import com.olvind.mui.muiMaterial.anon.`22`
import com.olvind.mui.muiMaterial.listListMod.ExtendListTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuListMenuListMod extends Shortcut {
  
  /**
    * A permanently displayed menu following https://www.w3.org/WAI/ARIA/apg/patterns/menubutton/.
    * It's exposed to help customization of the [`Menu`](https://mui.com/material-ui/api/menu/) component if you
    * use it separately you need to move focus into the component manually. Once
    * the focus is placed inside the component it is fully keyboard accessible.
    *
    * Demos:
    *
    * - [Menu](https://mui.com/material-ui/react-menu/)
    *
    * API:
    *
    * - [MenuList API](https://mui.com/material-ui/api/menu-list/)
    * - inherits [List API](https://mui.com/material-ui/api/list/)
    */
  @JSImport("@mui/material/MenuList/MenuList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = js.native
  
  type MenuListClassKey = /* keyof std.NonNullable<@mui/material.anon.PartialListClasses | undefined> */ String
  
  type MenuListProps[D /* <: ReactElement */, P] = OverrideProps[MenuListTypeMap[P, D], D]
  
  type MenuListTypeMap[P, D /* <: ReactElement */] = ExtendListTypeMap[`22`[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element]
  
  /* This means you don't have to write `default`, but can instead just say `menuListMenuListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendListTypeMapMe, Element] = default
}
