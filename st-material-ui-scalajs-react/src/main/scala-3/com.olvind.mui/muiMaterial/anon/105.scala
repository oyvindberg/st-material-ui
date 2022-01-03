package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105` extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaginationProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesPaginationClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPaginationProps]] = js.undefined
}
object `105` {
  
  inline def apply(): `105` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`105`]
  }
  
  extension [Self <: `105`](x: Self) {
    
    inline def setDefaultProps(value: PartialPaginationProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesPaginationClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPaginationProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPaginationProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
