package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTypographyTypeMapsp
import com.olvind.mui.react.mod.Context
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTypographyMod extends Shortcut {
  
  @JSImport("@mui/joy/Typography/Typography", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element | Null] = js.native
  
  @JSImport("@mui/joy/Typography/Typography", "TypographyContext")
  @js.native
  val TypographyContext: Context[Boolean] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `typographyTypographyMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element | Null] = default
}
