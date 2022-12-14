package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Partial2LevelColorInversion
import com.olvind.mui.muiJoy.anon.Partial2LevelVariants
import com.olvind.mui.muiJoy.anon.PartialFocus
import com.olvind.mui.muiJoy.anon.PartialRecordDefaultColorSchemeExtendedC
import com.olvind.mui.muiJoy.stylesComponentsMod.Components
import com.olvind.mui.muiJoy.stylesTypesThemeMod.Theme
import com.olvind.mui.muiJoy.stylesTypesThemeMod.ThemeCssVar
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.TypographySystemOptions
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.ColorInversionConfig
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.BreakpointsOptions
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.SpacingOptions
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesExtendThemeMod {
  
  @JSImport("@mui/joy/styles/extendTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Theme]
  inline def default(themeOptions: CssVarsThemeOptions): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(themeOptions.asInstanceOf[js.Any]).asInstanceOf[Theme]
  
  inline def createGetCssVar(): js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGetCssVar")().asInstanceOf[js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ]]
  inline def createGetCssVar(cssVarPrefix: String): js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGetCssVar")(cssVarPrefix.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* field */ ThemeCssVar | scala.Nothing, 
    /* repeated */ ThemeCssVar | scala.Nothing, 
    String
  ]]
  
  /* Inlined @mui/joy.@mui/joy/styles/extendTheme.Partial3Level<@mui/joy.@mui/joy/styles/types/utils.MergeDefault<@mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem, {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}>> & {  shadowRing :string | undefined,   shadowChannel :string | undefined} */
  trait ColorSystemOptions extends StObject {
    
    var palette: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ J in any | undefined ]:? 'palette' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions & @mui/joy.@mui/joy/styles/types/colorSystem.Palette : @mui/joy.@mui/joy/styles/types/colorSystem.Palette[J] extends std.Record<any, any>? {[ P in any | undefined[J] ]:? 'palette' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions & @mui/joy.@mui/joy/styles/types/colorSystem.Palette : @mui/joy.@mui/joy/styles/types/colorSystem.Palette[J][P]} : 'palette' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions & @mui/joy.@mui/joy/styles/types/colorSystem.Palette : @mui/joy.@mui/joy/styles/types/colorSystem.Palette[J]} */ js.Any
      ] = js.undefined
    
    var shadowChannel: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ J in any | undefined ]:? 'shadowChannel' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J] extends std.Record<any, any>? {[ P in any | undefined[J] ]:? 'shadowChannel' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J][P]} : 'shadowChannel' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J]} */ js.Any
      ] = js.undefined
    
    var shadowRing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ J in any | undefined ]:? 'shadowRing' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J] extends std.Record<any, any>? {[ P in any | undefined[J] ]:? 'shadowRing' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J][P]} : 'shadowRing' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J]} */ js.Any
      ] = js.undefined
  }
  object ColorSystemOptions {
    
    inline def apply(): ColorSystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorSystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorSystemOptions] (val x: Self) extends AnyVal {
      
      inline def setPalette(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ J in any | undefined ]:? 'palette' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions & @mui/joy.@mui/joy/styles/types/colorSystem.Palette : @mui/joy.@mui/joy/styles/types/colorSystem.Palette[J] extends std.Record<any, any>? {[ P in any | undefined[J] ]:? 'palette' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions & @mui/joy.@mui/joy/styles/types/colorSystem.Palette : @mui/joy.@mui/joy/styles/types/colorSystem.Palette[J][P]} : 'palette' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions & @mui/joy.@mui/joy/styles/types/colorSystem.Palette : @mui/joy.@mui/joy/styles/types/colorSystem.Palette[J]} */ js.Any
      ): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setShadowChannel(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ J in any | undefined ]:? 'shadowChannel' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J] extends std.Record<any, any>? {[ P in any | undefined[J] ]:? 'shadowChannel' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J][P]} : 'shadowChannel' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J]} */ js.Any
      ): Self = StObject.set(x, "shadowChannel", value.asInstanceOf[js.Any])
      
      inline def setShadowChannelUndefined: Self = StObject.set(x, "shadowChannel", js.undefined)
      
      inline def setShadowRing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ J in any | undefined ]:? 'shadowRing' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J] extends std.Record<any, any>? {[ P in any | undefined[J] ]:? 'shadowRing' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J][P]} : 'shadowRing' extends keyof {  palette :@mui/joy.@mui/joy/styles/types/colorSystem.PaletteOptions}? any | undefined & string : string[J]} */ js.Any
      ): Self = StObject.set(x, "shadowRing", value.asInstanceOf[js.Any])
      
      inline def setShadowRingUndefined: Self = StObject.set(x, "shadowRing", js.undefined)
    }
  }
  
  /* Inlined parent @mui/joy.@mui/joy/styles/extendTheme.Partial2Level<@mui/joy.@mui/joy/styles/types.ThemeScalesOptions> */
  trait CssVarsThemeOptions extends StObject {
    
    var breakpoints: js.UndefOr[BreakpointsOptions] = js.undefined
    
    var colorInversion: js.UndefOr[
        Partial2LevelColorInversion | (js.Function1[/* theme */ Theme, Partial2LevelColorInversion])
      ] = js.undefined
    
    var colorInversionConfig: js.UndefOr[ColorInversionConfig] = js.undefined
    
    var colorSchemes: js.UndefOr[PartialRecordDefaultColorSchemeExtendedC] = js.undefined
    
    var components: js.UndefOr[Components[Theme]] = js.undefined
    
    /**
      * Prefix of the generated CSS variables
      * @default 'joy'
      * @example extendTheme({ cssVarPrefix: 'foo-bar' })
      * // { ..., typography: { body1: { fontSize: 'var(--foo-bar-fontSize-md)' } }, ... }
      *
      * @example <caption>Provides empty string ('') to remove the prefix</caption>
      * extendTheme({ cssVarPrefix: 'foo-bar' })
      * // { ..., typography: { body1: { fontSize: 'var(--fontSize-md)' } }, ... }
      */
    var cssVarPrefix: js.UndefOr[String] = js.undefined
    
    var focus: js.UndefOr[PartialFocus] = js.undefined
    
    var fontFamily: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily extends std.Record<any, any> ? {[ J in any | undefined ]:? 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily[J]} : 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily */ js.Any
      ] = js.undefined
    
    var fontSize: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize extends std.Record<any, any> ? {[ J in any | undefined ]:? 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize[J]} : 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize */ js.Any
      ] = js.undefined
    
    var fontWeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight extends std.Record<any, any> ? {[ J in any | undefined ]:? 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight[J]} : 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight */ js.Any
      ] = js.undefined
    
    var letterSpacing: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing extends std.Record<any, any> ? {[ J in any | undefined ]:? 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing[J]} : 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing */ js.Any
      ] = js.undefined
    
    var lineHeight: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight extends std.Record<any, any> ? {[ J in any | undefined ]:? 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight[J]} : 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight */ js.Any
      ] = js.undefined
    
    var radius: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius extends std.Record<any, any> ? {[ J in any | undefined ]:? 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius[J]} : 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius */ js.Any
      ] = js.undefined
    
    var shadow: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow extends std.Record<any, any> ? {[ J in any | undefined ]:? 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow[J]} : 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow */ js.Any
      ] = js.undefined
    
    /**
      * A function to determine if the key, value should be attached as CSS Variable
      * `keys` is an array that represents the object path keys.
      *  Ex, if the theme is { foo: { bar: 'var(--test)' } }
      *  then, keys = ['foo', 'bar']
      *        value = 'var(--test)'
      */
    var shouldSkipGeneratingVar: js.UndefOr[js.Function2[/* keys */ js.Array[String], /* value */ String | Double, Boolean]] = js.undefined
    
    var spacing: js.UndefOr[SpacingOptions] = js.undefined
    
    var typography: js.UndefOr[Partial[TypographySystemOptions]] = js.undefined
    
    var unstable_sxConfig: js.UndefOr[SxConfig] = js.undefined
    
    var variants: js.UndefOr[Partial2LevelVariants] = js.undefined
    
    var zIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex extends std.Record<any, any> ? {[ J in any | undefined ]:? 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex[J]} : 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex */ js.Any
      ] = js.undefined
  }
  object CssVarsThemeOptions {
    
    inline def apply(): CssVarsThemeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssVarsThemeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssVarsThemeOptions] (val x: Self) extends AnyVal {
      
      inline def setBreakpoints(value: BreakpointsOptions): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setColorInversion(
        value: Partial2LevelColorInversion | (js.Function1[/* theme */ Theme, Partial2LevelColorInversion])
      ): Self = StObject.set(x, "colorInversion", value.asInstanceOf[js.Any])
      
      inline def setColorInversionConfig(value: ColorInversionConfig): Self = StObject.set(x, "colorInversionConfig", value.asInstanceOf[js.Any])
      
      inline def setColorInversionConfigUndefined: Self = StObject.set(x, "colorInversionConfig", js.undefined)
      
      inline def setColorInversionFunction1(value: /* theme */ Theme => Partial2LevelColorInversion): Self = StObject.set(x, "colorInversion", js.Any.fromFunction1(value))
      
      inline def setColorInversionUndefined: Self = StObject.set(x, "colorInversion", js.undefined)
      
      inline def setColorSchemes(value: PartialRecordDefaultColorSchemeExtendedC): Self = StObject.set(x, "colorSchemes", value.asInstanceOf[js.Any])
      
      inline def setColorSchemesUndefined: Self = StObject.set(x, "colorSchemes", js.undefined)
      
      inline def setComponents(value: Components[Theme]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCssVarPrefix(value: String): Self = StObject.set(x, "cssVarPrefix", value.asInstanceOf[js.Any])
      
      inline def setCssVarPrefixUndefined: Self = StObject.set(x, "cssVarPrefix", js.undefined)
      
      inline def setFocus(value: PartialFocus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
      
      inline def setFontFamily(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily extends std.Record<any, any> ? {[ J in any | undefined ]:? 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily[J]} : 'fontFamily' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily & @mui/joy.@mui/joy/styles/types/typography.FontFamily : @mui/joy.@mui/joy/styles/types/typography.FontFamily */ js.Any
      ): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize extends std.Record<any, any> ? {[ J in any | undefined ]:? 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize[J]} : 'fontSize' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontSize & @mui/joy.@mui/joy/styles/types/typography.FontSize : @mui/joy.@mui/joy/styles/types/typography.FontSize */ js.Any
      ): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontWeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight extends std.Record<any, any> ? {[ J in any | undefined ]:? 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight[J]} : 'fontWeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight & @mui/joy.@mui/joy/styles/types/typography.FontWeight : @mui/joy.@mui/joy/styles/types/typography.FontWeight */ js.Any
      ): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLetterSpacing(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing extends std.Record<any, any> ? {[ J in any | undefined ]:? 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing[J]} : 'letterSpacing' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing & @mui/joy.@mui/joy/styles/types/typography.LetterSpacing : @mui/joy.@mui/joy/styles/types/typography.LetterSpacing */ js.Any
      ): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight extends std.Record<any, any> ? {[ J in any | undefined ]:? 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight[J]} : 'lineHeight' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight & @mui/joy.@mui/joy/styles/types/typography.LineHeight : @mui/joy.@mui/joy/styles/types/typography.LineHeight */ js.Any
      ): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setRadius(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius extends std.Record<any, any> ? {[ J in any | undefined ]:? 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius[J]} : 'radius' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/radius.DefaultRadius & @mui/joy.@mui/joy/styles/types/radius.Radius : @mui/joy.@mui/joy/styles/types/radius.Radius */ js.Any
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setShadow(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow extends std.Record<any, any> ? {[ J in any | undefined ]:? 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow[J]} : 'shadow' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/shadow.DefaultShadow & @mui/joy.@mui/joy/styles/types/shadow.Shadow : @mui/joy.@mui/joy/styles/types/shadow.Shadow */ js.Any
      ): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setShouldSkipGeneratingVar(value: (/* keys */ js.Array[String], /* value */ String | Double) => Boolean): Self = StObject.set(x, "shouldSkipGeneratingVar", js.Any.fromFunction2(value))
      
      inline def setShouldSkipGeneratingVarUndefined: Self = StObject.set(x, "shouldSkipGeneratingVar", js.undefined)
      
      inline def setSpacing(value: SpacingOptions): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingFunction1(value: (/* abs */ Double) | String => Double | String): Self = StObject.set(x, "spacing", js.Any.fromFunction1(value))
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
      
      inline def setSpacingVarargs(value: (String | Double)*): Self = StObject.set(x, "spacing", js.Array(value*))
      
      inline def setTypography(value: Partial[TypographySystemOptions]): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      inline def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      inline def setUnstable_sxConfig(value: SxConfig): Self = StObject.set(x, "unstable_sxConfig", value.asInstanceOf[js.Any])
      
      inline def setUnstable_sxConfigUndefined: Self = StObject.set(x, "unstable_sxConfig", js.undefined)
      
      inline def setVariants(value: Partial2LevelVariants): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setZIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex extends std.Record<any, any> ? {[ J in any | undefined ]:? 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex}? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex[J]} : 'zIndex' extends keyof {  radius :@mui/joy.@mui/joy/styles/types/radius.DefaultRadius,   shadow :@mui/joy.@mui/joy/styles/types/shadow.DefaultShadow,   fontFamily :@mui/joy.@mui/joy/styles/types/typography.DefaultFontFamily,   fontSize :@mui/joy.@mui/joy/styles/types/typography.DefaultFontSize,   fontWeight :@mui/joy.@mui/joy/styles/types/typography.DefaultFontWeight,   lineHeight :@mui/joy.@mui/joy/styles/types/typography.DefaultLineHeight,   letterSpacing :@mui/joy.@mui/joy/styles/types/typography.DefaultLetterSpacing,   zIndex :@mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex} ? @mui/joy.@mui/joy/styles/types/zIndex.DefaultZIndex & @mui/joy.@mui/joy/styles/types/zIndex.ZIndex : @mui/joy.@mui/joy/styles/types/zIndex.ZIndex */ js.Any
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? T[K] extends std.Record<any, any>? {[ J in keyof T[K] ]:? T[K][J]} : T[K]}
    }}}
    */
  @js.native
  trait Partial2Level[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]:? {[ J in keyof T[K] ]:? T[K][J] extends std.Record<any, any>? {[ P in keyof T[K][J] ]:? T[K][J][P]} : T[K][J]}}
    }}}
    */
  @js.native
  trait Partial3Level[T] extends StObject
}
