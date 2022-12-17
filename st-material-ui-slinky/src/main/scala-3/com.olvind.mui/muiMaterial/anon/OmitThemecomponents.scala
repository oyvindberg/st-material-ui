package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.Mixins
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Transitions
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

/* Inlined std.Omit<@mui/material.@mui/material/styles/createTheme.Theme, 'components'> */
trait OmitThemecomponents extends StObject {
  
  var breakpoints: Breakpoints
  
  var direction: com.olvind.mui.muiSystem.createThemeCreateThemeMod.Direction
  
  var mixins: Mixins
  
  var palette: Palette
  
  var shadows: Shadows
  
  var shape: Shape
  
  var spacing: Spacing
  
  var transitions: Transitions
  
  var typography: com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography
  
  var unstable_strictMode: js.UndefOr[Boolean] = js.undefined
  
  var unstable_sx: js.Function1[/* props */ SxProps[Theme], CSSObject]
  
  var unstable_sxConfig: SxConfig
  
  var zIndex: ZIndex
}
object OmitThemecomponents {
  
  inline def apply(
    breakpoints: Breakpoints,
    direction: com.olvind.mui.muiSystem.createThemeCreateThemeMod.Direction,
    mixins: Mixins,
    palette: Palette,
    shadows: Shadows,
    shape: Shape,
    spacing: Spacing,
    transitions: Transitions,
    typography: com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography,
    unstable_sx: /* props */ SxProps[Theme] => CSSObject,
    unstable_sxConfig: SxConfig,
    zIndex: ZIndex
  ): OmitThemecomponents = {
    val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], unstable_sx = js.Any.fromFunction1(unstable_sx), unstable_sxConfig = unstable_sxConfig.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitThemecomponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitThemecomponents] (val x: Self) extends AnyVal {
    
    inline def setBreakpoints(value: Breakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: com.olvind.mui.muiSystem.createThemeCreateThemeMod.Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setMixins(value: Mixins): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setTransitions(value: Transitions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTypography(value: com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
    
    inline def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
    
    inline def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
    
    inline def setUnstable_sx(value: /* props */ SxProps[Theme] => CSSObject): Self = StObject.set(x, "unstable_sx", js.Any.fromFunction1(value))
    
    inline def setUnstable_sxConfig(value: SxConfig): Self = StObject.set(x, "unstable_sxConfig", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
