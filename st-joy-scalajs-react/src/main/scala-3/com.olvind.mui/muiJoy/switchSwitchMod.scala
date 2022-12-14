package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsSwitchTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchSwitchMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Switch](https://mui.com/joy-ui/react-switch/)
    *
    * API:
    *
    * - [Switch API](https://mui.com/joy-ui/api/switch/)
    */
  @JSImport("@mui/joy/Switch/Switch", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsSwitchTypeMapdiv, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsSwitchTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `switchSwitchMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsSwitchTypeMapdiv, Element | Null] = default
}
