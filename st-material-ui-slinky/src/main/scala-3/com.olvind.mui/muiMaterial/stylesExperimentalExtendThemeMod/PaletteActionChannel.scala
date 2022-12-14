package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteActionChannel extends StObject {
  
  var activeChannel: String
  
  var selectedChannel: String
}
object PaletteActionChannel {
  
  inline def apply(activeChannel: String, selectedChannel: String): PaletteActionChannel = {
    val __obj = js.Dynamic.literal(activeChannel = activeChannel.asInstanceOf[js.Any], selectedChannel = selectedChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteActionChannel]
  }
  
  extension [Self <: PaletteActionChannel](x: Self) {
    
    inline def setActiveChannel(value: String): Self = StObject.set(x, "activeChannel", value.asInstanceOf[js.Any])
    
    inline def setSelectedChannel(value: String): Self = StObject.set(x, "selectedChannel", value.asInstanceOf[js.Any])
  }
}
