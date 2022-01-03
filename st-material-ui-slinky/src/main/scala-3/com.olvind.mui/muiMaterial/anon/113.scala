package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSkeletonPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSkeletonClassK] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSkeletonPropsspan]] = js.undefined
}
object `113` {
  
  inline def apply(): `113` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`113`]
  }
  
  extension [Self <: `113`](x: Self) {
    
    inline def setDefaultProps(value: PartialSkeletonPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSkeletonClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSkeletonPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSkeletonPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
