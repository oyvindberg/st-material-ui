package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAvatarGroupTypeMapd
import com.olvind.mui.muiJoy.avatarGroupAvatarGroupClassesMod.AvatarGroupClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarGroupMod {
  
  @JSImport("@mui/joy/AvatarGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Avatar](https://mui.com/joy-ui/react-avatar/)
    *
    * API:
    *
    * - [AvatarGroup API](https://mui.com/joy-ui/api/avatar-group/)
    */
  @JSImport("@mui/joy/AvatarGroup", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAvatarGroupTypeMapd, Element | Null] = js.native
  
  @JSImport("@mui/joy/AvatarGroup", "avatarGroupClasses")
  @js.native
  val avatarGroupClasses: AvatarGroupClasses = js.native
  
  inline def getAvatarGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvatarGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
