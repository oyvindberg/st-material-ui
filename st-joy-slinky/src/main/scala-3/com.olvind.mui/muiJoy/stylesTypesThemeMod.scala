package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.ColorSystempalette
import com.olvind.mui.muiJoy.anon.OmitColorSystempalettemode
import com.olvind.mui.muiJoy.anon.RecordDefaultColorSchemeExtendedColorSch
import com.olvind.mui.muiJoy.anon.ThicknessString
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.DefaultColorScheme
import com.olvind.mui.muiJoy.stylesTypesColorSchemeMod.ExtendedColorScheme
import com.olvind.mui.muiJoy.stylesTypesFocusMod.Focus
import com.olvind.mui.muiJoy.stylesTypesRadiusMod.Radius
import com.olvind.mui.muiJoy.stylesTypesShadowMod.Shadow
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.FontFamily
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.FontSize
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.FontWeight
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.LetterSpacing
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.LineHeight
import com.olvind.mui.muiJoy.stylesTypesTypographyMod.TypographySystem
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.ColorInversionConfig
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantOverrides
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.Variants
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createThemeCreateSpacingMod.Spacing
import com.olvind.mui.muiSystem.styleFunctionSxDefaultSxConfigMod.SxConfig
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesThemeMod {
  
  /* Inlined parent std.Omit<@mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem, 'palette'> */
  trait ColorSystemVars extends StObject {
    
    var palette: OmitColorSystempalettemode
    
    var shadowChannel: String
    
    var shadowRing: String
  }
  object ColorSystemVars {
    
    inline def apply(palette: OmitColorSystempalettemode, shadowChannel: String, shadowRing: String): ColorSystemVars = {
      val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSystemVars]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorSystemVars] (val x: Self) extends AnyVal {
      
      inline def setPalette(value: OmitColorSystempalettemode): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setShadowChannel(value: String): Self = StObject.set(x, "shadowChannel", value.asInstanceOf[js.Any])
      
      inline def setShadowRing(value: String): Self = StObject.set(x, "shadowRing", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Record<string | number, infer V> ? keyof T extends string | number ? V extends string | number ? keyof T : keyof V extends string | number ? / * template literal string: ${keyofT}-${ConcatDeep<Split<V>>} * / string : never : never : never
    }}}
    */
  type ConcatDeep[T] = /* keyof T */ String
  
  /**
    * Does not work for these cases:
    * - { borderRadius: string | number } // the value can't be a union
    * - { shadows: [string, string, ..., string] } // the value can't be an array
    */
  type NormalizeVars[T] = ConcatDeep[Split[T, /* keyof T */ String]]
  
  /* Inlined parent std.Omit<@mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem, 'palette'> */
  trait RuntimeColorSystem extends StObject {
    
    var palette: ColorSystempalette
    
    var shadowChannel: String
    
    var shadowRing: String
  }
  object RuntimeColorSystem {
    
    inline def apply(palette: ColorSystempalette, shadowChannel: String, shadowRing: String): RuntimeColorSystem = {
      val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeColorSystem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuntimeColorSystem] (val x: Self) extends AnyVal {
      
      inline def setPalette(value: ColorSystempalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait Theme
    extends StObject
       with ThemeScales
       with RuntimeColorSystem {
    
    var breakpoints: Breakpoints = js.native
    
    var colorInversion: VariantOverrides = js.native
    
    var colorInversionConfig: ColorInversionConfig = js.native
    
    var colorSchemes: RecordDefaultColorSchemeExtendedColorSch = js.native
    
    var cssVarPrefix: String = js.native
    
    @JSName("focus")
    var focus_Theme: Focus = js.native
    
    def getColorSchemeSelector(colorScheme: DefaultColorScheme): String = js.native
    def getColorSchemeSelector(colorScheme: ExtendedColorScheme): String = js.native
    
    def getCssVar(field: ThemeCssVar, vars: ThemeCssVar*): String = js.native
    
    var spacing: Spacing = js.native
    
    var typography: TypographySystem = js.native
    
    def unstable_sx(props: SxProps): CSSObject = js.native
    
    var unstable_sxConfig: SxConfig = js.native
    
    var variants: Variants = js.native
    
    var vars: ThemeVars = js.native
  }
  
  type ThemeCssVar = OverridableStringUnion[NormalizeVars[ThemeVars], ThemeCssVarOverrides]
  
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
      shadow: Shadow
    ): ThemeScales = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any])
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
      palette: OmitColorSystempalettemode,
      radius: Radius,
      shadow: Shadow,
      shadowChannel: String,
      shadowRing: String
    ): ThemeVars = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeVars]
    }
  }
}
