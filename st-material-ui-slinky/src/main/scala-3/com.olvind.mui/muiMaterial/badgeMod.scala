package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.muiMaterial.badgeBadgeClassesMod.BadgeClasses
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeBadgeProps
import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeRootProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@mui/material/Badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Avatar](https://mui.com/material-ui/react-avatar/)
    * - [Badge](https://mui.com/material-ui/react-badge/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/material-ui/api/badge/)
    * - inherits [BadgeUnstyled API](https://mui.com/base/api/badge-unstyled/)
    */
  @JSImport("@mui/material/Badge", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element] = js.native
  
  @JSImport("@mui/material/Badge", "BadgeMark")
  @js.native
  val BadgeMark: ReactComponentClass[BadgeBadgeProps] = js.native
  
  @JSImport("@mui/material/Badge", "BadgeRoot")
  @js.native
  val BadgeRoot: ReactComponentClass[BadgeRootProps] = js.native
  
  @JSImport("@mui/material/Badge", "badgeClasses")
  @js.native
  val badgeClasses: BadgeClasses = js.native
  
  inline def getBadgeUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
