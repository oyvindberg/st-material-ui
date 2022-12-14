package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsLinkTypeMapa
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkLinkMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Link](https://mui.com/joy-ui/react-link/)
    *
    * API:
    *
    * - [Link API](https://mui.com/joy-ui/api/link/)
    */
  @JSImport("@mui/joy/Link/Link", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `linkLinkMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsLinkTypeMapa, Element | Null] = default
}
