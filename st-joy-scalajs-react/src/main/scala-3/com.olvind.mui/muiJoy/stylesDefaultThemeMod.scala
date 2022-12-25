package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.OmitCssVarsThemeOptionscolorSchemesColor
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesDefaultThemeMod {
  
  @JSImport("@mui/joy/styles/defaultTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/styles/defaultTheme", JSImport.Default)
  @js.native
  val default: Theme = js.native
  
  inline def getThemeWithVars(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeWithVars")().asInstanceOf[Theme]
  inline def getThemeWithVars(themeInput: OmitCssVarsThemeOptionscolorSchemesColor): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeWithVars")(themeInput.asInstanceOf[js.Any]).asInstanceOf[Theme]
}
