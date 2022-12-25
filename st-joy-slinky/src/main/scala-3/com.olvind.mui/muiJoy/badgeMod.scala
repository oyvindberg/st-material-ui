package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.muiJoy.badgeBadgeClassesMod.BadgeClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeMod {
  
  @JSImport("@mui/joy/Badge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Badge", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element | Null] = js.native
  
  @JSImport("@mui/joy/Badge", "badgeClasses")
  @js.native
  val badgeClasses: BadgeClasses = js.native
  
  inline def getBadgeUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
