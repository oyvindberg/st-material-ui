package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteBackgroundChannel extends StObject {
  
  var defaultChannel: String
}
object PaletteBackgroundChannel {
  
  inline def apply(defaultChannel: String): PaletteBackgroundChannel = {
    val __obj = js.Dynamic.literal(defaultChannel = defaultChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteBackgroundChannel]
  }
  
  extension [Self <: PaletteBackgroundChannel](x: Self) {
    
    inline def setDefaultChannel(value: String): Self = StObject.set(x, "defaultChannel", value.asInstanceOf[js.Any])
  }
}
