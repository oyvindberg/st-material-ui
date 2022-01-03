package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardMediaPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardMediaClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardMediaPropsdiv]] = js.undefined
}
object `53` {
  
  inline def apply(): `53` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`53`]
  }
  
  extension [Self <: `53`](x: Self) {
    
    inline def setDefaultProps(value: PartialCardMediaPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCardMediaClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardMediaPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardMediaPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
