package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCircularProgressProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCircularProgre] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCircularProgressProps]] = js.undefined
}
object `56` {
  
  inline def apply(): `56` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`56`]
  }
  
  extension [Self <: `56`](x: Self) {
    
    inline def setDefaultProps(value: PartialCircularProgressProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCircularProgre): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCircularProgressProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCircularProgressProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
