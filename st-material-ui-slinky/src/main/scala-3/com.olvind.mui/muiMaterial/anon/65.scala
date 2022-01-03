package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDividerPropshr] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDividerClassKe] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDividerPropshr]] = js.undefined
}
object `65` {
  
  inline def apply(): `65` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`65`]
  }
  
  extension [Self <: `65`](x: Self) {
    
    inline def setDefaultProps(value: PartialDividerPropshr): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesDividerClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDividerPropshr]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDividerPropshr*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
