package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialCardHeaderPropsdivspanspan extends StObject {
  
  var props: PartialCardHeaderPropsdivspanspan
  
  var style: Interpolation[Theme]
}
object PropsPartialCardHeaderPropsdivspanspan {
  
  inline def apply(props: PartialCardHeaderPropsdivspanspan): PropsPartialCardHeaderPropsdivspanspan = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialCardHeaderPropsdivspanspan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialCardHeaderPropsdivspanspan] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialCardHeaderPropsdivspanspan): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
