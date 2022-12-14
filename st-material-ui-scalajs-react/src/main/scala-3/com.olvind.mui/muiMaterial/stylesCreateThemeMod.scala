package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.OmitThemecomponents
import com.olvind.mui.muiMaterial.stylesComponentsMod.Components
import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.Mixins
import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.MixinsOptions
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.PaletteOptions
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Transitions
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.TransitionsOptions
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.stylesShadowsMod.Shadows
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndex
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndexOptions
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.BreakpointsOptions
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.SpacingOptions
import com.olvind.mui.muiSystem.createThemeCreateThemeMod.Direction
import com.olvind.mui.muiSystem.createThemeShapeMod.Shape
import com.olvind.mui.muiSystem.createThemeShapeMod.ShapeOptions
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesCreateThemeMod {
  
  @JSImport("@mui/material/styles/createTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def default(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  inline def createMuiTheme(options: ThemeOptions, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  inline def createMuiTheme(options: Unit, args: js.Object*): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Theme]
  
  trait BaseTheme
    extends StObject
       with com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme {
    
    @JSName("mixins")
    var mixins_BaseTheme: Mixins
    
    @JSName("palette")
    var palette_BaseTheme: Palette
    
    @JSName("shadows")
    var shadows_BaseTheme: Shadows
    
    @JSName("transitions")
    var transitions_BaseTheme: Transitions
    
    @JSName("typography")
    var typography_BaseTheme: Typography
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.undefined
    
    @JSName("zIndex")
    var zIndex_BaseTheme: ZIndex
  }
  object BaseTheme {
    
    inline def apply(
      breakpoints: Breakpoints,
      direction: Direction,
      mixins: Mixins,
      palette: Palette,
      shadows: Shadows,
      shape: Shape,
      spacing: Spacing,
      transitions: Transitions,
      typography: Typography,
      unstable_sx: SxProps[com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme] => CSSObject,
      unstable_sxConfig: SxConfig,
      zIndex: ZIndex
    ): BaseTheme = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], unstable_sx = js.Any.fromFunction1(unstable_sx), unstable_sxConfig = unstable_sxConfig.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTheme]
    }
    
    extension [Self <: BaseTheme](x: Self) {
      
      inline def setMixins(value: Mixins): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
      
      inline def setTransitions(value: Transitions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme
    extends StObject
       with BaseTheme {
    
    @JSName("components")
    var components_Theme: js.UndefOr[Components[BaseTheme]] = js.undefined
  }
  object Theme {
    
    inline def apply(
      breakpoints: Breakpoints,
      direction: Direction,
      mixins: Mixins,
      palette: Palette,
      shadows: Shadows,
      shape: Shape,
      spacing: Spacing,
      transitions: Transitions,
      typography: Typography,
      unstable_sx: SxProps[com.olvind.mui.muiSystem.createThemeCreateThemeMod.Theme] => CSSObject,
      unstable_sxConfig: SxConfig,
      zIndex: ZIndex
    ): Theme = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], unstable_sx = js.Any.fromFunction1(unstable_sx), unstable_sxConfig = unstable_sxConfig.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setComponents(value: Components[BaseTheme]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<@mui/system.@mui/system.ThemeOptions, 'zIndex'> */
  trait ThemeOptions extends StObject {
    
    var breakpoints: js.UndefOr[BreakpointsOptions] = js.undefined
    
    var components: js.UndefOr[Components[OmitThemecomponents]] = js.undefined
    
    var direction: js.UndefOr[Direction] = js.undefined
    
    var mixins: js.UndefOr[MixinsOptions] = js.undefined
    
    var palette: js.UndefOr[PaletteOptions] = js.undefined
    
    var shadows: js.UndefOr[Shadows] = js.undefined
    
    var shape: js.UndefOr[ShapeOptions] = js.undefined
    
    var spacing: js.UndefOr[SpacingOptions] = js.undefined
    
    var transitions: js.UndefOr[TransitionsOptions] = js.undefined
    
    var typography: js.UndefOr[TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])] = js.undefined
    
    var unstable_strictMode: js.UndefOr[Boolean] = js.undefined
    
    var unstable_sxConfig: js.UndefOr[SxConfig] = js.undefined
    
    var zIndex: js.UndefOr[ZIndexOptions] = js.undefined
  }
  object ThemeOptions {
    
    inline def apply(): ThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeOptions]
    }
    
    extension [Self <: ThemeOptions](x: Self) {
      
      inline def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setComponents(value: Components[OmitThemecomponents]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setMixins(value: MixinsOptions): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      inline def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
      
      inline def setShape(value: ShapeOptions): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingFunction1(value: (/* abs */ Double) | String => Double | String): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpacingVarargs(value: (String | Double)*): Self = StObject.set(x, "spacing", js.Array(value*))
      
      inline def setTransitions(value: TransitionsOptions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTypography(value: TypographyOptions | (js.Function1[/* palette */ Palette, TypographyOptions])): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyFunction1(value: /* palette */ Palette => TypographyOptions): Self = StObject.set(x, "typography", js.Any.fromFunction1(value))
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      inline def setUnstable_strictMode(value: Boolean): Self = StObject.set(x, "unstable_strictMode", value.asInstanceOf[js.Any])
      
      inline def setUnstable_strictModeUndefined: Self = StObject.set(x, "unstable_strictMode", js.undefined)
      
      inline def setUnstable_sxConfig(value: SxConfig): Self = StObject.set(x, "unstable_sxConfig", value.asInstanceOf[js.Any])
      
      inline def setUnstable_sxConfigUndefined: Self = StObject.set(x, "unstable_sxConfig", js.undefined)
      
      inline def setZIndex(value: ZIndexOptions): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
