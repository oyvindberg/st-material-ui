package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialOptions extends StObject {
  
  var props: PartialOptions
  
  var style: Interpolation[Theme]
}
object PropsPartialOptions {
  
  inline def apply(props: PartialOptions): PropsPartialOptions = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialOptions] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialOptions): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
