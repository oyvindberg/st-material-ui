package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAvatarTypeMapdiv
import com.olvind.mui.muiJoy.avatarAvatarClassesMod.AvatarClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod {
  
  @JSImport("@mui/joy/Avatar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Avatar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAvatarTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Avatar", "avatarClasses")
  @js.native
  val avatarClasses: AvatarClasses = js.native
  
  inline def getAvatarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
