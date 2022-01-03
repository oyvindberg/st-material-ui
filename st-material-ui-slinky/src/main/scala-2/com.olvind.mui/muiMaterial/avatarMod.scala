package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsAvatarTypeMapdiv
import com.olvind.mui.muiMaterial.avatarClassesMod.AvatarClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("@mui/material/Avatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    *
    * API:
    *
    * - [Avatar API](https://mui.com/api/avatar/)
    */
  @JSImport("@mui/material/Avatar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/Avatar", "avatarClasses")
  @js.native
  val avatarClasses: AvatarClasses = js.native
  
  @scala.inline
  def getAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
