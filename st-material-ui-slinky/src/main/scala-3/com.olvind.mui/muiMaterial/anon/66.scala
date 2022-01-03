package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDrawerProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDrawerClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDrawerProps]] = js.undefined
}
object `66` {
  
  inline def apply(): `66` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`66`]
  }
  
  extension [Self <: `66`](x: Self) {
    
    inline def setDefaultProps(value: PartialDrawerProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesDrawerClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDrawerProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDrawerProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
