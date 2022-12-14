package com.olvind.mui.muiMaterial

import com.olvind.mui.emotionSerialize.mod.CSSInterpolation
import com.olvind.mui.emotionSerialize.mod.Keyframes
import com.olvind.mui.emotionUtils.mod.SerializedStyles
import com.olvind.mui.muiMaterial.anon.Css
import com.olvind.mui.muiMaterial.anon.NameProps
import com.olvind.mui.muiMaterial.anon.OmitThemepaletteCssVarsTheme
import com.olvind.mui.muiMaterial.anon.PropsWithChildrenPartialCssVarsProviderC
import com.olvind.mui.muiMaterial.anon.RecordSupportedColorSchemeColorSystem
import com.olvind.mui.muiMaterial.stylesAdaptV4ThemeMod.DeprecatedThemeOptions
import com.olvind.mui.muiMaterial.stylesCreateMixinsMod.Mixins
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.ThemeOptions
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Duration_
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Easing_
import com.olvind.mui.muiMaterial.stylesCreateTransitionsMod.Transitions
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.Typography
import com.olvind.mui.muiMaterial.stylesCreateTypographyMod.TypographyOptions
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.CssVarsPalette
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.CssVarsTheme
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.CssVarsThemeOptions
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.Opacity
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.Overlays
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.PaletteActionChannel
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.PaletteBackgroundChannel
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.PaletteColorChannel
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.PaletteCommonChannel
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.PaletteTextChannel
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.SupportedColorScheme
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.ThemeCssVar
import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.ThemeVars
import com.olvind.mui.muiMaterial.stylesResponsiveFontSizesMod.ResponsiveFontSizesOptions
import com.olvind.mui.muiMaterial.stylesShadowsMod.Shadows
import com.olvind.mui.muiMaterial.stylesThemeProviderMod.ThemeProviderProps
import com.olvind.mui.muiMaterial.stylesUseThemePropsMod.ThemeWithProps
import com.olvind.mui.muiMaterial.stylesUseThemePropsMod.ThemedProps
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndex
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiStyledEngine.styledEngineProviderStyledEngineProviderMod.StyledEngineProviderProps
import com.olvind.mui.muiSystem.colorManipulatorMod.ColorObject
import com.olvind.mui.muiSystem.createStyledMod.CreateMUIStyled
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.createThemeShapeMod.Shape
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Partial
import com.olvind.mui.std.Record
import com.olvind.mui.std.TemplateStringsArray
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enhance the theme types to include new properties from the CssVarsProvider.
  * The theme is typed with CSS variables in `styled`, `sx`, `useTheme`, etc.
  */
object stylesMod {
  
