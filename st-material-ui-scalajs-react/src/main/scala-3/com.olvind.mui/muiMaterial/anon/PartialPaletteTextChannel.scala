package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteTextChannel> */
trait PartialPaletteTextChannel extends StObject {
  
  var primaryChannel: js.UndefOr[String] = js.undefined
  
  var secondaryChannel: js.UndefOr[String] = js.undefined
}
object PartialPaletteTextChannel {
  
  inline def apply(): PartialPaletteTextChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteTextChannel]
  }
  
  extension [Self <: PartialPaletteTextChannel](x: Self) {
    
    inline def setPrimaryChannel(value: String): Self = StObject.set(x, "primaryChannel", value.asInstanceOf[js.Any])
    
    inline def setPrimaryChannelUndefined: Self = StObject.set(x, "primaryChannel", js.undefined)
    
    inline def setSecondaryChannel(value: String): Self = StObject.set(x, "secondaryChannel", value.asInstanceOf[js.Any])
    
    inline def setSecondaryChannelUndefined: Self = StObject.set(x, "secondaryChannel", js.undefined)
  }
}
