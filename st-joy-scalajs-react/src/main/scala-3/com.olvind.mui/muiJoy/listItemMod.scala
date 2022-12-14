package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.muiJoy.listItemListItemClassesMod.ListItemClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod {
  
  @JSImport("@mui/joy/ListItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/joy-ui/react-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/joy-ui/api/list-item/)
    */
  @JSImport("@mui/joy/ListItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListItemTypeMapli, Element | Null] = js.native
  
  inline def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ListItem", "listItemClasses")
  @js.native
  val listItemClasses: ListItemClasses = js.native
}
