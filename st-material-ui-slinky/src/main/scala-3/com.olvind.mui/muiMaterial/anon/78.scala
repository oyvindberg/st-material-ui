package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `78` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormLabelPropslabel] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormLabelClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormLabelPropslabel]] = js.undefined
}
object `78` {
  
  inline def apply(): `78` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`78`]
  }
  
  extension [Self <: `78`](x: Self) {
    
    inline def setDefaultProps(value: PartialFormLabelPropslabel): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesFormLabelClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormLabelPropslabel]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormLabelPropslabel*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
