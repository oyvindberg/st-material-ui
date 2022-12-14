package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import com.olvind.mui.muiMaterial.anon.RecordSupportedColorSchemeColorSystem
import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.Mixins
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Transitions
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography
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

trait CssVarsTheme
  extends StObject
     with ColorSystem {
  
  var breakpints: Breakpoints
  
  var colorSchemes: RecordSupportedColorSchemeColorSystem
  
  var cssVarPrefix: String
  
  def getColorSchemeSelector(colorScheme: SupportedColorScheme): String
  
  def getCssVar(field: ThemeCssVar, vars: ThemeCssVar*): String
  
  var mixins: Mixins
  
  var shadows: Shadows
  
  var shape: Shape
  
  // Default theme tokens
  var spacing: Spacing
  
  var transitions: Transitions
  
  var typography: Typography
  
  def unstable_sx(props: SxProps[CssVarsTheme]): CSSObject
  
  var unstable_sxConfig: SxConfig
  
  var vars: ThemeVars
  
  var zIndex: ZIndex
}
object CssVarsTheme {
  
  inline def apply(
    breakpints: Breakpoints,
    colorSchemes: RecordSupportedColorSchemeColorSystem,
    cssVarPrefix: String,
    getColorSchemeSelector: SupportedColorScheme => String,
    getCssVar: (ThemeCssVar, /* repeated */ ThemeCssVar) => String,
    mixins: Mixins,
    opacity: Opacity,
    overlays: Overlays,
    palette: Palette & CssVarsPalette,
    shadows: Shadows,
    shape: Shape,
    spacing: Spacing,
    transitions: Transitions,
    typography: Typography,
    unstable_sx: SxProps[CssVarsTheme] => CSSObject,
    unstable_sxConfig: SxConfig,
    vars: ThemeVars,
    zIndex: ZIndex
  ): CssVarsTheme = {
    val __obj = js.Dynamic.literal(breakpints = breakpints.asInstanceOf[js.Any], colorSchemes = colorSchemes.asInstanceOf[js.Any], cssVarPrefix = cssVarPrefix.asInstanceOf[js.Any], getColorSchemeSelector = js.Any.fromFunction1(getColorSchemeSelector), getCssVar = js.Any.fromFunction2(getCssVar), mixins = mixins.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], unstable_sx = js.Any.fromFunction1(unstable_sx), unstable_sxConfig = unstable_sxConfig.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssVarsTheme]
  }
  
  extension [Self <: CssVarsTheme](x: Self) {
    
    inline def setBreakpints(value: Breakpoints): Self = StObject.set(x, "breakpints", value.asInstanceOf[js.Any])
    
    inline def setColorSchemes(value: RecordSupportedColorSchemeColorSystem): Self = StObject.set(x, "colorSchemes", value.asInstanceOf[js.Any])
    
    inline def setCssVarPrefix(value: String): Self = StObject.set(x, "cssVarPrefix", value.asInstanceOf[js.Any])
    
    inline def setGetColorSchemeSelector(value: SupportedColorScheme => String): Self = StObject.set(x, "getColorSchemeSelector", js.Any.fromFunction1(value))
    
    inline def setGetCssVar(value: (ThemeCssVar, /* repeated */ ThemeCssVar) => String): Self = StObject.set(x, "getCssVar", js.Any.fromFunction2(value))
    
    inline def setMixins(value: Mixins): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: Transitions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setUnstable_sx(value: SxProps[CssVarsTheme] => CSSObject): Self = StObject.set(x, "unstable_sx", js.Any.fromFunction1(value))
    
    inline def setUnstable_sxConfig(value: SxConfig): Self = StObject.set(x, "unstable_sxConfig", value.asInstanceOf[js.Any])
    
    inline def setVars(value: ThemeVars): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
