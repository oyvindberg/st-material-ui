package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialTableBodyPropstbody extends StObject {
  
  var props: PartialTableBodyPropstbody
  
  var style: Interpolation[Theme]
}
object PropsPartialTableBodyPropstbody {
  
  inline def apply(props: PartialTableBodyPropstbody): PropsPartialTableBodyPropstbody = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialTableBodyPropstbody]
  }
  
  extension [Self <: PropsPartialTableBodyPropstbody](x: Self) {
    
    inline def setProps(value: PartialTableBodyPropstbody): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
