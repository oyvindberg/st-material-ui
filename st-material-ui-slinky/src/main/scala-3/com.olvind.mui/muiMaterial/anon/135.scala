package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableHeadPropsthead] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableHeadClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableHeadPropsthead]] = js.undefined
}
object `135` {
  
  inline def apply(): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`135`]
  }
  
  extension [Self <: `135`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableHeadPropsthead): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableHeadClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableHeadPropsthead]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableHeadPropsthead*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
