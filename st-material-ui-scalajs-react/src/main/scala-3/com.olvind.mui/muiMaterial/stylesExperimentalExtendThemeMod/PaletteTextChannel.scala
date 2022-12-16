package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaletteTextChannel extends StObject {
  
  var primaryChannel: String
  
  var secondaryChannel: String
}
object PaletteTextChannel {
  
  inline def apply(primaryChannel: String, secondaryChannel: String): PaletteTextChannel = {
    val __obj = js.Dynamic.literal(primaryChannel = primaryChannel.asInstanceOf[js.Any], secondaryChannel = secondaryChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaletteTextChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaletteTextChannel] (val x: Self) extends AnyVal {
    
    inline def setPrimaryChannel(value: String): Self = StObject.set(x, "primaryChannel", value.asInstanceOf[js.Any])
    
    inline def setSecondaryChannel(value: String): Self = StObject.set(x, "secondaryChannel", value.asInstanceOf[js.Any])
  }
}
