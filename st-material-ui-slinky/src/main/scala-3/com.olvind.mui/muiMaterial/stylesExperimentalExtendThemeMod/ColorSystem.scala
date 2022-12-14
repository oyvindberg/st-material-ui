package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import com.olvind.mui.muiMaterial.stylesCreatePaletteMod.Palette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSystem extends StObject {
  
  var opacity: Opacity
  
  var overlays: Overlays
  
  var palette: Palette & CssVarsPalette
}
object ColorSystem {
  
  inline def apply(opacity: Opacity, overlays: Overlays, palette: Palette & CssVarsPalette): ColorSystem = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSystem]
  }
  
  extension [Self <: ColorSystem](x: Self) {
    
    inline def setOpacity(value: Opacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOverlays(value: Overlays): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysVarargs(value: Any*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setPalette(value: Palette & CssVarsPalette): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
  }
}
