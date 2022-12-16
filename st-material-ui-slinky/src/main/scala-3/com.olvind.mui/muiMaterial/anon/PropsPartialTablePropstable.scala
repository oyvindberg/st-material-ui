package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialTablePropstable extends StObject {
  
  var props: PartialTablePropstable
  
  var style: Interpolation[Theme]
}
object PropsPartialTablePropstable {
  
  inline def apply(props: PartialTablePropstable): PropsPartialTablePropstable = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialTablePropstable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialTablePropstable] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialTablePropstable): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
