package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81` extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListItemPropsli] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesImageListItemC] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListItemPropsli]] = js.undefined
}
object `81` {
  
  inline def apply(): `81` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`81`]
  }
  
  extension [Self <: `81`](x: Self) {
    
    inline def setDefaultProps(value: PartialImageListItemPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesImageListItemC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialImageListItemPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialImageListItemPropsli*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
