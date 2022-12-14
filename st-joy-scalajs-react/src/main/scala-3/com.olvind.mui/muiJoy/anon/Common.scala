package com.olvind.mui.muiJoy.anon

import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.DefaultPaletteBackground
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.DefaultPaletteCommon
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.DefaultPaletteRange
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.DefaultPaletteText
import com.olvind.mui.muiJoy.stylesTypesColorSystemMod.PaletteVariant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Common extends StObject {
  
  var background: DefaultPaletteBackground
  
  var common: DefaultPaletteCommon
  
  var danger: DefaultPaletteRange & PaletteVariant
  
  var info: DefaultPaletteRange & PaletteVariant
  
  var neutral: DefaultPaletteRange & PaletteVariant
  
  var primary: DefaultPaletteRange & PaletteVariant
  
  var success: DefaultPaletteRange & PaletteVariant
  
  var text: DefaultPaletteText
  
  var warning: DefaultPaletteRange & PaletteVariant
}
object Common {
  
  inline def apply(
    background: DefaultPaletteBackground,
    common: DefaultPaletteCommon,
    danger: DefaultPaletteRange & PaletteVariant,
    info: DefaultPaletteRange & PaletteVariant,
    neutral: DefaultPaletteRange & PaletteVariant,
    primary: DefaultPaletteRange & PaletteVariant,
    success: DefaultPaletteRange & PaletteVariant,
    text: DefaultPaletteText,
    warning: DefaultPaletteRange & PaletteVariant
  ): Common = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], danger = danger.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], neutral = neutral.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Common] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: DefaultPaletteBackground): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCommon(value: DefaultPaletteCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setDanger(value: DefaultPaletteRange & PaletteVariant): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: DefaultPaletteRange & PaletteVariant): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setNeutral(value: DefaultPaletteRange & PaletteVariant): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: DefaultPaletteRange & PaletteVariant): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: DefaultPaletteRange & PaletteVariant): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setText(value: DefaultPaletteText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: DefaultPaletteRange & PaletteVariant): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
