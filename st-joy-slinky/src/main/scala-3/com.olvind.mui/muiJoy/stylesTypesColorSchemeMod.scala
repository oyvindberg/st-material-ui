package com.olvind.mui.muiJoy

import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesColorSchemeMod {
  
  trait ColorSchemeOverrides extends StObject
  
  object DefaultColorScheme {
    
    inline def dark: "dark" = "dark".asInstanceOf["dark"]
    
    inline def light: "light" = "light".asInstanceOf["light"]
  }
  type DefaultColorScheme = "light" | "dark"
  
  type ExtendedColorScheme = OverridableStringUnion[scala.Nothing, ColorSchemeOverrides]
  
  type SupportedColorScheme = DefaultColorScheme | ExtendedColorScheme
}
