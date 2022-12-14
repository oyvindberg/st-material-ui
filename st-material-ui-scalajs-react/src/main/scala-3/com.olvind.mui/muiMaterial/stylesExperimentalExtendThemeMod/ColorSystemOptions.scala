package com.olvind.mui.muiMaterial.stylesExperimentalExtendThemeMod

import com.olvind.mui.muiMaterial.anon.PaletteOptions
import com.olvind.mui.muiMaterial.anon.PartialOpacity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorSystemOptions extends StObject {
  
  var opacity: js.UndefOr[PartialOpacity] = js.undefined
  
  var overlays: js.UndefOr[Overlays] = js.undefined
  
  var palette: js.UndefOr[PaletteOptions] = js.undefined
}
object ColorSystemOptions {
  
  inline def apply(): ColorSystemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorSystemOptions]
  }
  
  extension [Self <: ColorSystemOptions](x: Self) {
    
    inline def setOpacity(value: PartialOpacity): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverlays(value: Overlays): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
    
    inline def setOverlaysVarargs(value: Any*): Self = StObject.set(x, "overlays", js.Array(value*))
    
    inline def setPalette(value: PaletteOptions): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
  }
}
