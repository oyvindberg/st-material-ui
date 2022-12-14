package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.listItemIconListItemIconClassesMod.ListItemIconClasses
import com.olvind.mui.muiMaterial.listItemIconListItemIconMod.ListItemIconProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemIconMod {
  
  @JSImport("@mui/material/ListItemIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ListItemIconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getListItemIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItemIcon", "listItemIconClasses")
  @js.native
  val listItemIconClasses: ListItemIconClasses = js.native
}
