package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableRowPropstr] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableRowClassK] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableRowPropstr]] = js.undefined
}
object `137` {
  
  inline def apply(): `137` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`137`]
  }
  
  extension [Self <: `137`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableRowPropstr): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableRowClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableRowPropstr]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableRowPropstr*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
