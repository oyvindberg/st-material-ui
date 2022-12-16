package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialSliderPropsdefaultComponent extends StObject {
  
  var props: PartialSliderPropsdefaultComponent
  
  var style: Interpolation[Theme]
}
object PropsPartialSliderPropsdefaultComponent {
  
  inline def apply(props: PartialSliderPropsdefaultComponent): PropsPartialSliderPropsdefaultComponent = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialSliderPropsdefaultComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialSliderPropsdefaultComponent] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialSliderPropsdefaultComponent): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
