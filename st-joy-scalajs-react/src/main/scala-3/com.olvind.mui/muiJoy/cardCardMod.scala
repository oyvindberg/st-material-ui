package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCardTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCardMod extends Shortcut {
  
  @JSImport("@mui/joy/Card/Card", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `cardCardMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element | Null] = default
}
