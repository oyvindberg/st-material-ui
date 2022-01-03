package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialNativeSelectProps extends StObject {
  
  var props: PartialNativeSelectProps
  
  var style: Interpolation[Theme]
}
object PropsPartialNativeSelectProps {
  
  inline def apply(props: PartialNativeSelectProps): PropsPartialNativeSelectProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialNativeSelectProps]
  }
  
  extension [Self <: PropsPartialNativeSelectProps](x: Self) {
    
    inline def setProps(value: PartialNativeSelectProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
