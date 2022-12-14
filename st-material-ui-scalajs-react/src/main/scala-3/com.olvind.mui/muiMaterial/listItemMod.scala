package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAlignItems
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsListItemTypeMapli
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapList
import com.olvind.mui.muiMaterial.listItemListItemClassesMod.ListItemClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod {
  
  @JSImport("@mui/material/ListItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Uses an additional container component if `ListItemSecondaryAction` is the last child.
    *
    * Demos:
    *
    * - [Lists](https://mui.com/material-ui/react-list/)
    * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/material-ui/api/list-item/)
    */
  @JSImport("@mui/material/ListItem", JSImport.Default)
  @js.native
  val default: (js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapList | DefaultComponentPropsExtendButtonBaseTypAlignItems, 
    Element | Null
  ]) & (js.Function1[
    /* props */ DefaultComponentPropsListItemTypeMapli, 
    com.olvind.mui.react.mod.global.JSX.Element
  ]) = js.native
  
  inline def getListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItem", "listItemClasses")
  @js.native
  val listItemClasses: ListItemClasses = js.native
}
