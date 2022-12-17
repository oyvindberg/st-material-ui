package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.Mixins
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Transitions
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.CssVarsPalette
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.CssVarsTheme
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.Opacity
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.Overlays
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.SupportedColorScheme
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.ThemeCssVar
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.ThemeVars
import com.olvind.mui.muiMaterial.stylesShadowsMod.Shadows
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndex
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.createThemeShapeMod.Shape
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined Omit<Theme, 'components' | 'palette'> & @mui/material.@mui/material/styles/experimental_extendTheme.CssVarsTheme */
@js.native
trait OmitThemecomponentspaletteCssVarsTheme extends StObject {
  
  var breakpints: Breakpoints = js.native
  
  var breakpoints: Breakpoints = js.native
  
  var colorSchemes: RecordSupportedColorSchemeColorSystem = js.native
  
  var cssVarPrefix: String = js.native
  
  var direction: com.olvind.mui.muiSystem.createThemeCreateThemeMod.Direction = js.native
  
  def getColorSchemeSelector(colorScheme: SupportedColorScheme): String = js.native
  
  def getCssVar(field: ThemeCssVar, vars: ThemeCssVar*): String = js.native
  
  var mixins: Mixins = js.native
  
  var opacity: Opacity = js.native
  
  var overlays: Overlays = js.native
  
  var palette: Palette & CssVarsPalette = js.native
  
  var shadows: Shadows = js.native
  
  var shape: Shape = js.native
  
  // Default theme tokens
  var spacing: Spacing = js.native
  
  var transitions: Transitions = js.native
  
  var typography: com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography = js.native
  
  var unstable_strictMode: js.UndefOr[Boolean] = js.native
  
  var unstable_sx: js.Function1[/* props */ SxProps[Theme], CSSObject] = js.native
  def unstable_sx(props: SxProps[CssVarsTheme]): CSSObject = js.native
  
  var unstable_sxConfig: SxConfig = js.native
  
  var vars: ThemeVars = js.native
  
  var zIndex: ZIndex = js.native
}
