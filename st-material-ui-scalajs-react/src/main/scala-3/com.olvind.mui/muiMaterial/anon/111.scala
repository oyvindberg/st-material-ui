package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var defaultProps: js.UndefOr[PartialScopedCssBaselinePropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesScopedCssBasel] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialScopedCssBaselinePropsdiv]] = js.undefined
}
object `111` {
  
  inline def apply(): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setDefaultProps(value: PartialScopedCssBaselinePropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesScopedCssBasel): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialScopedCssBaselinePropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialScopedCssBaselinePropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
