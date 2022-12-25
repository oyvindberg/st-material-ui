package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OverridePropsExtendListItemButtonTypeMap
import com.olvind.mui.muiJoy.listItemButtonListItemButtonClassesMod.ListItemButtonClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemButtonMod {
  
  @JSImport("@mui/joy/ListItemButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ListItemButton", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ OverridePropsExtendListItemButtonTypeMap, Element] = js.native
  
  inline def getListItemButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ListItemButton", "listItemButtonClasses")
  @js.native
  val listItemButtonClasses: ListItemButtonClasses = js.native
}
