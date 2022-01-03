package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTablePaginationPropsJSXElementCon] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTablePaginatio] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTablePaginationPropsJSXElementCon]] = js.undefined
}
object `136` {
  
  inline def apply(): `136` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`136`]
  }
  
  extension [Self <: `136`](x: Self) {
    
    inline def setDefaultProps(value: PartialTablePaginationPropsJSXElementCon): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTablePaginatio): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTablePaginationPropsJSXElementCon]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTablePaginationPropsJSXElementCon*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
