package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialMobileStepperProps extends StObject {
  
  var props: PartialMobileStepperProps
  
  var style: Interpolation[Theme]
}
object PropsPartialMobileStepperProps {
  
  inline def apply(props: PartialMobileStepperProps): PropsPartialMobileStepperProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialMobileStepperProps]
  }
  
  extension [Self <: PropsPartialMobileStepperProps](x: Self) {
    
    inline def setProps(value: PartialMobileStepperProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
