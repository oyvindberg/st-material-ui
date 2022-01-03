package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var defaultProps: js.UndefOr[PartialChipPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesChipClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialChipPropsdiv]] = js.undefined
}
object `55` {
  
  inline def apply(): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`55`]
  }
  
  extension [Self <: `55`](x: Self) {
    
    inline def setDefaultProps(value: PartialChipPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesChipClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialChipPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialChipPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
