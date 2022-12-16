package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialAccordionActionsProps extends StObject {
  
  var props: PartialAccordionActionsProps
  
  var style: Interpolation[Theme]
}
object PropsPartialAccordionActionsProps {
  
  inline def apply(props: PartialAccordionActionsProps): PropsPartialAccordionActionsProps = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialAccordionActionsProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialAccordionActionsProps] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialAccordionActionsProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
