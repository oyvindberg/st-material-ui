package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialInputLabelPropsAbout extends StObject {
  
  var props: PartialInputLabelPropsAbout
  
  var style: Interpolation[Theme]
}
object PropsPartialInputLabelPropsAbout {
  
  inline def apply(props: PartialInputLabelPropsAbout): PropsPartialInputLabelPropsAbout = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialInputLabelPropsAbout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialInputLabelPropsAbout] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialInputLabelPropsAbout): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
