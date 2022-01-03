package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Dark
import com.olvind.mui.muiMaterial.anon.PartialCommonColors
import com.olvind.mui.muiMaterial.anon.PartialTypeAction
import com.olvind.mui.muiMaterial.anon.PartialTypeBackground
import com.olvind.mui.muiMaterial.anon.PartialTypeText
import com.olvind.mui.muiMaterial.mod.Color
import com.olvind.mui.muiMaterial.mod.PaletteMode
import com.olvind.mui.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createPaletteMod {
  
  @JSImport("@mui/material/styles/createPalette", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(palette: PaletteOptions): Palette = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(palette.asInstanceOf[js.Any]).asInstanceOf[Palette]
  
  @JSImport("@mui/material/styles/createPalette", "dark")
  @js.native
  val dark: TypeObject = js.native
  
  @JSImport("@mui/material/styles/createPalette", "light")
  @js.native
  val light: TypeObject = js.native
  
  /* Inlined std.Partial<@mui/material.@mui/material.Color> */
  trait ColorPartial
    extends StObject
       with PaletteColorOptions {
    
    var `100`: js.UndefOr[String] = js.undefined
    
    var `200`: js.UndefOr[String] = js.undefined
    
    var `300`: js.UndefOr[String] = js.undefined
    
    var `400`: js.UndefOr[String] = js.undefined
    
    var `50`: js.UndefOr[String] = js.undefined
    
    var `500`: js.UndefOr[String] = js.undefined
    
    var `600`: js.UndefOr[String] = js.undefined
    
    var `700`: js.UndefOr[String] = js.undefined
    
    var `800`: js.UndefOr[String] = js.undefined
    
    var `900`: js.UndefOr[String] = js.undefined
    
    var A100: js.UndefOr[String] = js.undefined
    
    var A200: js.UndefOr[String] = js.undefined
    
    var A400: js.UndefOr[String] = js.undefined
    
    var A700: js.UndefOr[String] = js.undefined
  }
  object ColorPartial {
    
    inline def apply(): ColorPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorPartial]
    }
    
    extension [Self <: ColorPartial](x: Self) {
      
      inline def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      inline def set100Undefined: Self = StObject.set(x, "100", js.undefined)
      
      inline def set200(value: String): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
      
      inline def set200Undefined: Self = StObject.set(x, "200", js.undefined)
      
      inline def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
      
      inline def set300Undefined: Self = StObject.set(x, "300", js.undefined)
      
      inline def set400(value: String): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
      
      inline def set400Undefined: Self = StObject.set(x, "400", js.undefined)
      
      inline def set50(value: String): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      inline def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      inline def set500Undefined: Self = StObject.set(x, "500", js.undefined)
      
      inline def set50Undefined: Self = StObject.set(x, "50", js.undefined)
      
      inline def set600(value: String): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
      
      inline def set600Undefined: Self = StObject.set(x, "600", js.undefined)
      
      inline def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
      
      inline def set700Undefined: Self = StObject.set(x, "700", js.undefined)
      
      inline def set800(value: String): Self = StObject.set(x, "800", value.asInstanceOf[js.Any])
      
      inline def set800Undefined: Self = StObject.set(x, "800", js.undefined)
      
      inline def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
      
      inline def set900Undefined: Self = StObject.set(x, "900", js.undefined)
      
      inline def setA100(value: String): Self = StObject.set(x, "A100", value.asInstanceOf[js.Any])
      
      inline def setA100Undefined: Self = StObject.set(x, "A100", js.undefined)
      
      inline def setA200(value: String): Self = StObject.set(x, "A200", value.asInstanceOf[js.Any])
      
      inline def setA200Undefined: Self = StObject.set(x, "A200", js.undefined)
      
      inline def setA400(value: String): Self = StObject.set(x, "A400", value.asInstanceOf[js.Any])
      
      inline def setA400Undefined: Self = StObject.set(x, "A400", js.undefined)
      
      inline def setA700(value: String): Self = StObject.set(x, "A700", value.asInstanceOf[js.Any])
      
      inline def setA700Undefined: Self = StObject.set(x, "A700", js.undefined)
    }
  }
  
  trait CommonColors extends StObject {
    
    var black: String
    
    var white: String
  }
  object CommonColors {
    
    inline def apply(black: String, white: String): CommonColors = {
      val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonColors]
    }
    
    extension [Self <: CommonColors](x: Self) {
      
      inline def setBlack(value: String): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    }
  }
  
  trait Palette extends StObject {
    
    var action: TypeAction
    
    def augmentColor(options: PaletteAugmentColorOptions): PaletteColor
    
    var background: TypeBackground
    
    var common: CommonColors
    
    var contrastThreshold: Double
    
    var divider: TypeDivider
    
    var error: PaletteColor
    
    def getContrastText(background: String): String
    
    var grey: Color
    
    var info: PaletteColor
    
    var mode: PaletteMode
    
    var primary: PaletteColor
    
    var secondary: PaletteColor
    
    var success: PaletteColor
    
    var text: TypeText
    
    var tonalOffset: PaletteTonalOffset
    
    var warning: PaletteColor
  }
  object Palette {
    
    inline def apply(
      action: TypeAction,
      augmentColor: PaletteAugmentColorOptions => PaletteColor,
      background: TypeBackground,
      common: CommonColors,
      contrastThreshold: Double,
      divider: TypeDivider,
      error: PaletteColor,
      getContrastText: String => String,
      grey: Color,
      info: PaletteColor,
      mode: PaletteMode,
      primary: PaletteColor,
      secondary: PaletteColor,
      success: PaletteColor,
      text: TypeText,
      tonalOffset: PaletteTonalOffset,
      warning: PaletteColor
    ): Palette = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], augmentColor = js.Any.fromFunction1(augmentColor), background = background.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], contrastThreshold = contrastThreshold.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], getContrastText = js.Any.fromFunction1(getContrastText), grey = grey.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tonalOffset = tonalOffset.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[Palette]
    }
    
    extension [Self <: Palette](x: Self) {
      
      inline def setAction(value: TypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setAugmentColor(value: PaletteAugmentColorOptions => PaletteColor): Self = StObject.set(x, "augmentColor", js.Any.fromFunction1(value))
      
      inline def setBackground(value: TypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setCommon(value: CommonColors): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setContrastThreshold(value: Double): Self = StObject.set(x, "contrastThreshold", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: TypeDivider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setError(value: PaletteColor): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setGetContrastText(value: String => String): Self = StObject.set(x, "getContrastText", js.Any.fromFunction1(value))
      
      inline def setGrey(value: Color): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: PaletteColor): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setMode(value: PaletteMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: PaletteColor): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: PaletteColor): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: PaletteColor): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setText(value: TypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTonalOffset(value: PaletteTonalOffset): Self = StObject.set(x, "tonalOffset", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: PaletteColor): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaletteAugmentColorOptions extends StObject {
    
    var color: PaletteColorOptions
    
    var darkShade: js.UndefOr[Double | String] = js.undefined
    
    var lightShade: js.UndefOr[Double | String] = js.undefined
    
    var mainShade: js.UndefOr[Double | String] = js.undefined
    
    var name: js.UndefOr[Double | String] = js.undefined
  }
  object PaletteAugmentColorOptions {
    
    inline def apply(color: PaletteColorOptions): PaletteAugmentColorOptions = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteAugmentColorOptions]
    }
    
    extension [Self <: PaletteAugmentColorOptions](x: Self) {
      
      inline def setColor(value: PaletteColorOptions): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setDarkShade(value: Double | String): Self = StObject.set(x, "darkShade", value.asInstanceOf[js.Any])
      
      inline def setDarkShadeUndefined: Self = StObject.set(x, "darkShade", js.undefined)
      
      inline def setLightShade(value: Double | String): Self = StObject.set(x, "lightShade", value.asInstanceOf[js.Any])
      
      inline def setLightShadeUndefined: Self = StObject.set(x, "lightShade", js.undefined)
      
      inline def setMainShade(value: Double | String): Self = StObject.set(x, "mainShade", value.asInstanceOf[js.Any])
      
      inline def setMainShadeUndefined: Self = StObject.set(x, "mainShade", js.undefined)
      
      inline def setName(value: Double | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait PaletteColor extends StObject {
    
    var contrastText: String
    
    var dark: String
    
    var light: String
    
    var main: String
  }
  object PaletteColor {
    
    inline def apply(contrastText: String, dark: String, light: String, main: String): PaletteColor = {
      val __obj = js.Dynamic.literal(contrastText = contrastText.asInstanceOf[js.Any], dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaletteColor]
    }
    
    extension [Self <: PaletteColor](x: Self) {
      
      inline def setContrastText(value: String): Self = StObject.set(x, "contrastText", value.asInstanceOf[js.Any])
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.createPaletteMod.SimplePaletteColorOptions
    - `com.olvind.mui`.muiMaterial.createPaletteMod.ColorPartial
  */
  trait PaletteColorOptions extends StObject
  object PaletteColorOptions {
    
    inline def ColorPartial(): com.olvind.mui.muiMaterial.createPaletteMod.ColorPartial = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[com.olvind.mui.muiMaterial.createPaletteMod.ColorPartial]
    }
    
    inline def SimplePaletteColorOptions(main: String): com.olvind.mui.muiMaterial.createPaletteMod.SimplePaletteColorOptions = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[com.olvind.mui.muiMaterial.createPaletteMod.SimplePaletteColorOptions]
    }
  }
  
  trait PaletteOptions extends StObject {
    
    var action: js.UndefOr[PartialTypeAction] = js.undefined
    
    var background: js.UndefOr[PartialTypeBackground] = js.undefined
    
    var common: js.UndefOr[PartialCommonColors] = js.undefined
    
    var contrastThreshold: js.UndefOr[Double] = js.undefined
    
    var divider: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var getContrastText: js.UndefOr[js.Function1[/* background */ String, String]] = js.undefined
    
    var grey: js.UndefOr[ColorPartial] = js.undefined
    
    var info: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var mode: js.UndefOr[PaletteMode] = js.undefined
    
    var primary: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var secondary: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var success: js.UndefOr[PaletteColorOptions] = js.undefined
    
    var text: js.UndefOr[PartialTypeText] = js.undefined
    
    var tonalOffset: js.UndefOr[PaletteTonalOffset] = js.undefined
    
    var warning: js.UndefOr[PaletteColorOptions] = js.undefined
  }
  object PaletteOptions {
    
    inline def apply(): PaletteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaletteOptions]
    }
    
    extension [Self <: PaletteOptions](x: Self) {
      
      inline def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCommon(value: PartialCommonColors): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setContrastThreshold(value: Double): Self = StObject.set(x, "contrastThreshold", value.asInstanceOf[js.Any])
      
      inline def setContrastThresholdUndefined: Self = StObject.set(x, "contrastThreshold", js.undefined)
      
      inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setError(value: PaletteColorOptions): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setGetContrastText(value: /* background */ String => String): Self = StObject.set(x, "getContrastText", js.Any.fromFunction1(value))
      
      inline def setGetContrastTextUndefined: Self = StObject.set(x, "getContrastText", js.undefined)
      
      inline def setGrey(value: ColorPartial): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
      
      inline def setGreyUndefined: Self = StObject.set(x, "grey", js.undefined)
      
      inline def setInfo(value: PaletteColorOptions): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setMode(value: PaletteMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPrimary(value: PaletteColorOptions): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setSecondary(value: PaletteColorOptions): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setSuccess(value: PaletteColorOptions): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTonalOffset(value: PaletteTonalOffset): Self = StObject.set(x, "tonalOffset", value.asInstanceOf[js.Any])
      
      inline def setTonalOffsetUndefined: Self = StObject.set(x, "tonalOffset", js.undefined)
      
      inline def setWarning(value: PaletteColorOptions): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type PaletteTonalOffset = Double | Dark
  
  /* Inlined {[ P in keyof @mui/material.@mui/material/styles/createPalette.TypeObject ]:? std.Partial<@mui/material.@mui/material/styles/createPalette.TypeObject[P]>} */
  trait PartialTypeObject extends StObject {
    
    var action: js.UndefOr[PartialTypeAction] = js.undefined
    
    var background: js.UndefOr[PartialTypeBackground] = js.undefined
    
    var divider: js.UndefOr[Partial[TypeDivider]] = js.undefined
    
    var text: js.UndefOr[PartialTypeText] = js.undefined
  }
  object PartialTypeObject {
    
    inline def apply(): PartialTypeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTypeObject]
    }
    
    extension [Self <: PartialTypeObject](x: Self) {
      
      inline def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDivider(value: Partial[TypeDivider]): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait SimplePaletteColorOptions
    extends StObject
       with PaletteColorOptions {
    
    var contrastText: js.UndefOr[String] = js.undefined
    
    var dark: js.UndefOr[String] = js.undefined
    
    var light: js.UndefOr[String] = js.undefined
    
    var main: String
  }
  object SimplePaletteColorOptions {
    
    inline def apply(main: String): SimplePaletteColorOptions = {
      val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplePaletteColorOptions]
    }
    
    extension [Self <: SimplePaletteColorOptions](x: Self) {
      
      inline def setContrastText(value: String): Self = StObject.set(x, "contrastText", value.asInstanceOf[js.Any])
      
      inline def setContrastTextUndefined: Self = StObject.set(x, "contrastText", js.undefined)
      
      inline def setDark(value: String): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
      
      inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
      
      inline def setLight(value: String): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeAction extends StObject {
    
    var activatedOpacity: Double
    
    var active: String
    
    var disabled: String
    
    var disabledBackground: String
    
    var disabledOpacity: Double
    
    var focus: String
    
    var focusOpacity: Double
    
    var hover: String
    
    var hoverOpacity: Double
    
    var selected: String
    
    var selectedOpacity: Double
  }
  object TypeAction {
    
    inline def apply(
      activatedOpacity: Double,
      active: String,
      disabled: String,
      disabledBackground: String,
      disabledOpacity: Double,
      focus: String,
      focusOpacity: Double,
      hover: String,
      hoverOpacity: Double,
      selected: String,
      selectedOpacity: Double
    ): TypeAction = {
      val __obj = js.Dynamic.literal(activatedOpacity = activatedOpacity.asInstanceOf[js.Any], active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledBackground = disabledBackground.asInstanceOf[js.Any], disabledOpacity = disabledOpacity.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusOpacity = focusOpacity.asInstanceOf[js.Any], hover = hover.asInstanceOf[js.Any], hoverOpacity = hoverOpacity.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], selectedOpacity = selectedOpacity.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeAction]
    }
    
    extension [Self <: TypeAction](x: Self) {
      
      inline def setActivatedOpacity(value: Double): Self = StObject.set(x, "activatedOpacity", value.asInstanceOf[js.Any])
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledBackground(value: String): Self = StObject.set(x, "disabledBackground", value.asInstanceOf[js.Any])
      
      inline def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setFocusOpacity(value: Double): Self = StObject.set(x, "focusOpacity", value.asInstanceOf[js.Any])
      
      inline def setHover(value: String): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
      
      inline def setHoverOpacity(value: Double): Self = StObject.set(x, "hoverOpacity", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedOpacity(value: Double): Self = StObject.set(x, "selectedOpacity", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeBackground extends StObject {
    
    var default: String
    
    var paper: String
  }
  object TypeBackground {
    
    inline def apply(default: String, paper: String): TypeBackground = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeBackground]
    }
    
    extension [Self <: TypeBackground](x: Self) {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeDivider = String
  
  trait TypeObject extends StObject {
    
    var action: TypeAction
    
    var background: TypeBackground
    
    var divider: TypeDivider
    
    var text: TypeText
  }
  object TypeObject {
    
    inline def apply(action: TypeAction, background: TypeBackground, divider: TypeDivider, text: TypeText): TypeObject = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], background = background.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeObject]
    }
    
    extension [Self <: TypeObject](x: Self) {
      
      inline def setAction(value: TypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setBackground(value: TypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: TypeDivider): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setText(value: TypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeText extends StObject {
    
    var disabled: String
    
    var primary: String
    
    var secondary: String
  }
  object TypeText {
    
    inline def apply(disabled: String, primary: String, secondary: String): TypeText = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeText]
    }
    
    extension [Self <: TypeText](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    }
  }
}
