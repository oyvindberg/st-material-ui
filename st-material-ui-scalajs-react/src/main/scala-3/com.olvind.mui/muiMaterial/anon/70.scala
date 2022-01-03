package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionSummaryPropsdefaultCompo] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionSumma] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionSummaryPropsdefaultCompo]] = js.undefined
}
object `70` {
  
  inline def apply(): `70` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`70`]
  }
  
  extension [Self <: `70`](x: Self) {
    
    inline def setDefaultProps(value: PartialAccordionSummaryPropsdefaultCompo): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAccordionSumma): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAccordionSummaryPropsdefaultCompo]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAccordionSummaryPropsdefaultCompo*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
