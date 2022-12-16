package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsPartialAccordionSummaryPropsdefaultCompo extends StObject {
  
  var props: PartialAccordionSummaryPropsdefaultCompo
  
  var style: Interpolation[Theme]
}
object PropsPartialAccordionSummaryPropsdefaultCompo {
  
  inline def apply(props: PartialAccordionSummaryPropsdefaultCompo): PropsPartialAccordionSummaryPropsdefaultCompo = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialAccordionSummaryPropsdefaultCompo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropsPartialAccordionSummaryPropsdefaultCompo] (val x: Self) extends AnyVal {
    
    inline def setProps(value: PartialAccordionSummaryPropsdefaultCompo): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
