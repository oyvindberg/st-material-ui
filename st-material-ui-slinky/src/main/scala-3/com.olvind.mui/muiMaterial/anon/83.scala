package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83` extends StObject {
  
  var defaultProps: js.UndefOr[PartialIconPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesIconClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialIconPropsspan]] = js.undefined
}
object `83` {
  
  inline def apply(): `83` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`83`]
  }
  
  extension [Self <: `83`](x: Self) {
    
    inline def setDefaultProps(value: PartialIconPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesIconClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialIconPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialIconPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
