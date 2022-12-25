package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.`61`
import com.olvind.mui.muiJoy.anon.`62`
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import com.olvind.mui.muiTypes.mod.Simplify
import com.olvind.mui.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTypesColorSystemMod {
  
  type ApplyColorInversion[T /* <: `61` */] = Simplify[(Omit[T, "color"]) & `62`[T]]
  
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
  
  type ExtendedPaletteRange = OverridableStringUnion[
    "50" | "100" | "200" | "300" | "400" | "500" | "600" | "700" | "800" | "900" | "mainChannel" | "lightChannel" | "darkChannel", 
    PaletteRangeOverrides
  ]
  
  trait Palette extends StObject {
    
    var background: PaletteBackground
    
    var common: PaletteCommon
    
    var danger: PaletteDanger
    
    var divider: String
    
    var focusVisible: String
    
    var info: PaletteInfo
    
    var mode: "light" | "dark"
    
    var neutral: PaletteNeutral
    
    var primary: PalettePrimary
    
    var success: PaletteSuccess
    
    var text: PaletteText
    
    var warning: PaletteWarning
  }
  object Palette {
    
    inline def apply(
      background: PaletteBackground,
      common: PaletteCommon,
      danger: PaletteDanger,
      divider: String,
      focusVisible: String,
      info: PaletteInfo,
      mode: "light" | "dark",
      neutral: PaletteNeutral,
      primary: PalettePrimary,
      success: PaletteSuccess,
      text: PaletteText,
      warning: PaletteWarning
    ): Palette = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Palette]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Palette] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: PaletteBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setCommon(value: PaletteCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setDanger(value: PaletteDanger): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: PaletteInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setMode(value: "light" | "dark"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setNeutral(value: PaletteNeutral): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: PalettePrimary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: PaletteSuccess): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setText(value: PaletteText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: PaletteWarning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaletteBackground extends StObject {
    
    var backdrop: String
    
    var body: String
    
    var level1: String
    
    var level2: String
    
    var level3: String
    
    var popup: String
    
    var surface: String
    
    var tooltip: String
  }
  object PaletteBackground {
    
    inline def apply(
      backdrop: String,
      body: String,
      level1: String,
      level2: String,
      level3: String,
      popup: String,
      surface: String,
      tooltip: String
    ): PaletteBackground = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], level1 = level1.asInstanceOf[js.Any], level2 = level2.asInstanceOf[js.Any], level3 = level3.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteBackground]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteBackground] (val x: Self) extends AnyVal {
      
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
  
  trait PaletteCommon extends StObject {
    
    var black: String
    
    var white: String
  }
  object PaletteCommon {
    
    inline def apply(black: String, white: String): PaletteCommon = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteCommon] (val x: Self) extends AnyVal {
      
      inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  type PaletteDanger = PaletteRange
  
  type PaletteInfo = PaletteRange
  
  type PaletteNeutral = PaletteRange
  
  type PalettePrimary = PaletteRange
  
  /* Inlined parent std.Record<@mui/joy.@mui/joy/styles/types/colorSystem.ExtendedPaletteRange, string> */
  /* Inlined parent @mui/joy.@mui/joy/styles/types/colorSystem.PaletteVariant */
  trait PaletteRange extends StObject {
    
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
    
    var outlinedActiveBg: String
    
    var outlinedActiveBorder: String
    
    var outlinedActiveColor: String
    
    var outlinedBg: String
    
    var outlinedBorder: String
    
    var outlinedColor: String
    
    var outlinedDisabledBg: String
    
    var outlinedDisabledBorder: String
    
    var outlinedDisabledColor: String
    
    var outlinedHoverBg: String
    
    var outlinedHoverBorder: String
    
    var outlinedHoverColor: String
    
    var plainActiveBg: String
    
    var plainActiveBorder: String
    
    var plainActiveColor: String
    
    var plainBg: String
    
    var plainBorder: String
    
    var plainColor: String
    
    var plainDisabledBg: String
    
    var plainDisabledBorder: String
    
    var plainDisabledColor: String
    
    var plainHoverBg: String
    
    var plainHoverBorder: String
    
    var plainHoverColor: String
    
    var softActiveBg: String
    
    var softActiveBorder: String
    
    var softActiveColor: String
    
    var softBg: String
    
    var softBorder: String
    
    var softColor: String
    
    var softDisabledBg: String
    
    var softDisabledBorder: String
    
    var softDisabledColor: String
    
    var softHoverBg: String
    
    var softHoverBorder: String
    
    var softHoverColor: String
    
    var solidActiveBg: String
    
    var solidActiveBorder: String
    
    var solidActiveColor: String
    
    var solidBg: String
    
    var solidBorder: String
    
    var solidColor: String
    
    var solidDisabledBg: String
    
    var solidDisabledBorder: String
    
    var solidDisabledColor: String
    
    var solidHoverBg: String
    
    var solidHoverBorder: String
    
    var solidHoverColor: String
  }
  object PaletteRange {
    
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
      outlinedActiveBorder: String,
      outlinedActiveColor: String,
      outlinedBg: String,
      outlinedBorder: String,
      outlinedColor: String,
      outlinedDisabledBg: String,
      outlinedDisabledBorder: String,
      outlinedDisabledColor: String,
      outlinedHoverBg: String,
      outlinedHoverBorder: String,
      outlinedHoverColor: String,
      plainActiveBg: String,
      plainActiveBorder: String,
      plainActiveColor: String,
      plainBg: String,
      plainBorder: String,
      plainColor: String,
      plainDisabledBg: String,
      plainDisabledBorder: String,
      plainDisabledColor: String,
      plainHoverBg: String,
      plainHoverBorder: String,
      plainHoverColor: String,
      softActiveBg: String,
      softActiveBorder: String,
      softActiveColor: String,
      softBg: String,
      softBorder: String,
      softColor: String,
      softDisabledBg: String,
      softDisabledBorder: String,
      softDisabledColor: String,
      softHoverBg: String,
      softHoverBorder: String,
      softHoverColor: String,
      solidActiveBg: String,
      solidActiveBorder: String,
      solidActiveColor: String,
      solidBg: String,
      solidBorder: String,
      solidColor: String,
      solidDisabledBg: String,
      solidDisabledBorder: String,
      solidDisabledColor: String,
      solidHoverBg: String,
      solidHoverBorder: String,
      solidHoverColor: String
    ): PaletteRange = {
      val __obj = js.Dynamic.literal(darkChannel = darkChannel.asInstanceOf[js.Any], lightChannel = lightChannel.asInstanceOf[js.Any], mainChannel = mainChannel.asInstanceOf[js.Any], outlinedActiveBg = outlinedActiveBg.asInstanceOf[js.Any], outlinedActiveBorder = outlinedActiveBorder.asInstanceOf[js.Any], outlinedActiveColor = outlinedActiveColor.asInstanceOf[js.Any], outlinedBg = outlinedBg.asInstanceOf[js.Any], outlinedBorder = outlinedBorder.asInstanceOf[js.Any], outlinedColor = outlinedColor.asInstanceOf[js.Any], outlinedDisabledBg = outlinedDisabledBg.asInstanceOf[js.Any], outlinedDisabledBorder = outlinedDisabledBorder.asInstanceOf[js.Any], outlinedDisabledColor = outlinedDisabledColor.asInstanceOf[js.Any], outlinedHoverBg = outlinedHoverBg.asInstanceOf[js.Any], outlinedHoverBorder = outlinedHoverBorder.asInstanceOf[js.Any], outlinedHoverColor = outlinedHoverColor.asInstanceOf[js.Any], plainActiveBg = plainActiveBg.asInstanceOf[js.Any], plainActiveBorder = plainActiveBorder.asInstanceOf[js.Any], plainActiveColor = plainActiveColor.asInstanceOf[js.Any], plainBg = plainBg.asInstanceOf[js.Any], plainBorder = plainBorder.asInstanceOf[js.Any], plainColor = plainColor.asInstanceOf[js.Any], plainDisabledBg = plainDisabledBg.asInstanceOf[js.Any], plainDisabledBorder = plainDisabledBorder.asInstanceOf[js.Any], plainDisabledColor = plainDisabledColor.asInstanceOf[js.Any], plainHoverBg = plainHoverBg.asInstanceOf[js.Any], plainHoverBorder = plainHoverBorder.asInstanceOf[js.Any], plainHoverColor = plainHoverColor.asInstanceOf[js.Any], softActiveBg = softActiveBg.asInstanceOf[js.Any], softActiveBorder = softActiveBorder.asInstanceOf[js.Any], softActiveColor = softActiveColor.asInstanceOf[js.Any], softBg = softBg.asInstanceOf[js.Any], softBorder = softBorder.asInstanceOf[js.Any], softColor = softColor.asInstanceOf[js.Any], softDisabledBg = softDisabledBg.asInstanceOf[js.Any], softDisabledBorder = softDisabledBorder.asInstanceOf[js.Any], softDisabledColor = softDisabledColor.asInstanceOf[js.Any], softHoverBg = softHoverBg.asInstanceOf[js.Any], softHoverBorder = softHoverBorder.asInstanceOf[js.Any], softHoverColor = softHoverColor.asInstanceOf[js.Any], solidActiveBg = solidActiveBg.asInstanceOf[js.Any], solidActiveBorder = solidActiveBorder.asInstanceOf[js.Any], solidActiveColor = solidActiveColor.asInstanceOf[js.Any], solidBg = solidBg.asInstanceOf[js.Any], solidBorder = solidBorder.asInstanceOf[js.Any], solidColor = solidColor.asInstanceOf[js.Any], solidDisabledBg = solidDisabledBg.asInstanceOf[js.Any], solidDisabledBorder = solidDisabledBorder.asInstanceOf[js.Any], solidDisabledColor = solidDisabledColor.asInstanceOf[js.Any], solidHoverBg = solidHoverBg.asInstanceOf[js.Any], solidHoverBorder = solidHoverBorder.asInstanceOf[js.Any], solidHoverColor = solidHoverColor.asInstanceOf[js.Any])
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
      __obj.asInstanceOf[PaletteRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteRange] (val x: Self) extends AnyVal {
      
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
      
      inline def setOutlinedActiveBg(value: String): Self = StObject.set(x, "outlinedActiveBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedActiveBorder(value: String): Self = StObject.set(x, "outlinedActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedActiveColor(value: String): Self = StObject.set(x, "outlinedActiveColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedBg(value: String): Self = StObject.set(x, "outlinedBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedBorder(value: String): Self = StObject.set(x, "outlinedBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedColor(value: String): Self = StObject.set(x, "outlinedColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledBg(value: String): Self = StObject.set(x, "outlinedDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledBorder(value: String): Self = StObject.set(x, "outlinedDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledColor(value: String): Self = StObject.set(x, "outlinedDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverBg(value: String): Self = StObject.set(x, "outlinedHoverBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverBorder(value: String): Self = StObject.set(x, "outlinedHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverColor(value: String): Self = StObject.set(x, "outlinedHoverColor", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveBg(value: String): Self = StObject.set(x, "plainActiveBg", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveBorder(value: String): Self = StObject.set(x, "plainActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveColor(value: String): Self = StObject.set(x, "plainActiveColor", value.asInstanceOf[js.Any])
      
      inline def setPlainBg(value: String): Self = StObject.set(x, "plainBg", value.asInstanceOf[js.Any])
      
      inline def setPlainBorder(value: String): Self = StObject.set(x, "plainBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainColor(value: String): Self = StObject.set(x, "plainColor", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledBg(value: String): Self = StObject.set(x, "plainDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledBorder(value: String): Self = StObject.set(x, "plainDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledColor(value: String): Self = StObject.set(x, "plainDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverBg(value: String): Self = StObject.set(x, "plainHoverBg", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverBorder(value: String): Self = StObject.set(x, "plainHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverColor(value: String): Self = StObject.set(x, "plainHoverColor", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveBg(value: String): Self = StObject.set(x, "softActiveBg", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveBorder(value: String): Self = StObject.set(x, "softActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveColor(value: String): Self = StObject.set(x, "softActiveColor", value.asInstanceOf[js.Any])
      
      inline def setSoftBg(value: String): Self = StObject.set(x, "softBg", value.asInstanceOf[js.Any])
      
      inline def setSoftBorder(value: String): Self = StObject.set(x, "softBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftColor(value: String): Self = StObject.set(x, "softColor", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledBg(value: String): Self = StObject.set(x, "softDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledBorder(value: String): Self = StObject.set(x, "softDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledColor(value: String): Self = StObject.set(x, "softDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverBg(value: String): Self = StObject.set(x, "softHoverBg", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverBorder(value: String): Self = StObject.set(x, "softHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverColor(value: String): Self = StObject.set(x, "softHoverColor", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveBg(value: String): Self = StObject.set(x, "solidActiveBg", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveBorder(value: String): Self = StObject.set(x, "solidActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveColor(value: String): Self = StObject.set(x, "solidActiveColor", value.asInstanceOf[js.Any])
      
      inline def setSolidBg(value: String): Self = StObject.set(x, "solidBg", value.asInstanceOf[js.Any])
      
      inline def setSolidBorder(value: String): Self = StObject.set(x, "solidBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidColor(value: String): Self = StObject.set(x, "solidColor", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledBg(value: String): Self = StObject.set(x, "solidDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledBorder(value: String): Self = StObject.set(x, "solidDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledColor(value: String): Self = StObject.set(x, "solidDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverBg(value: String): Self = StObject.set(x, "solidHoverBg", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverBorder(value: String): Self = StObject.set(x, "solidHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverColor(value: String): Self = StObject.set(x, "solidHoverColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaletteRangeOverrides extends StObject
  
  type PaletteSuccess = PaletteRange
  
  trait PaletteText extends StObject {
    
    var primary: String
    
    var secondary: String
    
    var tertiary: String
  }
  object PaletteText {
    
    inline def apply(primary: String, secondary: String, tertiary: String): PaletteText = {
      val __obj = js.Dynamic.literal(primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], tertiary = tertiary.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteText] (val x: Self) extends AnyVal {
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setTertiary(value: String): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaletteVariant extends StObject {
    
    var outlinedActiveBg: String
    
    var outlinedActiveBorder: String
    
    var outlinedActiveColor: String
    
    var outlinedBg: String
    
    var outlinedBorder: String
    
    var outlinedColor: String
    
    var outlinedDisabledBg: String
    
    var outlinedDisabledBorder: String
    
    var outlinedDisabledColor: String
    
    var outlinedHoverBg: String
    
    var outlinedHoverBorder: String
    
    var outlinedHoverColor: String
    
    var plainActiveBg: String
    
    var plainActiveBorder: String
    
    var plainActiveColor: String
    
    var plainBg: String
    
    var plainBorder: String
    
    var plainColor: String
    
    var plainDisabledBg: String
    
    var plainDisabledBorder: String
    
    var plainDisabledColor: String
    
    var plainHoverBg: String
    
    var plainHoverBorder: String
    
    var plainHoverColor: String
    
    var softActiveBg: String
    
    var softActiveBorder: String
    
    var softActiveColor: String
    
    var softBg: String
    
    var softBorder: String
    
    var softColor: String
    
    var softDisabledBg: String
    
    var softDisabledBorder: String
    
    var softDisabledColor: String
    
    var softHoverBg: String
    
    var softHoverBorder: String
    
    var softHoverColor: String
    
    var solidActiveBg: String
    
    var solidActiveBorder: String
    
    var solidActiveColor: String
    
    var solidBg: String
    
    var solidBorder: String
    
    var solidColor: String
    
    var solidDisabledBg: String
    
    var solidDisabledBorder: String
    
    var solidDisabledColor: String
    
    var solidHoverBg: String
    
    var solidHoverBorder: String
    
    var solidHoverColor: String
  }
  object PaletteVariant {
    
    inline def apply(
      outlinedActiveBg: String,
      outlinedActiveBorder: String,
      outlinedActiveColor: String,
      outlinedBg: String,
      outlinedBorder: String,
      outlinedColor: String,
      outlinedDisabledBg: String,
      outlinedDisabledBorder: String,
      outlinedDisabledColor: String,
      outlinedHoverBg: String,
      outlinedHoverBorder: String,
      outlinedHoverColor: String,
      plainActiveBg: String,
      plainActiveBorder: String,
      plainActiveColor: String,
      plainBg: String,
      plainBorder: String,
      plainColor: String,
      plainDisabledBg: String,
      plainDisabledBorder: String,
      plainDisabledColor: String,
      plainHoverBg: String,
      plainHoverBorder: String,
      plainHoverColor: String,
      softActiveBg: String,
      softActiveBorder: String,
      softActiveColor: String,
      softBg: String,
      softBorder: String,
      softColor: String,
      softDisabledBg: String,
      softDisabledBorder: String,
      softDisabledColor: String,
      softHoverBg: String,
      softHoverBorder: String,
      softHoverColor: String,
      solidActiveBg: String,
      solidActiveBorder: String,
      solidActiveColor: String,
      solidBg: String,
      solidBorder: String,
      solidColor: String,
      solidDisabledBg: String,
      solidDisabledBorder: String,
      solidDisabledColor: String,
      solidHoverBg: String,
      solidHoverBorder: String,
      solidHoverColor: String
    ): PaletteVariant = {
      val __obj = js.Dynamic.literal(outlinedActiveBg = outlinedActiveBg.asInstanceOf[js.Any], outlinedActiveBorder = outlinedActiveBorder.asInstanceOf[js.Any], outlinedActiveColor = outlinedActiveColor.asInstanceOf[js.Any], outlinedBg = outlinedBg.asInstanceOf[js.Any], outlinedBorder = outlinedBorder.asInstanceOf[js.Any], outlinedColor = outlinedColor.asInstanceOf[js.Any], outlinedDisabledBg = outlinedDisabledBg.asInstanceOf[js.Any], outlinedDisabledBorder = outlinedDisabledBorder.asInstanceOf[js.Any], outlinedDisabledColor = outlinedDisabledColor.asInstanceOf[js.Any], outlinedHoverBg = outlinedHoverBg.asInstanceOf[js.Any], outlinedHoverBorder = outlinedHoverBorder.asInstanceOf[js.Any], outlinedHoverColor = outlinedHoverColor.asInstanceOf[js.Any], plainActiveBg = plainActiveBg.asInstanceOf[js.Any], plainActiveBorder = plainActiveBorder.asInstanceOf[js.Any], plainActiveColor = plainActiveColor.asInstanceOf[js.Any], plainBg = plainBg.asInstanceOf[js.Any], plainBorder = plainBorder.asInstanceOf[js.Any], plainColor = plainColor.asInstanceOf[js.Any], plainDisabledBg = plainDisabledBg.asInstanceOf[js.Any], plainDisabledBorder = plainDisabledBorder.asInstanceOf[js.Any], plainDisabledColor = plainDisabledColor.asInstanceOf[js.Any], plainHoverBg = plainHoverBg.asInstanceOf[js.Any], plainHoverBorder = plainHoverBorder.asInstanceOf[js.Any], plainHoverColor = plainHoverColor.asInstanceOf[js.Any], softActiveBg = softActiveBg.asInstanceOf[js.Any], softActiveBorder = softActiveBorder.asInstanceOf[js.Any], softActiveColor = softActiveColor.asInstanceOf[js.Any], softBg = softBg.asInstanceOf[js.Any], softBorder = softBorder.asInstanceOf[js.Any], softColor = softColor.asInstanceOf[js.Any], softDisabledBg = softDisabledBg.asInstanceOf[js.Any], softDisabledBorder = softDisabledBorder.asInstanceOf[js.Any], softDisabledColor = softDisabledColor.asInstanceOf[js.Any], softHoverBg = softHoverBg.asInstanceOf[js.Any], softHoverBorder = softHoverBorder.asInstanceOf[js.Any], softHoverColor = softHoverColor.asInstanceOf[js.Any], solidActiveBg = solidActiveBg.asInstanceOf[js.Any], solidActiveBorder = solidActiveBorder.asInstanceOf[js.Any], solidActiveColor = solidActiveColor.asInstanceOf[js.Any], solidBg = solidBg.asInstanceOf[js.Any], solidBorder = solidBorder.asInstanceOf[js.Any], solidColor = solidColor.asInstanceOf[js.Any], solidDisabledBg = solidDisabledBg.asInstanceOf[js.Any], solidDisabledBorder = solidDisabledBorder.asInstanceOf[js.Any], solidDisabledColor = solidDisabledColor.asInstanceOf[js.Any], solidHoverBg = solidHoverBg.asInstanceOf[js.Any], solidHoverBorder = solidHoverBorder.asInstanceOf[js.Any], solidHoverColor = solidHoverColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteVariant]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PaletteVariant] (val x: Self) extends AnyVal {
      
      inline def setOutlinedActiveBg(value: String): Self = StObject.set(x, "outlinedActiveBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedActiveBorder(value: String): Self = StObject.set(x, "outlinedActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedActiveColor(value: String): Self = StObject.set(x, "outlinedActiveColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedBg(value: String): Self = StObject.set(x, "outlinedBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedBorder(value: String): Self = StObject.set(x, "outlinedBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedColor(value: String): Self = StObject.set(x, "outlinedColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledBg(value: String): Self = StObject.set(x, "outlinedDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledBorder(value: String): Self = StObject.set(x, "outlinedDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedDisabledColor(value: String): Self = StObject.set(x, "outlinedDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverBg(value: String): Self = StObject.set(x, "outlinedHoverBg", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverBorder(value: String): Self = StObject.set(x, "outlinedHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setOutlinedHoverColor(value: String): Self = StObject.set(x, "outlinedHoverColor", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveBg(value: String): Self = StObject.set(x, "plainActiveBg", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveBorder(value: String): Self = StObject.set(x, "plainActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainActiveColor(value: String): Self = StObject.set(x, "plainActiveColor", value.asInstanceOf[js.Any])
      
      inline def setPlainBg(value: String): Self = StObject.set(x, "plainBg", value.asInstanceOf[js.Any])
      
      inline def setPlainBorder(value: String): Self = StObject.set(x, "plainBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainColor(value: String): Self = StObject.set(x, "plainColor", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledBg(value: String): Self = StObject.set(x, "plainDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledBorder(value: String): Self = StObject.set(x, "plainDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainDisabledColor(value: String): Self = StObject.set(x, "plainDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverBg(value: String): Self = StObject.set(x, "plainHoverBg", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverBorder(value: String): Self = StObject.set(x, "plainHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setPlainHoverColor(value: String): Self = StObject.set(x, "plainHoverColor", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveBg(value: String): Self = StObject.set(x, "softActiveBg", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveBorder(value: String): Self = StObject.set(x, "softActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftActiveColor(value: String): Self = StObject.set(x, "softActiveColor", value.asInstanceOf[js.Any])
      
      inline def setSoftBg(value: String): Self = StObject.set(x, "softBg", value.asInstanceOf[js.Any])
      
      inline def setSoftBorder(value: String): Self = StObject.set(x, "softBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftColor(value: String): Self = StObject.set(x, "softColor", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledBg(value: String): Self = StObject.set(x, "softDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledBorder(value: String): Self = StObject.set(x, "softDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftDisabledColor(value: String): Self = StObject.set(x, "softDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverBg(value: String): Self = StObject.set(x, "softHoverBg", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverBorder(value: String): Self = StObject.set(x, "softHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setSoftHoverColor(value: String): Self = StObject.set(x, "softHoverColor", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveBg(value: String): Self = StObject.set(x, "solidActiveBg", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveBorder(value: String): Self = StObject.set(x, "solidActiveBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidActiveColor(value: String): Self = StObject.set(x, "solidActiveColor", value.asInstanceOf[js.Any])
      
      inline def setSolidBg(value: String): Self = StObject.set(x, "solidBg", value.asInstanceOf[js.Any])
      
      inline def setSolidBorder(value: String): Self = StObject.set(x, "solidBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidColor(value: String): Self = StObject.set(x, "solidColor", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledBg(value: String): Self = StObject.set(x, "solidDisabledBg", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledBorder(value: String): Self = StObject.set(x, "solidDisabledBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidDisabledColor(value: String): Self = StObject.set(x, "solidDisabledColor", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverBg(value: String): Self = StObject.set(x, "solidHoverBg", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverBorder(value: String): Self = StObject.set(x, "solidHoverBorder", value.asInstanceOf[js.Any])
      
      inline def setSolidHoverColor(value: String): Self = StObject.set(x, "solidHoverColor", value.asInstanceOf[js.Any])
    }
  }
  
  type PaletteWarning = PaletteRange
}
