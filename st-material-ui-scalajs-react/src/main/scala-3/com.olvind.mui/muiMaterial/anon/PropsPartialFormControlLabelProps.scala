package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialFormControlLabelProps extends StObject {
  
  var props: PartialFormControlLabelProps
  
  var style: Interpolation[Theme]
}
object PropsPartialFormControlLabelProps {
  
  inline def apply(props: PartialFormControlLabelProps): PropsPartialFormControlLabelProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialFormControlLabelProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialFormControlLabelProps] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialFormControlLabelProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
