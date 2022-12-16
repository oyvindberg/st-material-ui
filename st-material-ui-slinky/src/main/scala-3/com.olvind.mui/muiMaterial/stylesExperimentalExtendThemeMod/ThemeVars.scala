package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import com.olvind.mui.muiMaterial.anon.OmitColorSystempalettecolorSchememodecon
import com.olvind.mui.muiMaterial.stylesShadowsMod.Shadows
import com.olvind.mui.muiMaterial.stylesZIndexMod.ZIndex
import com.olvind.mui.muiSystem.createThemeShapeMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeVars extends StObject {
  
  var opacity: Opacity
  
  var overlays: Overlays
  
  var palette: OmitColorSystempalettecolorSchememodecon
  
  var shadows: Shadows
  
  var shape: Shape
  
  var zIndex: ZIndex
}
object ThemeVars {
  
  inline def apply(
    opacity: Opacity,
    overlays: Overlays,
    palette: OmitColorSystempalettecolorSchememodecon,
    shadows: Shadows,
    shape: Shape,
    zIndex: ZIndex
  ): ThemeVars = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shadows = shadows.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeVars]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeVars] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: Opacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOverlays(value: Overlays): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysVarargs(value: Any*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setPalette(value: OmitColorSystempalettecolorSchememodecon): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setShadows(value: Shadows): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
    
    inline def setShadowsVarargs(value: Any*): Self = StObject.set(x, "shadows", js.Array(value*))
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
