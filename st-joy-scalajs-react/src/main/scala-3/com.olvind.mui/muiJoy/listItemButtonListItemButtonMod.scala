package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.MUIStyledCommonPropsThemeDetailedHTMLProAriaautocomplete
import com.olvind.mui.muiJoy.anon.OverridePropsExtendListItemButtonTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonListItemButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/joy-ui/react-list/)
    *
    * API:
    *
    * - [ListItemButton API](https://mui.com/joy-ui/api/list-item-button/)
    */
  @JSImport("@mui/joy/ListItemButton/ListItemButton", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendListItemButtonTypeMap, Element] = js.native
  
  @JSImport("@mui/joy/ListItemButton/ListItemButton", "StyledListItemButton")
  @js.native
  val StyledListItemButton: js.Function1[
    /* props */ MUIStyledCommonPropsThemeDetailedHTMLProAriaautocomplete, 
    japgolly.scalajs.react.facade.React.Element | Null
  ] = js.native
  
  type _To = js.Function1[/* props */ OverridePropsExtendListItemButtonTypeMap, Element]
  
  /* This means you don't have to write `default`, but can instead just say `listItemButtonListItemButtonMod.foo` */
  override def _to: js.Function1[/* props */ OverridePropsExtendListItemButtonTypeMap, Element] = default
}
