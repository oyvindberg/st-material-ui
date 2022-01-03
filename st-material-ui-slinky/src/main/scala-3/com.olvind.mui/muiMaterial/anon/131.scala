package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableBodyPropstbody] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableBodyClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableBodyPropstbody]] = js.undefined
}
object `131` {
  
  inline def apply(): `131` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`131`]
  }
  
  extension [Self <: `131`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableBodyPropstbody): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableBodyClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableBodyPropstbody]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableBodyPropstbody*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
