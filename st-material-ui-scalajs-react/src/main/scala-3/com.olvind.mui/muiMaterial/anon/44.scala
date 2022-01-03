package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBreadcrumbsPropsnav] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesBreadcrumbsCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBreadcrumbsPropsnav]] = js.undefined
}
object `44` {
  
  inline def apply(): `44` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setDefaultProps(value: PartialBreadcrumbsPropsnav): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesBreadcrumbsCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBreadcrumbsPropsnav]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBreadcrumbsPropsnav*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
