package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteActionChannel> */
trait PartialPaletteActionChannel extends StObject {
  
  var activeChannel: js.UndefOr[String] = js.undefined
  
  var selectedChannel: js.UndefOr[String] = js.undefined
}
object PartialPaletteActionChannel {
  
  inline def apply(): PartialPaletteActionChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteActionChannel]
  }
  
  extension [Self <: PartialPaletteActionChannel](x: Self) {
    
    inline def setActiveChannel(value: String): Self = StObject.set(x, "activeChannel", value.asInstanceOf[js.Any])
    
    inline def setActiveChannelUndefined: Self = StObject.set(x, "activeChannel", js.undefined)
    
    inline def setSelectedChannel(value: String): Self = StObject.set(x, "selectedChannel", value.asInstanceOf[js.Any])
    
    inline def setSelectedChannelUndefined: Self = StObject.set(x, "selectedChannel", js.undefined)
  }
}
