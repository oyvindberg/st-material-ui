package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialSwitchProps extends StObject {
  
  var props: PartialSwitchProps
  
  var style: Interpolation[Theme]
}
object PropsPartialSwitchProps {
  
  inline def apply(props: PartialSwitchProps): PropsPartialSwitchProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialSwitchProps]
  }
  
  extension [Self <: PropsPartialSwitchProps](x: Self) {
    
    inline def setProps(value: PartialSwitchProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
