package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialToggleButtonPropsdefaultComponent extends StObject {
  
  var props: PartialToggleButtonPropsdefaultComponent
  
  var style: Interpolation[Theme]
}
object PropsPartialToggleButtonPropsdefaultComponent {
  
  inline def apply(props: PartialToggleButtonPropsdefaultComponent): PropsPartialToggleButtonPropsdefaultComponent = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialToggleButtonPropsdefaultComponent]
  }
  
  extension [Self <: PropsPartialToggleButtonPropsdefaultComponent](x: Self) {
    
    inline def setProps(value: PartialToggleButtonPropsdefaultComponent): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
