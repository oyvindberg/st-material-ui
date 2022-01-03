package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListSubheaderPropsli] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListSubheaderC] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListSubheaderPropsli]] = js.undefined
}
object `98` {
  
  inline def apply(): `98` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`98`]
  }
  
  extension [Self <: `98`](x: Self) {
    
    inline def setDefaultProps(value: PartialListSubheaderPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListSubheaderC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListSubheaderPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListSubheaderPropsli*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
