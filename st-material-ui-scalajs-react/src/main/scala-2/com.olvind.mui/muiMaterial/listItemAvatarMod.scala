package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.listItemAvatarClassesMod.ListItemAvatarClasses
import com.olvind.mui.muiMaterial.listItemAvatarListItemAvatarMod.ListItemAvatarProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemAvatarMod {
  
  @JSImport("@mui/material/ListItemAvatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: ListItemAvatarProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getListItemAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ListItemAvatar", "listItemAvatarClasses")
  @js.native
  val listItemAvatarClasses: ListItemAvatarClasses = js.native
}
