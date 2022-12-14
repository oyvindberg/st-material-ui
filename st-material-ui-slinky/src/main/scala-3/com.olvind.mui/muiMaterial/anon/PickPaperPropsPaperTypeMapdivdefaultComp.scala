package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<PaperProps<PaperTypeMap<{}, 'div'>['defaultComponent'], {}>, 'elevation' | 'square' | 'variant'> */
trait PickPaperPropsPaperTypeMapdivdefaultComp extends StObject {
  
  var elevation: js.UndefOr[Double] = js.undefined
  
  var square: js.UndefOr[Boolean] = js.undefined
  
  var variant: js.UndefOr["elevation" | "outlined"] = js.undefined
}
object PickPaperPropsPaperTypeMapdivdefaultComp {
  
  inline def apply(): PickPaperPropsPaperTypeMapdivdefaultComp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPaperPropsPaperTypeMapdivdefaultComp]
  }
  
  extension [Self <: PickPaperPropsPaperTypeMapdivdefaultComp](x: Self) {
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    
    inline def setSquare(value: Boolean): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    inline def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    inline def setVariant(value: "elevation" | "outlined"): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
