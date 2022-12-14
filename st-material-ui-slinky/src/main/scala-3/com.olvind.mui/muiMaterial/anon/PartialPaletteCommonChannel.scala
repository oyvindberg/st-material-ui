package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/styles/experimental_extendTheme.PaletteCommonChannel> */
trait PartialPaletteCommonChannel extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var backgroundChannel: js.UndefOr[String] = js.undefined
  
  var onBackground: js.UndefOr[String] = js.undefined
  
  var onBackgroundChannel: js.UndefOr[String] = js.undefined
}
object PartialPaletteCommonChannel {
  
  inline def apply(): PartialPaletteCommonChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPaletteCommonChannel]
  }
  
  extension [Self <: PartialPaletteCommonChannel](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundChannel(value: String): Self = StObject.set(x, "backgroundChannel", value.asInstanceOf[js.Any])
    
    inline def setBackgroundChannelUndefined: Self = StObject.set(x, "backgroundChannel", js.undefined)
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setOnBackground(value: String): Self = StObject.set(x, "onBackground", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChannel(value: String): Self = StObject.set(x, "onBackgroundChannel", value.asInstanceOf[js.Any])
    
    inline def setOnBackgroundChannelUndefined: Self = StObject.set(x, "onBackgroundChannel", js.undefined)
    
    inline def setOnBackgroundUndefined: Self = StObject.set(x, "onBackground", js.undefined)
  }
}
