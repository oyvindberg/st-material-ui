package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialGrid2Propsdiv extends StObject {
  
  var props: PartialGrid2Propsdiv
  
  var style: Interpolation[Theme]
}
object PropsPartialGrid2Propsdiv {
  
  inline def apply(props: PartialGrid2Propsdiv): PropsPartialGrid2Propsdiv = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialGrid2Propsdiv]
  }
  
  extension [Self <: PropsPartialGrid2Propsdiv](x: Self) {
    
    inline def setProps(value: PartialGrid2Propsdiv): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
