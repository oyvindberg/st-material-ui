package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.mod.PaletteMode
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.ColorPartial
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.PaletteColorOptions
import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.PaletteTonalOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @mui/material.@mui/material/styles/createPalette.PaletteOptions & {  background :Partial<PaletteBackgroundChannel> | undefined,   common :Partial<PaletteCommonChannel> | undefined,   primary :Partial<PaletteColorChannel> | undefined,   secondary :Partial<PaletteColorChannel> | undefined,   error :Partial<PaletteColorChannel> | undefined,   info :Partial<PaletteColorChannel> | undefined,   success :Partial<PaletteColorChannel> | undefined,   text :Partial<PaletteTextChannel> | undefined,   dividerChannel :std.Partial<string> | undefined,   action :Partial<PaletteActionChannel> | undefined,   Alert :Partial<PaletteAlert> | undefined,   AppBar :Partial<PaletteAppBar> | undefined,   Avatar :Partial<PaletteAvatar> | undefined,   Chip :Partial<PaletteChip> | undefined,   FilledInput :Partial<PaletteFilledInput> | undefined,   LinearProgress :Partial<PaletteLinearProgress> | undefined,   Skeleton :Partial<PaletteSkeleton> | undefined,   Slider :Partial<PaletteSlider> | undefined,   SnackbarContent :Partial<PaletteSnackbarContent> | undefined,   SpeedDialAction :Partial<PaletteSpeedDialAction> | undefined,   StepConnector :Partial<PaletteStepConnector> | undefined,   StepContent :Partial<PaletteStepContent> | undefined,   Switch :Partial<PaletteSwitch> | undefined,   TableCell :Partial<PaletteTableCell> | undefined,   Tooltip :Partial<PaletteTooltip> | undefined} */
trait PaletteOptions extends StObject {
  
  var Alert: js.UndefOr[PartialPaletteAlert] = js.undefined
  
  var AppBar: js.UndefOr[PartialPaletteAppBar] = js.undefined
  
  var Avatar: js.UndefOr[PartialPaletteAvatar] = js.undefined
  
  var Chip: js.UndefOr[PartialPaletteChip] = js.undefined
  
  var FilledInput: js.UndefOr[PartialPaletteFilledInput] = js.undefined
  
  var LinearProgress: js.UndefOr[PartialPaletteLinearProgress] = js.undefined
  
  var Skeleton: js.UndefOr[PartialPaletteSkeleton] = js.undefined
  
  var Slider: js.UndefOr[PartialPaletteSlider] = js.undefined
  
  var SnackbarContent: js.UndefOr[PartialPaletteSnackbarContent] = js.undefined
  
  var SpeedDialAction: js.UndefOr[PartialPaletteSpeedDialAction] = js.undefined
  
  var StepConnector: js.UndefOr[PartialPaletteStepConnector] = js.undefined
  
  var StepContent: js.UndefOr[PartialPaletteStepContent] = js.undefined
  
  var Switch: js.UndefOr[PartialPaletteSwitch] = js.undefined
  
  var TableCell: js.UndefOr[PartialPaletteTableCell] = js.undefined
  
  var Tooltip: js.UndefOr[PartialPaletteTooltip] = js.undefined
  
  var action: js.UndefOr[PartialTypeAction] = js.undefined
  
  var background: js.UndefOr[PartialTypeBackground] = js.undefined
  
  var common: js.UndefOr[PartialCommonColors] = js.undefined
  
  var contrastThreshold: js.UndefOr[Double] = js.undefined
  
  var divider: js.UndefOr[String] = js.undefined
  
