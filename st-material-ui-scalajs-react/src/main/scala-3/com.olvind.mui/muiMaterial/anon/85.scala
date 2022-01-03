package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `85` extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesInputClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputProps]] = js.undefined
}
object `85` {
  
  inline def apply(): `85` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`85`]
  }
  
  extension [Self <: `85`](x: Self) {
    
    inline def setDefaultProps(value: PartialInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesInputClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
