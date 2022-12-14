package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsListItemContentType
import com.olvind.mui.muiJoy.listItemContentListItemContentClassesMod.ListItemContentClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemContentMod {
  
  @JSImport("@mui/joy/ListItemContent", JSImport.Namespace)
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
    * - [ListItemContent API](https://mui.com/joy-ui/api/list-item-content/)
    */
  @JSImport("@mui/joy/ListItemContent", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsListItemContentType, Element | Null] = js.native
  
  inline def getListItemContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ListItemContent", "listItemContentClasses")
  @js.native
  val listItemContentClasses: ListItemContentClasses = js.native
}
