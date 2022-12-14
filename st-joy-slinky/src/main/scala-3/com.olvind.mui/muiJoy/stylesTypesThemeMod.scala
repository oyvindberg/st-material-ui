package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ColorScheme
import com.olvind.mui.muiJoy.anon.Css
import com.olvind.mui.muiJoy.anon.RecordDefaultColorSchemeExtendedColorSch
import com.olvind.mui.muiJoy.anon.ThicknessString
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.DefaultColorScheme
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.ExtendedColorScheme
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.Palette
import com.olvind.mui.muiJoy.stylesTypesFocusMod.Focus
import com.olvind.mui.muiJoy.stylesTypesRadiusMod.Radius
import com.olvind.mui.muiJoy.stylesTypesShadowMod.Shadow
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.FontFamily
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.FontSize
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.FontWeight
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.LetterSpacing
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.LineHeight
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.TypographySystem
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.ColorInversion
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.ColorInversionConfig
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.Variants
import com.olvind.mui.muiJoy.stylesTypesZIndexMod.ZIndex
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesThemeMod {
  
  /* Inlined parent std.Omit<@mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem, 'palette'> */
  trait ColorSystemVars extends StObject {
    
    var palette: Omit[Palette, "mode"]
    
    var shadowChannel: String
    
    var shadowRing: String
  }
  object ColorSystemVars {
    
    inline def apply(palette: Omit[Palette, "mode"], shadowChannel: String, shadowRing: String): ColorSystemVars = {
      val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSystemVars]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorSystemVars] (val x: Self) extends AnyVal {
      
      inline def setPalette(value: Omit[Palette, "mode"]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setShadowChannel(value: String): Self = StObject.set(x, "shadowChannel", value.asInstanceOf[js.Any])
      
      inline def setShadowRing(value: String): Self = StObject.set(x, "shadowRing", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Record<string | number, infer V> ? keyof T extends string | number ? V extends string | number ? keyof T : keyof V extends string | number ? / * template literal string: ${keyofT}${D}${ConcatDeep<Split<V>,D>} * / string : never : never : never
    }}}
    */
  type ConcatDeep[T, D /* <: String */] = /* keyof T */ String
  
  /**
    * Does not work for these cases:
    * - { borderRadius: string | number } // the value can't be a union
    * - { shadows: [string, string, ..., string] } // the value can't be an array
    */
  type NormalizeVars[T, D /* <: String */] = ConcatDeep[Split[T, /* keyof T */ String], D]
  
  /* Inlined parent std.Omit<@mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem, 'palette'> */
  trait RuntimeColorSystem extends StObject {
    
    var palette: Palette & ColorScheme
    
    var shadowChannel: String
    
    var shadowRing: String
  }
  object RuntimeColorSystem {
    
    inline def apply(palette: Palette & ColorScheme, shadowChannel: String, shadowRing: String): RuntimeColorSystem = {
      val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeColorSystem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeColorSystem] (val x: Self) extends AnyVal {
      
      inline def setPalette(value: Palette & ColorScheme): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setShadowChannel(value: String): Self = StObject.set(x, "shadowChannel", value.asInstanceOf[js.Any])
      
      inline def setShadowRing(value: String): Self = StObject.set(x, "shadowRing", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    K extends string | number ? {[ k in K ]: std.Exclude<T[K], undefined>} : never
    }}}
    */
  @js.native
  trait Split[T, K /* <: /* keyof T */ String */] extends StObject
  
  type SxProps = com.olvind.mui.muiSystem.styleFunctionSxStyleFunctionSxMod.SxProps[Theme]
  
  type SystemProps = com.olvind.mui.muiSystem.boxBoxMod.SystemProps[Theme]
  
  type TextColor = (NormalizeVars[Omit[Palette, "mode"], "."]) | (String & (Record[scala.Nothing, scala.Nothing]))
  
  @js.native
  trait Theme
    extends StObject
       with ThemeScales
       with RuntimeColorSystem {
    
    var breakpoints: Breakpoints = js.native
    
    var colorInversion: ColorInversion = js.native
    
    var colorInversionConfig: ColorInversionConfig = js.native
    
    var colorSchemes: RecordDefaultColorSchemeExtendedColorSch = js.native
    
    var cssVarPrefix: String = js.native
    
    @JSName("focus")
    var focus_Theme: Focus = js.native
    
    def generateCssVars(): Css = js.native
    def generateCssVars(colorScheme: DefaultColorScheme): Css = js.native
    def generateCssVars(colorScheme: ExtendedColorScheme): Css = js.native
    
    def getColorSchemeSelector(colorScheme: DefaultColorScheme): String = js.native
    def getColorSchemeSelector(colorScheme: ExtendedColorScheme): String = js.native
    
    def getCssVar(field: ThemeCssVar, vars: ThemeCssVar*): String = js.native
    
    /**
      * A function to determine if the key, value should be attached as CSS Variable
      * `keys` is an array that represents the object path keys.
      *  Ex, if the theme is { foo: { bar: 'var(--test)' } }
      *  then, keys = ['foo', 'bar']
      *        value = 'var(--test)'
      */
    def shouldSkipGeneratingVar(keys: js.Array[String], value: String): Boolean = js.native
    def shouldSkipGeneratingVar(keys: js.Array[String], value: Double): Boolean = js.native
    
    var spacing: Spacing = js.native
    
    var typography: TypographySystem = js.native
    
    def unstable_sx(props: SxProps): CSSObject = js.native
    
    var unstable_sxConfig: SxConfig = js.native
    
    var variants: Variants = js.native
    
    var vars: ThemeVars = js.native
  }
  
  type ThemeCssVar = OverridableStringUnion[NormalizeVars[ThemeVars, "-"], ThemeCssVarOverrides]
  
  trait ThemeCssVarOverrides extends StObject
  
  trait ThemeScales extends StObject {
    
    var focus: ThicknessString
    
    var fontFamily: FontFamily
    
    var fontSize: FontSize
    
    var fontWeight: FontWeight
    
    var letterSpacing: LetterSpacing
    
    var lineHeight: LineHeight
    
    var radius: Radius
    
    var shadow: Shadow
    
    var zIndex: ZIndex
  }
  object ThemeScales {
    
    inline def apply(
      focus: ThicknessString,
      fontFamily: FontFamily,
      fontSize: FontSize,
      fontWeight: FontWeight,
      letterSpacing: LetterSpacing,
      lineHeight: LineHeight,
      radius: Radius,
      shadow: Shadow,
      zIndex: ZIndex
    ): ThemeScales = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeScales]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeScales] (val x: Self) extends AnyVal {
      
      inline def setFocus(value: ThicknessString): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: FontSize): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: LetterSpacing): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: LineHeight): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Radius): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setShadow(value: Shadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @mui/joy.@mui/joy/styles/types/utils.MergeDefault<@mui/joy.@mui/joy/styles/types/theme.ThemeScales, {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}> */
  trait ThemeScalesOptions extends StObject {
    
    var focus: /* import warning: importer.ImportType#apply Failed type conversion: 'focus' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? any | undefined & {  thickness :string} : {  thickness :string} */ js.Any
    
    var fontFamily: /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily */ js.Any
    
    var fontSize: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize */ js.Any
    
    var fontWeight: /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight */ js.Any
    
    var letterSpacing: /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing */ js.Any
    
    var lineHeight: /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight */ js.Any
    
    var radius: /* import warning: importer.ImportType#apply Failed type conversion: 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius */ js.Any
    
    var shadow: /* import warning: importer.ImportType#apply Failed type conversion: 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow */ js.Any
    
    var zIndex: /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex */ js.Any
  }
  object ThemeScalesOptions {
    
    inline def apply(
      focus: /* import warning: importer.ImportType#apply Failed type conversion: 'focus' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? any | undefined & {  thickness :string} : {  thickness :string} */ js.Any,
      fontFamily: /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily */ js.Any,
      fontSize: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize */ js.Any,
      fontWeight: /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight */ js.Any,
      letterSpacing: /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing */ js.Any,
      lineHeight: /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight */ js.Any,
      radius: /* import warning: importer.ImportType#apply Failed type conversion: 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius */ js.Any,
      shadow: /* import warning: importer.ImportType#apply Failed type conversion: 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow */ js.Any,
      zIndex: /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex */ js.Any
    ): ThemeScalesOptions = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeScalesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeScalesOptions] (val x: Self) extends AnyVal {
      
      inline def setFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'focus' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? any | undefined & {  thickness :string} : {  thickness :string} */ js.Any
      ): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFontFamily(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily */ js.Any
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize */ js.Any
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight */ js.Any
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing */ js.Any
      ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight */ js.Any
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius */ js.Any
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow */ js.Any
      ): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setZIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex */ js.Any
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThemeVars
    extends StObject
       with ThemeScales
       with ColorSystemVars
  object ThemeVars {
    
    inline def apply(
      focus: ThicknessString,
      fontFamily: FontFamily,
      fontSize: FontSize,
      fontWeight: FontWeight,
      letterSpacing: LetterSpacing,
      lineHeight: LineHeight,
      palette: Omit[Palette, "mode"],
      radius: Radius,
      shadow: Shadow,
      shadowChannel: String,
      shadowRing: String,
      zIndex: ZIndex
    ): ThemeVars = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeVars]
    }
  }
}
