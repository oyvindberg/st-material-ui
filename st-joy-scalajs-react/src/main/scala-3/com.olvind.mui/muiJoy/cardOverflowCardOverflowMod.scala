package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCardOverflowTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardOverflowCardOverflowMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/joy-ui/react-card/)
    *
    * API:
    *
    * - [CardOverflow API](https://mui.com/joy-ui/api/card-overflow/)
    */
  @JSImport("@mui/joy/CardOverflow/CardOverflow", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardOverflowTypeMap, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardOverflowTypeMap, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `cardOverflowCardOverflowMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardOverflowTypeMap, Element | Null] = default
}
