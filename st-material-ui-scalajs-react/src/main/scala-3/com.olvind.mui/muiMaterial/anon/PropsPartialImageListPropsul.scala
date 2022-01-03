package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialImageListPropsul extends StObject {
  
  var props: PartialImageListPropsul
  
  var style: Interpolation[Theme]
}
object PropsPartialImageListPropsul {
  
  inline def apply(props: PartialImageListPropsul): PropsPartialImageListPropsul = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialImageListPropsul]
  }
  
  extension [Self <: PropsPartialImageListPropsul](x: Self) {
    
    inline def setProps(value: PartialImageListPropsul): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
