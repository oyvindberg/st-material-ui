package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `144` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTooltipProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTooltipClassKe] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTooltipProps]] = js.undefined
}
object `144` {
  
  inline def apply(): `144` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`144`]
  }
  
  extension [Self <: `144`](x: Self) {
    
    inline def setDefaultProps(value: PartialTooltipProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTooltipClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTooltipProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTooltipProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
