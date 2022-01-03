package com.olvind.mui.muiMaterial

import com.olvind.mui.csstype.mod.AtRule.FontFace
import com.olvind.mui.csstype.mod.Properties
import com.olvind.mui.csstype.mod.Property.FontFamily
import com.olvind.mui.csstype.mod.Property.FontWeight
import com.olvind.mui.muiMaterial.createPaletteMod.Palette
import com.olvind.mui.muiMaterial.muiMaterialNumbers.`0`
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTypographyMod {
  
  @JSImport("@mui/material/styles/createTypography", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(palette: Palette, typography: TypographyOptions): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  @scala.inline
  def default(palette: Palette, typography: js.Function1[/* palette */ Palette, TypographyOptions]): Typography = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any], typography.asInstanceOf[js.Any])).asInstanceOf[Typography]
  
  @js.native
  trait BaseCSSProperties
    extends StObject
       with Properties[Double | String, String] {
    
    var `@font-face`: js.UndefOr[Fontface | js.Array[Fontface]] = js.native
  }
  object BaseCSSProperties {
    
    @scala.inline
    def apply(): BaseCSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseCSSProperties]
    }
    
    @scala.inline
    implicit class BaseCSSPropertiesMutableBuilder[Self <: BaseCSSProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `set@font-face`(value: Fontface | js.Array[Fontface]): Self = StObject.set(x, "@font-face", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `set@font-faceUndefined`: Self = StObject.set(x, "@font-face", js.undefined)
      
      @scala.inline
      def `set@font-faceVarargs`(value: Fontface*): Self = StObject.set(x, "@font-face", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CSSProperties
    extends StObject
       with BaseCSSProperties
       with // Allow pseudo selectors and media queries
  // `unknown` is used since TS does not allow assigning an interface without
  // an index signature to one with an index signature. This is to allow type safe
  // module augmentation.
  // Technically we want any key not typed in `BaseCSSProperties` to be of type
  // `CSSProperties` but this doesn't work. The index signature needs to cover
  // BaseCSSProperties as well. Usually you would use `BaseCSSProperties[keyof BaseCSSProperties]`
  // but this would not allow assigning React.CSSProperties to CSSProperties
  /* k */ StringDictionary[Any | CSSProperties]
  object CSSProperties {
    
    @scala.inline
    def apply(): CSSProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSSProperties]
    }
  }
  
  /* Inlined parent std.Required<{  fontFamily :react.react.CSSProperties['fontFamily'],   fontSize :number,   fontWeightLight :react.react.CSSProperties['fontWeight'],   fontWeightRegular :react.react.CSSProperties['fontWeight'],   fontWeightMedium :react.react.CSSProperties['fontWeight'],   fontWeightBold :react.react.CSSProperties['fontWeight'],   htmlFontSize :number}> */
  @js.native
  trait FontStyle extends StObject {
    
    var fontFamily: FontFamily = js.native
    
    var fontSize: Double = js.native
    
    var fontWeightBold: FontWeight = js.native
    
    var fontWeightLight: FontWeight = js.native
    
    var fontWeightMedium: FontWeight = js.native
    
    var fontWeightRegular: FontWeight = js.native
    
    var htmlFontSize: Double = js.native
  }
  object FontStyle {
    
    @scala.inline
    def apply(
      fontFamily: FontFamily,
      fontSize: Double,
      fontWeightBold: FontWeight,
      fontWeightLight: FontWeight,
      fontWeightMedium: FontWeight,
      fontWeightRegular: FontWeight,
      htmlFontSize: Double
    ): FontStyle = {
      val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightBold = fontWeightBold.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any], htmlFontSize = htmlFontSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontStyle]
    }
    
    @scala.inline
    implicit class FontStyleMutableBuilder[Self <: FontStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@mui/material.@mui/material/styles/createTypography.FontStyle> */
  @js.native
  trait FontStyleOptions extends StObject {
    
    var allVariants: js.UndefOr[com.olvind.mui.react.mod.CSSProperties] = js.native
    
    var fontFamily: js.UndefOr[FontFamily] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontWeightBold: js.UndefOr[FontWeight] = js.native
    
    var fontWeightLight: js.UndefOr[FontWeight] = js.native
    
    var fontWeightMedium: js.UndefOr[FontWeight] = js.native
    
    var fontWeightRegular: js.UndefOr[FontWeight] = js.native
    
    var htmlFontSize: js.UndefOr[Double] = js.native
  }
  object FontStyleOptions {
    
    @scala.inline
    def apply(): FontStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontStyleOptions]
    }
    
    @scala.inline
    implicit class FontStyleOptionsMutableBuilder[Self <: FontStyleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllVariants(value: com.olvind.mui.react.mod.CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightBoldUndefined: Self = StObject.set(x, "fontWeightBold", js.undefined)
      
      @scala.inline
      def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      @scala.inline
      def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      @scala.inline
      def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
    }
  }
  
  @js.native
  trait Fontface
    extends StObject
       with FontFace[String | `0`, String] {
    
    var fallbacks: js.UndefOr[js.Array[FontFace[String | `0`, String]]] = js.native
  }
  object Fontface {
    
    @scala.inline
    def apply(): Fontface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fontface]
    }
    
    @scala.inline
    implicit class FontfaceMutableBuilder[Self <: Fontface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbacks(value: js.Array[FontFace[String | `0`, String]]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacksUndefined: Self = StObject.set(x, "fallbacks", js.undefined)
      
      @scala.inline
      def setFallbacksVarargs(value: (FontFace[String | `0`, String])*): Self = StObject.set(x, "fallbacks", js.Array(value :_*))
    }
  }
  
  type NormalCssProperties = Properties[Double | String, String]
  
  /* Inlined parent std.Record<@mui/material.@mui/material/styles/createTypography.Variant, @mui/material.@mui/material/styles/createTypography.TypographyStyle> */
  /* Inlined parent @mui/material.@mui/material/styles/createTypography.FontStyle */
  /* Inlined parent @mui/material.@mui/material/styles/createTypography.TypographyUtils */
  @js.native
  trait Typography extends StObject {
    
    var body1: TypographyStyle = js.native
    
    var body2: TypographyStyle = js.native
    
    var button: TypographyStyle = js.native
    
    var caption: TypographyStyle = js.native
    
    var fontFamily: FontFamily = js.native
    
    var fontSize: Double = js.native
    
    var fontWeightBold: FontWeight = js.native
    
    var fontWeightLight: FontWeight = js.native
    
    var fontWeightMedium: FontWeight = js.native
    
    var fontWeightRegular: FontWeight = js.native
    
    var h1: TypographyStyle = js.native
    
    var h2: TypographyStyle = js.native
    
    var h3: TypographyStyle = js.native
    
    var h4: TypographyStyle = js.native
    
    var h5: TypographyStyle = js.native
    
    var h6: TypographyStyle = js.native
    
    var htmlFontSize: Double = js.native
    
    var overline: TypographyStyle = js.native
    
    def pxToRem(px: Double): String = js.native
    
    var subtitle1: TypographyStyle = js.native
    
    var subtitle2: TypographyStyle = js.native
  }
  object Typography {
    
    @scala.inline
    def apply(
      body1: TypographyStyle,
      body2: TypographyStyle,
      button: TypographyStyle,
      caption: TypographyStyle,
      fontFamily: FontFamily,
      fontSize: Double,
      fontWeightBold: FontWeight,
      fontWeightLight: FontWeight,
      fontWeightMedium: FontWeight,
      fontWeightRegular: FontWeight,
      h1: TypographyStyle,
      h2: TypographyStyle,
      h3: TypographyStyle,
      h4: TypographyStyle,
      h5: TypographyStyle,
      h6: TypographyStyle,
      htmlFontSize: Double,
      overline: TypographyStyle,
      pxToRem: Double => String,
      subtitle1: TypographyStyle,
      subtitle2: TypographyStyle
    ): Typography = {
      val __obj = js.Dynamic.literal(body1 = body1.asInstanceOf[js.Any], body2 = body2.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeightBold = fontWeightBold.asInstanceOf[js.Any], fontWeightLight = fontWeightLight.asInstanceOf[js.Any], fontWeightMedium = fontWeightMedium.asInstanceOf[js.Any], fontWeightRegular = fontWeightRegular.asInstanceOf[js.Any], h1 = h1.asInstanceOf[js.Any], h2 = h2.asInstanceOf[js.Any], h3 = h3.asInstanceOf[js.Any], h4 = h4.asInstanceOf[js.Any], h5 = h5.asInstanceOf[js.Any], h6 = h6.asInstanceOf[js.Any], htmlFontSize = htmlFontSize.asInstanceOf[js.Any], overline = overline.asInstanceOf[js.Any], pxToRem = js.Any.fromFunction1(pxToRem), subtitle1 = subtitle1.asInstanceOf[js.Any], subtitle2 = subtitle2.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typography]
    }
    
    @scala.inline
    implicit class TypographyMutableBuilder[Self <: Typography] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody1(value: TypographyStyle): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2(value: TypographyStyle): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButton(value: TypographyStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaption(value: TypographyStyle): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1(value: TypographyStyle): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2(value: TypographyStyle): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3(value: TypographyStyle): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4(value: TypographyStyle): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5(value: TypographyStyle): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6(value: TypographyStyle): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverline(value: TypographyStyle): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubtitle1(value: TypographyStyle): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2(value: TypographyStyle): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<std.Record<@mui/material.@mui/material/styles/createTypography.Variant, @mui/material.@mui/material/styles/createTypography.TypographyStyleOptions> & @mui/material.@mui/material/styles/createTypography.FontStyleOptions> */
  @js.native
  trait TypographyOptions extends StObject {
    
    var allVariants: js.UndefOr[com.olvind.mui.react.mod.CSSProperties] = js.native
    
    var body1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var body2: js.UndefOr[TypographyStyleOptions] = js.native
    
    var button: js.UndefOr[TypographyStyleOptions] = js.native
    
    var caption: js.UndefOr[TypographyStyleOptions] = js.native
    
    var fontFamily: js.UndefOr[FontFamily] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var fontWeightBold: js.UndefOr[FontWeight] = js.native
    
    var fontWeightLight: js.UndefOr[FontWeight] = js.native
    
    var fontWeightMedium: js.UndefOr[FontWeight] = js.native
    
    var fontWeightRegular: js.UndefOr[FontWeight] = js.native
    
    var h1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h2: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h3: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h4: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h5: js.UndefOr[TypographyStyleOptions] = js.native
    
    var h6: js.UndefOr[TypographyStyleOptions] = js.native
    
    var htmlFontSize: js.UndefOr[Double] = js.native
    
    var overline: js.UndefOr[TypographyStyleOptions] = js.native
    
    var subtitle1: js.UndefOr[TypographyStyleOptions] = js.native
    
    var subtitle2: js.UndefOr[TypographyStyleOptions] = js.native
  }
  object TypographyOptions {
    
    @scala.inline
    def apply(): TypographyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypographyOptions]
    }
    
    @scala.inline
    implicit class TypographyOptionsMutableBuilder[Self <: TypographyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllVariants(value: com.olvind.mui.react.mod.CSSProperties): Self = StObject.set(x, "allVariants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVariantsUndefined: Self = StObject.set(x, "allVariants", js.undefined)
      
      @scala.inline
      def setBody1(value: TypographyStyleOptions): Self = StObject.set(x, "body1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody1Undefined: Self = StObject.set(x, "body1", js.undefined)
      
      @scala.inline
      def setBody2(value: TypographyStyleOptions): Self = StObject.set(x, "body2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody2Undefined: Self = StObject.set(x, "body2", js.undefined)
      
      @scala.inline
      def setButton(value: TypographyStyleOptions): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setCaption(value: TypographyStyleOptions): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeightBold(value: FontWeight): Self = StObject.set(x, "fontWeightBold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightBoldUndefined: Self = StObject.set(x, "fontWeightBold", js.undefined)
      
      @scala.inline
      def setFontWeightLight(value: FontWeight): Self = StObject.set(x, "fontWeightLight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightLightUndefined: Self = StObject.set(x, "fontWeightLight", js.undefined)
      
      @scala.inline
      def setFontWeightMedium(value: FontWeight): Self = StObject.set(x, "fontWeightMedium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightMediumUndefined: Self = StObject.set(x, "fontWeightMedium", js.undefined)
      
      @scala.inline
      def setFontWeightRegular(value: FontWeight): Self = StObject.set(x, "fontWeightRegular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightRegularUndefined: Self = StObject.set(x, "fontWeightRegular", js.undefined)
      
      @scala.inline
      def setH1(value: TypographyStyleOptions): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH2(value: TypographyStyleOptions): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH3(value: TypographyStyleOptions): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH4(value: TypographyStyleOptions): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH5(value: TypographyStyleOptions): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH6(value: TypographyStyleOptions): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setHtmlFontSize(value: Double): Self = StObject.set(x, "htmlFontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlFontSizeUndefined: Self = StObject.set(x, "htmlFontSize", js.undefined)
      
      @scala.inline
      def setOverline(value: TypographyStyleOptions): Self = StObject.set(x, "overline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlineUndefined: Self = StObject.set(x, "overline", js.undefined)
      
      @scala.inline
      def setSubtitle1(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle1Undefined: Self = StObject.set(x, "subtitle1", js.undefined)
      
      @scala.inline
      def setSubtitle2(value: TypographyStyleOptions): Self = StObject.set(x, "subtitle2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitle2Undefined: Self = StObject.set(x, "subtitle2", js.undefined)
    }
  }
  
  type TypographyStyle = CSSProperties
  
  type TypographyStyleOptions = TypographyStyle
  
  @js.native
  trait TypographyUtils extends StObject {
    
    def pxToRem(px: Double): String = js.native
  }
  object TypographyUtils {
    
    @scala.inline
    def apply(pxToRem: Double => String): TypographyUtils = {
      val __obj = js.Dynamic.literal(pxToRem = js.Any.fromFunction1(pxToRem))
      __obj.asInstanceOf[TypographyUtils]
    }
    
    @scala.inline
    implicit class TypographyUtilsMutableBuilder[Self <: TypographyUtils] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPxToRem(value: Double => String): Self = StObject.set(x, "pxToRem", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h1
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h2
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h3
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h4
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h5
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.h6
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.subtitle1
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.subtitle2
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.body1
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.body2
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.caption
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.button
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.overline
  */
  trait Variant extends StObject
  object Variant {
    
    @scala.inline
    def body1: com.olvind.mui.muiMaterial.muiMaterialStrings.body1 = "body1".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.body1]
    
    @scala.inline
    def body2: com.olvind.mui.muiMaterial.muiMaterialStrings.body2 = "body2".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.body2]
    
    @scala.inline
    def button: com.olvind.mui.muiMaterial.muiMaterialStrings.button = "button".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.button]
    
    @scala.inline
    def caption: com.olvind.mui.muiMaterial.muiMaterialStrings.caption = "caption".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.caption]
    
    @scala.inline
    def h1: com.olvind.mui.muiMaterial.muiMaterialStrings.h1 = "h1".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.h1]
    
    @scala.inline
    def h2: com.olvind.mui.muiMaterial.muiMaterialStrings.h2 = "h2".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.h2]
    
    @scala.inline
    def h3: com.olvind.mui.muiMaterial.muiMaterialStrings.h3 = "h3".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.h3]
    
    @scala.inline
    def h4: com.olvind.mui.muiMaterial.muiMaterialStrings.h4 = "h4".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.h4]
    
    @scala.inline
    def h5: com.olvind.mui.muiMaterial.muiMaterialStrings.h5 = "h5".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.h5]
    
    @scala.inline
    def h6: com.olvind.mui.muiMaterial.muiMaterialStrings.h6 = "h6".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.h6]
    
    @scala.inline
    def overline: com.olvind.mui.muiMaterial.muiMaterialStrings.overline = "overline".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.overline]
    
    @scala.inline
    def subtitle1: com.olvind.mui.muiMaterial.muiMaterialStrings.subtitle1 = "subtitle1".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.subtitle1]
    
    @scala.inline
    def subtitle2: com.olvind.mui.muiMaterial.muiMaterialStrings.subtitle2 = "subtitle2".asInstanceOf[com.olvind.mui.muiMaterial.muiMaterialStrings.subtitle2]
  }
}
