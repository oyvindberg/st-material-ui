package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteCommonChannel extends StObject {
  
  var background: String
  
  var backgroundChannel: String
  
  var onBackground: String
  
  var onBackgroundChannel: String
}
object PaletteCommonChannel {
  
  inline def apply(background: String, backgroundChannel: String, onBackground: String, onBackgroundChannel: String): PaletteCommonChannel = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundChannel = backgroundChannel.asInstanceOf[js.Any], onBackground = onBackground.asInstanceOf[js.Any], onBackgroundChannel = onBackgroundChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteCommonChannel]
  }
  
  extension [Self <: PaletteCommonChannel](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundChannel(value: String): Self = StObject.set(x, "backgroundChannel", value.asInstanceOf[js.Any])
    
    inline def setOnBackground(value: String): Self = StObject.set(x, "onBackground", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChannel(value: String): Self = StObject.set(x, "onBackgroundChannel", value.asInstanceOf[js.Any])
  }
}
