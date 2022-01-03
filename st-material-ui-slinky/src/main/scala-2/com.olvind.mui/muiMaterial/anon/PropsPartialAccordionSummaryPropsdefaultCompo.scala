package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.Interpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsPartialAccordionSummaryPropsdefaultCompo extends StObject {
  
  var props: PartialAccordionSummaryPropsdefaultCompo = js.native
  
  var style: Interpolation[Theme] = js.native
}
object PropsPartialAccordionSummaryPropsdefaultCompo {
  
  @scala.inline
  def apply(props: PartialAccordionSummaryPropsdefaultCompo): PropsPartialAccordionSummaryPropsdefaultCompo = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsPartialAccordionSummaryPropsdefaultCompo]
  }
  
  @scala.inline
  implicit class PropsPartialAccordionSummaryPropsdefaultCompoMutableBuilder[Self <: PropsPartialAccordionSummaryPropsdefaultCompo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProps(value: PartialAccordionSummaryPropsdefaultCompo): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Interpolation[Theme]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
