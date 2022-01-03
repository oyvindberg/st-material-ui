package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableSortLabelPropsdefaultCompone] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableSortLabel] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableSortLabelPropsdefaultCompone]] = js.undefined
}
object `138` {
  
  inline def apply(): `138` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`138`]
  }
  
  extension [Self <: `138`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableSortLabelPropsdefaultCompone): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableSortLabel): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableSortLabelPropsdefaultCompone]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableSortLabelPropsdefaultCompone*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
