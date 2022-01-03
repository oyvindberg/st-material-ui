package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeBadgeProps
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeClasses_
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeRootProps
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    * - [Badges](https://mui.com/components/badges/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/api/badge/)
    * - inherits [BadgeUnstyled API](https://mui.com/api/badge-unstyled/)
    */
  @JSImport("@mui/material/Badge", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = js.native
  
  @JSImport("@mui/material/Badge", "BadgeMark")
  @js.native
  val BadgeMark: FC[BadgeBadgeProps] = js.native
  
  @JSImport("@mui/material/Badge", "BadgeRoot")
  @js.native
  val BadgeRoot: FC[BadgeRootProps] = js.native
  
  @JSImport("@mui/material/Badge", "badgeClasses")
  @js.native
  val badgeClasses: BadgeClasses_ = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `badgeMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = default
}
