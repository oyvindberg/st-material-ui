package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteBackground
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteCommon
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteDanger
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteInfo
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteNeutral
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PalettePrimary
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteSuccess
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteText
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteWarning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/joy.@mui/joy/styles/types/colorSystem.ColorSystem['palette'], 'mode'> */
trait OmitColorSystempalettemode extends StObject {
  
  var background: PaletteBackground
  
  var common: PaletteCommon
  
  var danger: PaletteDanger
  
  var divider: String
  
  var focusVisible: String
  
  var info: PaletteInfo
  
  var neutral: PaletteNeutral
  
  var primary: PalettePrimary
  
  var success: PaletteSuccess
  
  var text: PaletteText
  
  var warning: PaletteWarning
}
object OmitColorSystempalettemode {
  
  inline def apply(
    background: PaletteBackground,
    common: PaletteCommon,
    danger: PaletteDanger,
    divider: String,
    focusVisible: String,
    info: PaletteInfo,
    neutral: PaletteNeutral,
    primary: PalettePrimary,
    success: PaletteSuccess,
    text: PaletteText,
    warning: PaletteWarning
  ): OmitColorSystempalettemode = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitColorSystempalettemode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitColorSystempalettemode] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: PaletteBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCommon(value: PaletteCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: PaletteDanger): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
    
    inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: PaletteInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: PaletteNeutral): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: PalettePrimary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: PaletteSuccess): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setText(value: PaletteText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: PaletteWarning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
