package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteColorChannel extends StObject {
  
  var contrastTextChannel: String
  
  var darkChannel: String
  
  var lightChannel: String
  
  var mainChannel: String
}
object PaletteColorChannel {
  
  inline def apply(contrastTextChannel: String, darkChannel: String, lightChannel: String, mainChannel: String): PaletteColorChannel = {
    val __obj = js.Dynamic.literal(contrastTextChannel = contrastTextChannel.asInstanceOf[js.Any], darkChannel = darkChannel.asInstanceOf[js.Any], lightChannel = lightChannel.asInstanceOf[js.Any], mainChannel = mainChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteColorChannel]
  }
  
  extension [Self <: PaletteColorChannel](x: Self) {
    
    inline def setContrastTextChannel(value: String): Self = StObject.set(x, "contrastTextChannel", value.asInstanceOf[js.Any])
    
    inline def setDarkChannel(value: String): Self = StObject.set(x, "darkChannel", value.asInstanceOf[js.Any])
    
    inline def setLightChannel(value: String): Self = StObject.set(x, "lightChannel", value.asInstanceOf[js.Any])
    
    inline def setMainChannel(value: String): Self = StObject.set(x, "mainChannel", value.asInstanceOf[js.Any])
  }
}
