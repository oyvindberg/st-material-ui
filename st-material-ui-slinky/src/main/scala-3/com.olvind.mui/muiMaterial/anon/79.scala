package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `79` extends StObject {
  
  var defaultProps: js.UndefOr[PartialGridPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesGridClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialGridPropsdiv]] = js.undefined
}
object `79` {
  
  inline def apply(): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`79`]
  }
  
  extension [Self <: `79`](x: Self) {
    
    inline def setDefaultProps(value: PartialGridPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesGridClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialGridPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialGridPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
