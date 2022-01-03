package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOverrides extends StObject {
  
  var defaultProps: js.UndefOr[PartialAlertProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAlertClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsStyle]] = js.undefined
}
object StyleOverrides {
  
  inline def apply(): StyleOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverrides]
  }
  
  extension [Self <: StyleOverrides](x: Self) {
    
    inline def setDefaultProps(value: PartialAlertProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAlertClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsStyle]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsStyle*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
