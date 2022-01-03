package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemIconProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemIconCl] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemIconProps]] = js.undefined
}
object `95` {
  
  inline def apply(): `95` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`95`]
  }
  
  extension [Self <: `95`](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListItemIconCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemIconProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
