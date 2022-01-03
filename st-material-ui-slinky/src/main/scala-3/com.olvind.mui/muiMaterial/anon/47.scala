package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47` extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonGroupPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesButtonGroupCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonGroupPropsdiv]] = js.undefined
}
object `47` {
  
  inline def apply(): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`47`]
  }
  
  extension [Self <: `47`](x: Self) {
    
    inline def setDefaultProps(value: PartialButtonGroupPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesButtonGroupCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialButtonGroupPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialButtonGroupPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
