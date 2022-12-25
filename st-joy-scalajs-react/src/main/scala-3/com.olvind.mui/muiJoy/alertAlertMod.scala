package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsAlertTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertAlertMod extends Shortcut {
  
  @JSImport("@mui/joy/Alert/Alert", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsAlertTypeMapdiv, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsAlertTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `alertAlertMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsAlertTypeMapdiv, Element | Null] = default
}
