package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAvatarGroupTypeMapd
import com.olvind.mui.muiJoy.avatarGroupAvatarGroupPropsMod.AvatarGroupOwnerState
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarGroupAvatarGroupMod extends Shortcut {
  
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
  @JSImport("@mui/joy/AvatarGroup/AvatarGroup", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAvatarGroupTypeMapd, Element | Null] = js.native
  
  @JSImport("@mui/joy/AvatarGroup/AvatarGroup", "AvatarGroupContext")
  @js.native
  val AvatarGroupContext: Context[js.UndefOr[AvatarGroupOwnerState]] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAvatarGroupTypeMapd, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `avatarGroupAvatarGroupMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAvatarGroupTypeMapd, Element | Null] = default
}
