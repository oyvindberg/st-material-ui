package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod.Opacity
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@mui/material.@mui/material/styles/experimental_extendTheme.ThemeVars, 'overlays' | 'shadows' | 'shape'> */
trait OmitThemeVarsoverlaysshadowsshape extends StObject {
  
  var opacity: Opacity
  
  var palette: OmitPaletteCssVarsPalettecolorSchememode
  
  var zIndex: ZIndex
}
object OmitThemeVarsoverlaysshadowsshape {
  
  inline def apply(opacity: Opacity, palette: OmitPaletteCssVarsPalettecolorSchememode, zIndex: ZIndex): OmitThemeVarsoverlaysshadowsshape = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitThemeVarsoverlaysshadowsshape]
  }
  
  extension [Self <: OmitThemeVarsoverlaysshadowsshape](x: Self) {
    
    inline def setOpacity(value: Opacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPalette(value: OmitPaletteCssVarsPalettecolorSchememode): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
