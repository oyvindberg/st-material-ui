package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteColorChannel> */
trait PartialPaletteColorChannel extends StObject {
  
  var contrastTextChannel: js.UndefOr[String] = js.undefined
  
  var darkChannel: js.UndefOr[String] = js.undefined
  
  var lightChannel: js.UndefOr[String] = js.undefined
  
  var mainChannel: js.UndefOr[String] = js.undefined
}
object PartialPaletteColorChannel {
  
  inline def apply(): PartialPaletteColorChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteColorChannel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPaletteColorChannel] (val x: Self) extends AnyVal {
    
    inline def setContrastTextChannel(value: String): Self = StObject.set(x, "contrastTextChannel", value.asInstanceOf[js.Any])
    
    inline def setContrastTextChannelUndefined: Self = StObject.set(x, "contrastTextChannel", js.undefined)
    
    inline def setDarkChannel(value: String): Self = StObject.set(x, "darkChannel", value.asInstanceOf[js.Any])
    
    inline def setDarkChannelUndefined: Self = StObject.set(x, "darkChannel", js.undefined)
    
    inline def setLightChannel(value: String): Self = StObject.set(x, "lightChannel", value.asInstanceOf[js.Any])
    
    inline def setLightChannelUndefined: Self = StObject.set(x, "lightChannel", js.undefined)
    
    inline def setMainChannel(value: String): Self = StObject.set(x, "mainChannel", value.asInstanceOf[js.Any])
    
    inline def setMainChannelUndefined: Self = StObject.set(x, "mainChannel", js.undefined)
  }
}
