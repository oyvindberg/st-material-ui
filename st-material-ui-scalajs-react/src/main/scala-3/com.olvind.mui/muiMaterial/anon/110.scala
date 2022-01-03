package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110` extends StObject {
  
  var defaultProps: js.UndefOr[PartialRatingProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesRatingClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialRatingProps]] = js.undefined
}
object `110` {
  
  inline def apply(): `110` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`110`]
  }
  
  extension [Self <: `110`](x: Self) {
    
    inline def setDefaultProps(value: PartialRatingProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesRatingClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialRatingProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialRatingProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
