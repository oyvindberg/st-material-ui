package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.avatarGroupAvatarGroupMod.AvatarGroupProps
import com.olvind.mui.muiMaterial.avatarGroupClassesMod.AvatarGroupClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarGroupMod {
  
  @JSImport("@mui/material/AvatarGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AvatarGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/AvatarGroup", "avatarGroupClasses")
  @js.native
  val avatarGroupClasses: AvatarGroupClasses = js.native
  
  inline def getAvatarGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
