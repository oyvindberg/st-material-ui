package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialListItemSecondaryActionProps extends StObject {
  
  var props: PartialListItemSecondaryActionProps
  
  var style: Interpolation[Theme]
}
object PropsPartialListItemSecondaryActionProps {
  
  inline def apply(props: PartialListItemSecondaryActionProps): PropsPartialListItemSecondaryActionProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialListItemSecondaryActionProps]
  }
  
  extension [Self <: PropsPartialListItemSecondaryActionProps](x: Self) {
    
    inline def setProps(value: PartialListItemSecondaryActionProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
