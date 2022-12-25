package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiSystem.createStyledMod.CreateMUIStyled
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesStyledMod extends Shortcut {
  
  @JSImport("@mui/joy/styles/styled", JSImport.Default)
  @js.native
  val default: CreateMUIStyled[Theme] = js.native
  
  type _To = CreateMUIStyled[Theme]
  
  /* This means you don't have to write `default`, but can instead just say `stylesStyledMod.foo` */
  override def _to: CreateMUIStyled[Theme] = default
}