  @JSImport("@mui/material/styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(useColorScheme, getInitColorSchemeScript) */ inline def ExperimentalCssVarsProvider(props: PropsWithChildrenPartialCssVarsProviderC): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Experimental_CssVarsProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def StyledEngineProvider(props: StyledEngineProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyledEngineProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def adaptV4Theme(): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptV4Theme")().asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  inline def adaptV4Theme(options: DeprecatedThemeOptions): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptV4Theme")(options.asInstanceOf[js.Any]).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  
  inline def alpha(color: String, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alpha")(color.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createMuiTheme(options: ThemeOptions, args: js.Object*): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  inline def createMuiTheme(options: Unit, args: js.Object*): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createMuiTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  
  inline def createStyles(styles: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  inline def createTheme(options: ThemeOptions, args: js.Object*): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  inline def createTheme(options: Unit, args: js.Object*): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  
  inline def css(args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SerializedStyles]
  inline def css(template: TemplateStringsArray, args: CSSInterpolation*): SerializedStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[SerializedStyles]
  
  inline def darken(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("darken")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decomposeColor(color: String): ColorObject = ^.asInstanceOf[js.Dynamic].applyDynamic("decomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorObject]
  
  @JSImport("@mui/material/styles", "duration")
  @js.native
  val duration: Duration_ = js.native
  
  @JSImport("@mui/material/styles", "easing")
  @js.native
  val easing: Easing_ = js.native
  
  inline def emphasize(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def emphasize(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("emphasize")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def experimentalExtendTheme(options: CssVarsThemeOptions, args: js.Object*): OmitThemepaletteCssVarsTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_extendTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OmitThemepaletteCssVarsTheme]
  inline def experimentalExtendTheme(options: Unit, args: js.Object*): OmitThemepaletteCssVarsTheme = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_extendTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[OmitThemepaletteCssVarsTheme]
  
  /**
    * Custom styled utility that has a default MUI theme.
    * @param tag HTML tag or component that should serve as base.
    * @param options Styled options for the created component.
    * @returns React component that has styles attached to it.
    */
  @JSImport("@mui/material/styles", "experimentalStyled")
  @js.native
  val experimentalStyled: CreateMUIStyled[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] = js.native
  
  inline def experimentalSx(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("experimental_sx")().asInstanceOf[Any]
  
  inline def getContrastRatio(foreground: String, background: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(foreground.asInstanceOf[js.Any], background.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLuminance(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLuminance")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getOverlayAlpha(elevation: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOverlayAlpha")(elevation.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hexToRgb(hex: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hslToRgb(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hslToRgb")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keyframes(args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Keyframes]
  inline def keyframes(template: TemplateStringsArray, args: CSSInterpolation*): Keyframes = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(template.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Keyframes]
  
  inline def lighten(color: String, coefficient: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("lighten")(color.asInstanceOf[js.Any], coefficient.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeStyles(stylesCreator: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(stylesCreator.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def makeStyles(stylesCreator: Any, options: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(stylesCreator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def privateCreateTypography(palette: com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette, typography: TypographyOptions): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("private_createTypography")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  inline def privateCreateTypography(
    palette: com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette,
    typography: js.Function1[
      /* palette */ com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette, 
      TypographyOptions
    ]
  ): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("private_createTypography")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  
  inline def privateExcludeVariablesFromRoot(cssVarPrefix: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("private_excludeVariablesFromRoot")(cssVarPrefix.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def recomposeColor(color: ColorObject): String = ^.asInstanceOf[js.Dynamic].applyDynamic("recomposeColor")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def responsiveFontSizes(theme: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any]).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  inline def responsiveFontSizes(theme: com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme, options: ResponsiveFontSizesOptions): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("responsiveFontSizes")(theme.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  
  inline def rgbToHex(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("rgbToHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def shouldSkipGeneratingVar(keys: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldSkipGeneratingVar")(keys.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Custom styled utility that has a default MUI theme.
    * @param tag HTML tag or component that should serve as base.
    * @param options Styled options for the created component.
    * @returns React component that has styles attached to it.
    */
  @JSImport("@mui/material/styles", "styled")
  @js.native
  val styled: CreateMUIStyled[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme] = js.native
  
  inline def unstableCreateMuiStrictModeTheme(options: ThemeOptions, args: js.Object*): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  inline def unstableCreateMuiStrictModeTheme(options: Unit, args: js.Object*): com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_createMuiStrictModeTheme")(scala.List(options.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme]
  
  inline def unstableGetUnit(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_getUnit")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unstableToUnitless(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_toUnitless")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  inline def useThemeProps[Theme /* <: ThemeWithProps */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("useThemeProps")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  inline def withStyles(stylesCreator: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(stylesCreator.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  inline def withStyles(stylesCreator: Any, options: js.Object): scala.Nothing = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(stylesCreator.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Nothing]
  
  inline def withTheme(Component: Any): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  type ClassNameMap[ClassKey /* <: String */] = Record[ClassKey, String]
  
  // Extend the type that will be used in palette
  type CommonColors = PaletteCommonChannel
  
  // The extended Palette should be in sync with `extendTheme`
  type Palette = CssVarsPalette
  
  type PaletteColor = PaletteColorChannel
  
  trait StyledComponentProps[ClassKey /* <: String */] extends StObject {
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[Partial[ClassNameMap[ClassKey]]] = js.undefined
  }
  object StyledComponentProps {
    
    inline def apply[ClassKey /* <: String */](): StyledComponentProps[ClassKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledComponentProps[ClassKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyledComponentProps[?], ClassKey /* <: String */] (val x: Self & StyledComponentProps[ClassKey]) extends AnyVal {
      
      inline def setClasses(value: Partial[ClassNameMap[ClassKey]]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    }
  }
  
  // The palette must be extended in each node.
  /* Inlined parent std.Omit<@mui/material.@mui/material/styles.CssVarsTheme, 'palette'> */
  trait Theme extends StObject {
    
    var breakpints: Breakpoints
    
    var colorSchemes: RecordSupportedColorSchemeColorSystem
    
    var cssVarPrefix: String
    
    var generateCssVars: js.Function1[/* colorScheme */ js.UndefOr[SupportedColorScheme], Css]
    
    var getColorSchemeSelector: js.Function1[/* colorScheme */ SupportedColorScheme, String]
    
    var getCssVar: js.Function2[/* field */ ThemeCssVar, /* repeated */ ThemeCssVar, String]
    
    var mixins: Mixins
    
    var opacity: Opacity
    
    var overlays: Overlays
    
    var shadows: Shadows
    
    var shape: Shape
    
    var shouldSkipGeneratingVar: js.Function2[/* keys */ js.Array[String], /* value */ String | Double, Boolean]
    
    var spacing: Spacing
    
    var transitions: Transitions
    
    var typography: Typography
    
    var unstable_sx: js.Function1[/* props */ SxProps[CssVarsTheme], CSSObject]
    
    var unstable_sxConfig: SxConfig
    
    var vars: ThemeVars
    
    var zIndex: ZIndex
  }
  object Theme {
    
    inline def apply(
      breakpints: Breakpoints,
      colorSchemes: RecordSupportedColorSchemeColorSystem,
      cssVarPrefix: String,
      generateCssVars: /* colorScheme */ js.UndefOr[SupportedColorScheme] => Css,
      getColorSchemeSelector: /* colorScheme */ SupportedColorScheme => String,
      getCssVar: (/* field */ ThemeCssVar, /* repeated */ ThemeCssVar) => String,
      mixins: Mixins,
      opacity: Opacity,
      overlays: Overlays,
      shadows: Shadows,
      shape: Shape,
      shouldSkipGeneratingVar: (/* keys */ js.Array[String], /* value */ String | Double) => Boolean,
      spacing: Spacing,
      transitions: Transitions,
      typography: Typography,
      unstable_sx: /* props */ SxProps[CssVarsTheme] => CSSObject,
      unstable_sxConfig: SxConfig,
      vars: ThemeVars,
      zIndex: ZIndex
    ): Theme = {
      val __obj = js.Dynamic.literal(breakpints = breakpints.asInstanceOf[js.Any], colorSchemes = colorSchemes.asInstanceOf[js.Any], cssVarPrefix = cssVarPrefix.asInstanceOf[js.Any], generateCssVars = js.Any.fromFunction1(generateCssVars), getColorSchemeSelector = js.Any.fromFunction1(getColorSchemeSelector), getCssVar = js.Any.fromFunction2(getCssVar), mixins = mixins.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], shouldSkipGeneratingVar = js.Any.fromFunction2(shouldSkipGeneratingVar), spacing = spacing.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], typography = typography.asInstanceOf[js.Any], unstable_sx = js.Any.fromFunction1(unstable_sx), unstable_sxConfig = unstable_sxConfig.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      inline def setBreakpints(value: Breakpoints): Self = StObject.set(x, "breakpints", value.asInstanceOf[js.Any])
      
      inline def setColorSchemes(value: RecordSupportedColorSchemeColorSystem): Self = StObject.set(x, "colorSchemes", value.asInstanceOf[js.Any])
      
      inline def setCssVarPrefix(value: String): Self = StObject.set(x, "cssVarPrefix", value.asInstanceOf[js.Any])
      
      inline def setGenerateCssVars(value: /* colorScheme */ js.UndefOr[SupportedColorScheme] => Css): Self = StObject.set(x, "generateCssVars", js.Any.fromFunction1(value))
      
      inline def setGetColorSchemeSelector(value: /* colorScheme */ SupportedColorScheme => String): Self = StObject.set(x, "getColorSchemeSelector", js.Any.fromFunction1(value))
      
      inline def setGetCssVar(value: (/* field */ ThemeCssVar, /* repeated */ ThemeCssVar) => String): Self = StObject.set(x, "getCssVar", js.Any.fromFunction2(value))
      
      inline def setMixins(value: Mixins): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Opacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOverlays(value: Overlays): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysVarargs(value: Any*): Self = StObject.set(x, "overlays", js.Array(value*))
      
      inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShouldSkipGeneratingVar(value: (/* keys */ js.Array[String], /* value */ String | Double) => Boolean): Self = StObject.set(x, "shouldSkipGeneratingVar", js.Any.fromFunction2(value))
      
      inline def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setTransitions(value: Transitions): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTypography(value: Typography): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setUnstable_sx(value: /* props */ SxProps[CssVarsTheme] => CSSObject): Self = StObject.set(x, "unstable_sx", js.Any.fromFunction1(value))
      
      inline def setUnstable_sxConfig(value: SxConfig): Self = StObject.set(x, "unstable_sxConfig", value.asInstanceOf[js.Any])
      
      inline def setVars(value: ThemeVars): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeAction = PaletteActionChannel
  
  type TypeBackground = PaletteBackgroundChannel
  
  type TypeText = PaletteTextChannel
}
