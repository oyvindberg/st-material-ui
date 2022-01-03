package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormGroupProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormGroupClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormGroupProps]] = js.undefined
}
object `76` {
  
  inline def apply(): `76` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`76`]
  }
  
  extension [Self <: `76`](x: Self) {
    
    inline def setDefaultProps(value: PartialFormGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesFormGroupClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormGroupProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
