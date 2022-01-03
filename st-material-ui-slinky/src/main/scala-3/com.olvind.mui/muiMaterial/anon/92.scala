package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `92` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemPropsli] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemClassK] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemPropsli]] = js.undefined
}
object `92` {
  
  inline def apply(): `92` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`92`]
  }
  
  extension [Self <: `92`](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListItemClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemPropsli*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
