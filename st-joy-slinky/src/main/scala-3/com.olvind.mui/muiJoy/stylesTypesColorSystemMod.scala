package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.Common
import com.olvind.mui.muiJoy.anon.OutlinedHoverColor
import com.olvind.mui.muiJoy.anon.`60`
import com.olvind.mui.muiJoy.anon.`61`
import com.olvind.mui.muiJoy.stylesTypesUtilsMod.MergeDefault
import com.olvind.mui.muiJoy.stylesTypesUtilsMod.OverridableRecord
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.Simplify
import com.olvind.mui.std.Omit
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesColorSystemMod {
  
  type ApplyColorInversion[T /* <: `60` */] = Simplify[(Omit[T, "color"]) & `61`[T]]
  
  type ColorPaletteProp = OverridableStringUnion[DefaultColorPalette, ColorPalettePropOverrides]
  
  trait ColorPalettePropOverrides extends StObject
  
  trait ColorSystem extends StObject {
    
    var palette: Palette
    
    var shadowChannel: String
    
    var shadowRing: String
  }
  object ColorSystem {
    
    inline def apply(palette: Palette, shadowChannel: String, shadowRing: String): ColorSystem = {
      val __obj = js.Dynamic.literal(palette = palette.asInstanceOf[js.Any], shadowChannel = shadowChannel.asInstanceOf[js.Any], shadowRing = shadowRing.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorSystem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorSystem] (val x: Self) extends AnyVal {
      
      inline def setPalette(value: Palette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setShadowChannel(value: String): Self = StObject.set(x, "shadowChannel", value.asInstanceOf[js.Any])
      
      inline def setShadowRing(value: String): Self = StObject.set(x, "shadowRing", value.asInstanceOf[js.Any])
    }
  }
  
  object DefaultColorPalette {
    
    inline def danger: "danger" = "danger".asInstanceOf["danger"]
    
    inline def info: "info" = "info".asInstanceOf["info"]
    
    inline def neutral: "neutral" = "neutral".asInstanceOf["neutral"]
    
    inline def primary: "primary" = "primary".asInstanceOf["primary"]
    
    inline def success: "success" = "success".asInstanceOf["success"]
    
    inline def warning: "warning" = "warning".asInstanceOf["warning"]
  }
  type DefaultColorPalette = "primary" | "neutral" | "danger" | "info" | "success" | "warning"
  
  trait DefaultPaletteBackground extends StObject {
    
    var backdrop: String
    
    var body: String
    
    var level1: String
    
    var level2: String
    
    var level3: String
    
    var popup: String
    
    var surface: String
    
    var tooltip: String
  }
  object DefaultPaletteBackground {
    
    inline def apply(
      backdrop: String,
      body: String,
      level1: String,
      level2: String,
      level3: String,
      popup: String,
      surface: String,
      tooltip: String
    ): DefaultPaletteBackground = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], level1 = level1.asInstanceOf[js.Any], level2 = level2.asInstanceOf[js.Any], level3 = level3.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPaletteBackground]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPaletteBackground] (val x: Self) extends AnyVal {
      
      inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setLevel1(value: String): Self = StObject.set(x, "level1", value.asInstanceOf[js.Any])
      
      inline def setLevel2(value: String): Self = StObject.set(x, "level2", value.asInstanceOf[js.Any])
      
      inline def setLevel3(value: String): Self = StObject.set(x, "level3", value.asInstanceOf[js.Any])
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setSurface(value: String): Self = StObject.set(x, "surface", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultPaletteCommon extends StObject {
    
    var black: String
    
    var white: String
  }
  object DefaultPaletteCommon {
    
    inline def apply(black: String, white: String): DefaultPaletteCommon = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPaletteCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPaletteCommon] (val x: Self) extends AnyVal {
      
      inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultPaletteRange
    extends StObject
       with DefaultPaletteVariant {
    
    var `100`: String
    
    var `200`: String
    
    var `300`: String
    
    var `400`: String
    
    var `50`: String
    
    var `500`: String
    
    var `600`: String
    
    var `700`: String
    
    var `800`: String
    
    var `900`: String
    
    var darkChannel: String
    
    var lightChannel: String
    
    var mainChannel: String
  }
  object DefaultPaletteRange {
    
    inline def apply(
      `100`: String,
      `200`: String,
      `300`: String,
      `400`: String,
      `50`: String,
      `500`: String,
      `600`: String,
      `700`: String,
      `800`: String,
      `900`: String,
      darkChannel: String,
      lightChannel: String,
      mainChannel: String,
      outlinedActiveBg: String,
      outlinedBorder: String,
      outlinedColor: String,
      outlinedDisabledBorder: String,
      outlinedDisabledColor: String,
      outlinedHoverBg: String,
      outlinedHoverBorder: String,
      plainActiveBg: String,
      plainColor: String,
      plainDisabledColor: String,
      plainHoverBg: String,
      softActiveBg: String,
      softBg: String,
      softColor: String,
      softDisabledBg: String,
      softDisabledColor: String,
      softHoverBg: String,
      solidActiveBg: String,
      solidBg: String,
      solidColor: String,
      solidDisabledBg: String,
      solidDisabledColor: String,
      solidHoverBg: String
    ): DefaultPaletteRange = {
      val __obj = js.Dynamic.literal(darkChannel = darkChannel.asInstanceOf[js.Any], lightChannel = lightChannel.asInstanceOf[js.Any], mainChannel = mainChannel.asInstanceOf[js.Any], outlinedActiveBg = outlinedActiveBg.asInstanceOf[js.Any], outlinedBorder = outlinedBorder.asInstanceOf[js.Any], outlinedColor = outlinedColor.asInstanceOf[js.Any], outlinedDisabledBorder = outlinedDisabledBorder.asInstanceOf[js.Any], outlinedDisabledColor = outlinedDisabledColor.asInstanceOf[js.Any], outlinedHoverBg = outlinedHoverBg.asInstanceOf[js.Any], outlinedHoverBorder = outlinedHoverBorder.asInstanceOf[js.Any], plainActiveBg = plainActiveBg.asInstanceOf[js.Any], plainColor = plainColor.asInstanceOf[js.Any], plainDisabledColor = plainDisabledColor.asInstanceOf[js.Any], plainHoverBg = plainHoverBg.asInstanceOf[js.Any], softActiveBg = softActiveBg.asInstanceOf[js.Any], softBg = softBg.asInstanceOf[js.Any], softColor = softColor.asInstanceOf[js.Any], softDisabledBg = softDisabledBg.asInstanceOf[js.Any], softDisabledColor = softDisabledColor.asInstanceOf[js.Any], softHoverBg = softHoverBg.asInstanceOf[js.Any], solidActiveBg = solidActiveBg.asInstanceOf[js.Any], solidBg = solidBg.asInstanceOf[js.Any], solidColor = solidColor.asInstanceOf[js.Any], solidDisabledBg = solidDisabledBg.asInstanceOf[js.Any], solidDisabledColor = solidDisabledColor.asInstanceOf[js.Any], solidHoverBg = solidHoverBg.asInstanceOf[js.Any])
      __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
      __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
      __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
      __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
      __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
      __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
      __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
      __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
      __obj.updateDynamic("800")(`800`.asInstanceOf[js.Any])
      __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPaletteRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPaletteRange] (val x: Self) extends AnyVal {
      
      inline def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      inline def set200(value: String): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
      
      inline def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
      
      inline def set400(value: String): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
      
      inline def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      inline def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      inline def set600(value: String): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
      
      inline def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
      
      inline def set800(value: String): Self = StObject.set(x, "800", value.asInstanceOf[js.Any])
      
      inline def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
      
      inline def setDarkChannel(value: String): Self = StObject.set(x, "darkChannel", value.asInstanceOf[js.Any])
      
      inline def setLightChannel(value: String): Self = StObject.set(x, "lightChannel", value.asInstanceOf[js.Any])
      
      inline def setMainChannel(value: String): Self = StObject.set(x, "mainChannel", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultPaletteText extends StObject {
    
    var primary: String
    
    var secondary: String
    
    var tertiary: String
  }
  object DefaultPaletteText {
    
    inline def apply(primary: String, secondary: String, tertiary: String): DefaultPaletteText = {
      val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], tertiary = tertiary.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPaletteText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPaletteText] (val x: Self) extends AnyVal {
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setTertiary(value: String): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * ====================================================
    * Developer facing types, they can augment these types.
    * ====================================================
    */
  trait DefaultPaletteVariant extends StObject {
    
    var outlinedActiveBg: String
    
    var outlinedBorder: String
    
    var outlinedColor: String
    
    var outlinedDisabledBorder: String
    
    var outlinedDisabledColor: String
    
    var outlinedHoverBg: String
    
    var outlinedHoverBorder: String
    
    var plainActiveBg: String
    
    var plainColor: String
    
    var plainDisabledColor: String
    
    var plainHoverBg: String
    
    var softActiveBg: String
    
    var softBg: String
    
    var softColor: String
    
    var softDisabledBg: String
    
    var softDisabledColor: String
    
    var softHoverBg: String
    
    var solidActiveBg: String
    
    var solidBg: String
    
    var solidColor: String
    
    var solidDisabledBg: String
    
    var solidDisabledColor: String
    
    var solidHoverBg: String
  }
  object DefaultPaletteVariant {
    
    inline def apply(
      outlinedActiveBg: String,
      outlinedBorder: String,
      outlinedColor: String,
      outlinedDisabledBorder: String,
      outlinedDisabledColor: String,
      outlinedHoverBg: String,
      outlinedHoverBorder: String,
      plainActiveBg: String,
      plainColor: String,
      plainDisabledColor: String,
      plainHoverBg: String,
      softActiveBg: String,
      softBg: String,
      softColor: String,
      softDisabledBg: String,
      softDisabledColor: String,
      softHoverBg: String,
      solidActiveBg: String,
      solidBg: String,
      solidColor: String,
      solidDisabledBg: String,
      solidDisabledColor: String,
      solidHoverBg: String
    ): DefaultPaletteVariant = {
      val __obj = js.Dynamic.literal(outlinedActiveBg = outlinedActiveBg.asInstanceOf[js.Any], outlinedBorder = outlinedBorder.asInstanceOf[js.Any], outlinedColor = outlinedColor.asInstanceOf[js.Any], outlinedDisabledBorder = outlinedDisabledBorder.asInstanceOf[js.Any], outlinedDisabledColor = outlinedDisabledColor.asInstanceOf[js.Any], outlinedHoverBg = outlinedHoverBg.asInstanceOf[js.Any], outlinedHoverBorder = outlinedHoverBorder.asInstanceOf[js.Any], plainActiveBg = plainActiveBg.asInstanceOf[js.Any], plainColor = plainColor.asInstanceOf[js.Any], plainDisabledColor = plainDisabledColor.asInstanceOf[js.Any], plainHoverBg = plainHoverBg.asInstanceOf[js.Any], softActiveBg = softActiveBg.asInstanceOf[js.Any], softBg = softBg.asInstanceOf[js.Any], softColor = softColor.asInstanceOf[js.Any], softDisabledBg = softDisabledBg.asInstanceOf[js.Any], softDisabledColor = softDisabledColor.asInstanceOf[js.Any], softHoverBg = softHoverBg.asInstanceOf[js.Any], solidActiveBg = solidActiveBg.asInstanceOf[js.Any], solidBg = solidBg.asInstanceOf[js.Any], solidColor = solidColor.asInstanceOf[js.Any], solidDisabledBg = solidDisabledBg.asInstanceOf[js.Any], solidDisabledColor = solidDisabledColor.asInstanceOf[js.Any], solidHoverBg = solidHoverBg.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPaletteVariant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPaletteVariant] (val x: Self) extends AnyVal {
      
      inline def setOutlinedActiveBg(value: String): Self = StObject.set(x, "outlinedActiveBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedBorder(value: String): Self = StObject.set(x, "outlinedBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedColor(value: String): Self = StObject.set(x, "outlinedColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledBorder(value: String): Self = StObject.set(x, "outlinedDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledColor(value: String): Self = StObject.set(x, "outlinedDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverBg(value: String): Self = StObject.set(x, "outlinedHoverBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverBorder(value: String): Self = StObject.set(x, "outlinedHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveBg(value: String): Self = StObject.set(x, "plainActiveBg", value.asInstanceOf[js.Any])
      
      inline def setPlainColor(value: String): Self = StObject.set(x, "plainColor", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledColor(value: String): Self = StObject.set(x, "plainDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverBg(value: String): Self = StObject.set(x, "plainHoverBg", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveBg(value: String): Self = StObject.set(x, "softActiveBg", value.asInstanceOf[js.Any])
      
      inline def setSoftBg(value: String): Self = StObject.set(x, "softBg", value.asInstanceOf[js.Any])
      
      inline def setSoftColor(value: String): Self = StObject.set(x, "softColor", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledBg(value: String): Self = StObject.set(x, "softDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledColor(value: String): Self = StObject.set(x, "softDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverBg(value: String): Self = StObject.set(x, "softHoverBg", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveBg(value: String): Self = StObject.set(x, "solidActiveBg", value.asInstanceOf[js.Any])
      
      inline def setSolidBg(value: String): Self = StObject.set(x, "solidBg", value.asInstanceOf[js.Any])
      
      inline def setSolidColor(value: String): Self = StObject.set(x, "solidColor", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledBg(value: String): Self = StObject.set(x, "solidDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledColor(value: String): Self = StObject.set(x, "solidDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverBg(value: String): Self = StObject.set(x, "solidHoverBg", value.asInstanceOf[js.Any])
    }
  }
  
  object DefaultProperty {
    
    inline def Bg: "Bg" = "Bg".asInstanceOf["Bg"]
    
    inline def Border: "Border" = "Border".asInstanceOf["Border"]
    
    inline def Color: "Color" = "Color".asInstanceOf["Color"]
  }
  type DefaultProperty = "Color" | "Bg" | "Border"
  
  object DefaultState {
    
    inline def Active: "Active" = "Active".asInstanceOf["Active"]
    
    inline def Disabled: "Disabled" = "Disabled".asInstanceOf["Disabled"]
    
    inline def Hover: "Hover" = "Hover".asInstanceOf["Hover"]
  }
  type DefaultState = "Hover" | "Active" | "Disabled"
  
  object DefaultVariant {
    
    inline def outlined: "outlined" = "outlined".asInstanceOf["outlined"]
    
    inline def plain: "plain" = "plain".asInstanceOf["plain"]
    
    inline def soft: "soft" = "soft".asInstanceOf["soft"]
    
    inline def solid: "solid" = "solid".asInstanceOf["solid"]
  }
  type DefaultVariant = "plain" | "outlined" | "soft" | "solid"
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ k in @mui/joy.@mui/joy/styles/types/utils.OverridableStringUnion<keyof @mui/joy.anon.Background, @mui/joy.@mui/joy/styles/types/colorSystem.PaletteOverrides> ]: k extends keyof @mui/joy.anon.Background? @mui/joy.anon.Background[k] : any} */ trait Palette extends StObject {
    
    var mode: "light" | "dark"
  }
  object Palette {
    
    inline def apply(mode: "light" | "dark"): Palette = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Palette]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Palette] (val x: Self) extends AnyVal {
      
      inline def setMode(value: "light" | "dark"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  type PaletteBackground = OverridableRecord[DefaultPaletteBackground, PaletteBackgroundOverrides, String]
  
  trait PaletteBackgroundOverrides extends StObject
  
  type PaletteCommon = OverridableRecord[DefaultPaletteCommon, PaletteCommonOverrides, String]
  
  trait PaletteCommonOverrides extends StObject
  
  type PaletteDanger = OverridableRecord[PaletteRange, PaletteDangerOverrides, String]
  
  trait PaletteDangerOverrides extends StObject
  
  type PaletteInfo = OverridableRecord[PaletteRange, PaletteInfoOverrides, String]
  
  trait PaletteInfoOverrides extends StObject
  
  type PaletteNeutral = OverridableRecord[PaletteRange & OutlinedHoverColor, PaletteNeutralOverrides, String]
  
  trait PaletteNeutralOverrides extends StObject
  
  type PaletteOptions = MergeDefault[Palette, Common]
  
  trait PaletteOverrides extends StObject
  
  type PalettePrimary = OverridableRecord[PaletteRange, PalettePrimaryOverrides, String]
  
  trait PalettePrimaryOverrides extends StObject
  
  type PaletteRange = OverridableRecord[DefaultPaletteRange, PaletteRangeOverrides, String]
  
  trait PaletteRangeOverrides extends StObject
  
  type PaletteSuccess = OverridableRecord[PaletteRange, PaletteSuccessOverrides, String]
  
  trait PaletteSuccessOverrides extends StObject
  
  type PaletteText = OverridableRecord[DefaultPaletteText, PaletteTextOverrides, String]
  
  trait PaletteTextOverrides extends StObject
  
  type PaletteVariant = Record[/* template literal string: ${DefaultVariant}${DefaultProperty} */ String, String]
  
  type PaletteWarning = OverridableRecord[PaletteRange, PaletteWarningOverrides, String]
  
  trait PaletteWarningOverrides extends StObject
}
