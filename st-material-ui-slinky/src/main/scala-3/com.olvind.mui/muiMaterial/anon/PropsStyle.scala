package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsStyle extends StObject {
  
  var props: PartialAlertProps
  
  var style: Interpolation[Theme]
}
object PropsStyle {
  
  inline def apply(props: PartialAlertProps): PropsStyle = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsStyle] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialAlertProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
