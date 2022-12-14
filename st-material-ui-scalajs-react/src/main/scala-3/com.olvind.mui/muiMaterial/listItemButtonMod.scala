package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriabusy
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapListAbout
import com.olvind.mui.muiMaterial.listItemButtonListItemButtonClassesMod.ListItemButtonClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonMod {
  
  @JSImport("@mui/material/ListItemButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/material-ui/react-list/)
    *
    * API:
    *
    * - [ListItemButton API](https://mui.com/material-ui/api/list-item-button/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/ListItemButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapListAbout | DefaultComponentPropsExtendButtonBaseTypAriabusy, 
    Element | Null
  ] = js.native
  
  inline def getListItemButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItemButton", "listItemButtonClasses")
  @js.native
  val listItemButtonClasses: ListItemButtonClasses = js.native
}
