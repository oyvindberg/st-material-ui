package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.PartialPaletteRange
import com.olvind.mui.muiJoy.anon.RecordDefaultColorPaletteCSSObject
import com.olvind.mui.muiJoy.anon.RecordcontextDefaultColorPaletteCSSObjec
import com.olvind.mui.muiJoy.stylesTypesVariantsMod.VariantKey
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesVariantUtilsMod {
  
  @JSImport("@mui/joy/styles/variantUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSoftInversion(theme: com.olvind.mui.muiJoy.anon.ThemeFragment): RecordDefaultColorPaletteCSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createSoftInversion")(theme.asInstanceOf[js.Any]).asInstanceOf[RecordDefaultColorPaletteCSSObject]
  
  inline def createSolidInversion(theme: ThemeFragment): RecordDefaultColorPaletteCSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createSolidInversion")(theme.asInstanceOf[js.Any]).asInstanceOf[RecordDefaultColorPaletteCSSObject]
  
  inline def createVariant(variant: VariantKey): RecordcontextDefaultColorPaletteCSSObjec = ^.asInstanceOf[js.Dynamic].applyDynamic("createVariant")(variant.asInstanceOf[js.Any]).asInstanceOf[RecordcontextDefaultColorPaletteCSSObjec]
  inline def createVariant(variant: VariantKey, theme: ThemeFragment): RecordcontextDefaultColorPaletteCSSObjec = (^.asInstanceOf[js.Dynamic].applyDynamic("createVariant")(variant.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[RecordcontextDefaultColorPaletteCSSObjec]
  
  inline def createVariantStyle(name: String): CSSObject = ^.asInstanceOf[js.Dynamic].applyDynamic("createVariantStyle")(name.asInstanceOf[js.Any]).asInstanceOf[CSSObject]
  inline def createVariantStyle(name: String, palette: PartialPaletteRange): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createVariantStyle")(name.asInstanceOf[js.Any], palette.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  @scala.annotation.targetName("createVariantStyle_plainColor_plainBg_plainBorder_plainHoverColor_plainHoverBorder_plainHoverBg_plainActiveColor_plainActiveBorder_plainActiveBg_plainDisabledColor_plainDisabledBorder_plainDisabledBg_outlinedColor_outlinedBorder_outlinedBg_outlinedHoverColor_outlinedHoverBorder_outlinedHoverBg_outlinedActiveColor_outlinedActiveBorder_outlinedActiveBg_outlinedDisabledColor_outlinedDisabledBorder_outlinedDisabledBg_softColor_softBorder_softBg_softHoverColor_softHoverBorder_softHoverBg_softActiveColor_softActiveBorder_softActiveBg_softDisabledColor_softDisabledBorder_softDisabledBg_solidColor_solidBg_solidBorder_solidHoverColor_solidHoverBg_solidHoverBorder_solidActiveColor_solidActiveBg_solidActiveBorder_solidDisabledColor_solidDisabledBg_solidDisabledBorder")
  inline def createVariantStyle(
    name: String,
    palette: PartialPaletteRange,
    getCssVar: js.Function1[
      /* variantVar */ "plainColor" | "plainBg" | "plainBorder" | "plainHoverColor" | "plainHoverBorder" | "plainHoverBg" | "plainActiveColor" | "plainActiveBorder" | "plainActiveBg" | "plainDisabledColor" | "plainDisabledBorder" | "plainDisabledBg" | "outlinedColor" | "outlinedBorder" | "outlinedBg" | "outlinedHoverColor" | "outlinedHoverBorder" | "outlinedHoverBg" | "outlinedActiveColor" | "outlinedActiveBorder" | "outlinedActiveBg" | "outlinedDisabledColor" | "outlinedDisabledBorder" | "outlinedDisabledBg" | "softColor" | "softBorder" | "softBg" | "softHoverColor" | "softHoverBorder" | "softHoverBg" | "softActiveColor" | "softActiveBorder" | "softActiveBg" | "softDisabledColor" | "softDisabledBorder" | "softDisabledBg" | "solidColor" | "solidBg" | "solidBorder" | "solidHoverColor" | "solidHoverBg" | "solidHoverBorder" | "solidActiveColor" | "solidActiveBg" | "solidActiveBorder" | "solidDisabledColor" | "solidDisabledBg" | "solidDisabledBorder", 
      String
    ]
  ): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createVariantStyle")(name.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], getCssVar.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  @scala.annotation.targetName("createVariantStyle_plainColor_plainBg_plainBorder_plainHoverColor_plainHoverBorder_plainHoverBg_plainActiveColor_plainActiveBorder_plainActiveBg_plainDisabledColor_plainDisabledBorder_plainDisabledBg_outlinedColor_outlinedBorder_outlinedBg_outlinedHoverColor_outlinedHoverBorder_outlinedHoverBg_outlinedActiveColor_outlinedActiveBorder_outlinedActiveBg_outlinedDisabledColor_outlinedDisabledBorder_outlinedDisabledBg_softColor_softBorder_softBg_softHoverColor_softHoverBorder_softHoverBg_softActiveColor_softActiveBorder_softActiveBg_softDisabledColor_softDisabledBorder_softDisabledBg_solidColor_solidBg_solidBorder_solidHoverColor_solidHoverBg_solidHoverBorder_solidActiveColor_solidActiveBg_solidActiveBorder_solidDisabledColor_solidDisabledBg_solidDisabledBorder")
  inline def createVariantStyle(
    name: String,
    palette: Unit,
    getCssVar: js.Function1[
      /* variantVar */ "plainColor" | "plainBg" | "plainBorder" | "plainHoverColor" | "plainHoverBorder" | "plainHoverBg" | "plainActiveColor" | "plainActiveBorder" | "plainActiveBg" | "plainDisabledColor" | "plainDisabledBorder" | "plainDisabledBg" | "outlinedColor" | "outlinedBorder" | "outlinedBg" | "outlinedHoverColor" | "outlinedHoverBorder" | "outlinedHoverBg" | "outlinedActiveColor" | "outlinedActiveBorder" | "outlinedActiveBg" | "outlinedDisabledColor" | "outlinedDisabledBorder" | "outlinedDisabledBg" | "softColor" | "softBorder" | "softBg" | "softHoverColor" | "softHoverBorder" | "softHoverBg" | "softActiveColor" | "softActiveBorder" | "softActiveBg" | "softDisabledColor" | "softDisabledBorder" | "softDisabledBg" | "solidColor" | "solidBg" | "solidBorder" | "solidHoverColor" | "solidHoverBg" | "solidHoverBorder" | "solidActiveColor" | "solidActiveBg" | "solidActiveBorder" | "solidDisabledColor" | "solidDisabledBg" | "solidDisabledBorder", 
      String
    ]
  ): CSSObject = (^.asInstanceOf[js.Dynamic].applyDynamic("createVariantStyle")(name.asInstanceOf[js.Any], palette.asInstanceOf[js.Any], getCssVar.asInstanceOf[js.Any])).asInstanceOf[CSSObject]
  
  inline def isVariantPalette(colorPalette: Record[String, Any]): Boolean | "" | 0 = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariantPalette")(colorPalette.asInstanceOf[js.Any]).asInstanceOf[Boolean | "" | 0]
  inline def isVariantPalette(colorPalette: String): Boolean | "" | 0 = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariantPalette")(colorPalette.asInstanceOf[js.Any]).asInstanceOf[Boolean | "" | 0]
  inline def isVariantPalette(colorPalette: Double): Boolean | "" | 0 = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariantPalette")(colorPalette.asInstanceOf[js.Any]).asInstanceOf[Boolean | "" | 0]
  
  trait ThemeFragment extends StObject {
    
    var cssVarPrefix: js.UndefOr[String] = js.undefined
    
    def getCssVar(args: Any*): String
    
    var palette: Record[String, Any]
  }
  object ThemeFragment {
    
    inline def apply(getCssVar: /* repeated */ Any => String, palette: Record[String, Any]): ThemeFragment = {
      val __obj = js.Dynamic.literal(getCssVar = js.Any.fromFunction1(getCssVar), palette = palette.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeFragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeFragment] (val x: Self) extends AnyVal {
      
      inline def setCssVarPrefix(value: String): Self = StObject.set(x, "cssVarPrefix", value.asInstanceOf[js.Any])
      
      inline def setCssVarPrefixUndefined: Self = StObject.set(x, "cssVarPrefix", js.undefined)
      
      inline def setGetCssVar(value: /* repeated */ Any => String): Self = StObject.set(x, "getCssVar", js.Any.fromFunction1(value))
      
      inline def setPalette(value: Record[String, Any]): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    }
  }
}
