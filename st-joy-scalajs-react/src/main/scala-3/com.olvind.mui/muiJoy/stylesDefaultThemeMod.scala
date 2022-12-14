package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesDefaultThemeMod extends Shortcut {
  
  @JSImport("@mui/joy/styles/defaultTheme", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  type _To = Theme
  
  /* This means you don't have to write `default`, but can instead just say `stylesDefaultThemeMod.foo` */
  override def _to: Theme = default
}