  var dividerChannel: js.UndefOr[com.olvind.mui.std.Partial[String]] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteOptions] (val x: Self) extends AnyVal {
    
    inline def setAction(value: PartialTypeAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAlert(value: PartialPaletteAlert): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
    
    inline def setAppBar(value: PartialPaletteAppBar): Self = StObject.set(x, "AppBar", value.asInstanceOf[js.Any])
    
    inline def setAppBarUndefined: Self = StObject.set(x, "AppBar", js.undefined)
    
    inline def setAvatar(value: PartialPaletteAvatar): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
    
    inline def setBackground(value: PartialTypeBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setChip(value: PartialPaletteChip): Self = StObject.set(x, "Chip", value.asInstanceOf[js.Any])
    
    inline def setChipUndefined: Self = StObject.set(x, "Chip", js.undefined)
    
    inline def setCommon(value: PartialCommonColors): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setContrastThreshold(value: Double): Self = StObject.set(x, "contrastThreshold", value.asInstanceOf[js.Any])
    
    inline def setContrastThresholdUndefined: Self = StObject.set(x, "contrastThreshold", js.undefined)
    
    inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setDividerChannel(value: com.olvind.mui.std.Partial[String]): Self = StObject.set(x, "dividerChannel", value.asInstanceOf[js.Any])
    
    inline def setDividerChannelUndefined: Self = StObject.set(x, "dividerChannel", js.undefined)
    
    inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
    
    inline def setError(value: PaletteColorOptions): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilledInput(value: PartialPaletteFilledInput): Self = StObject.set(x, "FilledInput", value.asInstanceOf[js.Any])
    
    inline def setFilledInputUndefined: Self = StObject.set(x, "FilledInput", js.undefined)
    
    inline def setGetContrastText(value: /* background */ String => String): Self = StObject.set(x, "getContrastText", js.Any.fromFunction1(value))
    
    inline def setGetContrastTextUndefined: Self = StObject.set(x, "getContrastText", js.undefined)
    
    inline def setGrey(value: ColorPartial): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
    
    inline def setGreyUndefined: Self = StObject.set(x, "grey", js.undefined)
    
    inline def setInfo(value: PaletteColorOptions): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLinearProgress(value: PartialPaletteLinearProgress): Self = StObject.set(x, "LinearProgress", value.asInstanceOf[js.Any])
    
    inline def setLinearProgressUndefined: Self = StObject.set(x, "LinearProgress", js.undefined)
    
    inline def setMode(value: PaletteMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setPrimary(value: PaletteColorOptions): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setSecondary(value: PaletteColorOptions): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
    
    inline def setSkeleton(value: PartialPaletteSkeleton): Self = StObject.set(x, "Skeleton", value.asInstanceOf[js.Any])
    
    inline def setSkeletonUndefined: Self = StObject.set(x, "Skeleton", js.undefined)
    
    inline def setSlider(value: PartialPaletteSlider): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
    
    inline def setSnackbarContent(value: PartialPaletteSnackbarContent): Self = StObject.set(x, "SnackbarContent", value.asInstanceOf[js.Any])
    
    inline def setSnackbarContentUndefined: Self = StObject.set(x, "SnackbarContent", js.undefined)
    
    inline def setSpeedDialAction(value: PartialPaletteSpeedDialAction): Self = StObject.set(x, "SpeedDialAction", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialActionUndefined: Self = StObject.set(x, "SpeedDialAction", js.undefined)
    
    inline def setStepConnector(value: PartialPaletteStepConnector): Self = StObject.set(x, "StepConnector", value.asInstanceOf[js.Any])
    
    inline def setStepConnectorUndefined: Self = StObject.set(x, "StepConnector", js.undefined)
    
    inline def setStepContent(value: PartialPaletteStepContent): Self = StObject.set(x, "StepContent", value.asInstanceOf[js.Any])
    
    inline def setStepContentUndefined: Self = StObject.set(x, "StepContent", js.undefined)
    
    inline def setSuccess(value: PaletteColorOptions): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setSwitch(value: PartialPaletteSwitch): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
    
    inline def setSwitchUndefined: Self = StObject.set(x, "Switch", js.undefined)
    
    inline def setTableCell(value: PartialPaletteTableCell): Self = StObject.set(x, "TableCell", value.asInstanceOf[js.Any])
    
    inline def setTableCellUndefined: Self = StObject.set(x, "TableCell", js.undefined)
    
    inline def setText(value: PartialTypeText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTonalOffset(value: PaletteTonalOffset): Self = StObject.set(x, "tonalOffset", value.asInstanceOf[js.Any])
    
    inline def setTonalOffsetUndefined: Self = StObject.set(x, "tonalOffset", js.undefined)
    
    inline def setTooltip(value: PartialPaletteTooltip): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setWarning(value: PaletteColorOptions): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
