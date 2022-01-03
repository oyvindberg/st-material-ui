package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialStepLabelProps extends StObject {
  
  var props: PartialStepLabelProps
  
  var style: Interpolation[Theme]
}
object PropsPartialStepLabelProps {
  
  inline def apply(props: PartialStepLabelProps): PropsPartialStepLabelProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialStepLabelProps]
  }
  
  extension [Self <: PropsPartialStepLabelProps](x: Self) {
    
    inline def setProps(value: PartialStepLabelProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
