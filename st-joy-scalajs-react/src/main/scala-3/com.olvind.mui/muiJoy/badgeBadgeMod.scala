package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsBadgeTypeMapspan
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object badgeBadgeMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Badge](https://mui.com/joy-ui/react-badge/)
    *
    * API:
    *
    * - [Badge API](https://mui.com/joy-ui/api/badge/)
    */
  @JSImport("@mui/joy/Badge/Badge", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `badgeBadgeMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBadgeTypeMapspan, Element | Null] = default
}
