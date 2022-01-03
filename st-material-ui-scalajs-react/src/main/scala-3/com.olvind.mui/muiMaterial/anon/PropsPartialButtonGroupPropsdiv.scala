package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialButtonGroupPropsdiv extends StObject {
  
  var props: PartialButtonGroupPropsdiv
  
  var style: Interpolation[Theme]
}
object PropsPartialButtonGroupPropsdiv {
  
  inline def apply(props: PartialButtonGroupPropsdiv): PropsPartialButtonGroupPropsdiv = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialButtonGroupPropsdiv]
  }
  
  extension [Self <: PropsPartialButtonGroupPropsdiv](x: Self) {
    
    inline def setProps(value: PartialButtonGroupPropsdiv): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
