package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `130` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTablePropstable] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTablePropstable]] = js.undefined
}
object `130` {
  
  inline def apply(): `130` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`130`]
  }
  
  extension [Self <: `130`](x: Self) {
    
    inline def setDefaultProps(value: PartialTablePropstable): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTablePropstable]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTablePropstable*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
