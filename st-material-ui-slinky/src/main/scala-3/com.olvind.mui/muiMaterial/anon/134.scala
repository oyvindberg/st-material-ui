package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableFooterPropstfoot] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableFooterCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableFooterPropstfoot]] = js.undefined
}
object `134` {
  
  inline def apply(): `134` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableFooterPropstfoot): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableFooterCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableFooterPropstfoot]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableFooterPropstfoot*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
