package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialTableHeadPropsthead extends StObject {
  
  var props: PartialTableHeadPropsthead
  
  var style: Interpolation[Theme]
}
object PropsPartialTableHeadPropsthead {
  
  inline def apply(props: PartialTableHeadPropsthead): PropsPartialTableHeadPropsthead = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialTableHeadPropsthead]
  }
  
  extension [Self <: PropsPartialTableHeadPropsthead](x: Self) {
    
    inline def setProps(value: PartialTableHeadPropsthead): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
