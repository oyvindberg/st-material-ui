package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `86` extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputAdornmentPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesInputAdornment] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputAdornmentPropsdiv]] = js.undefined
}
object `86` {
  
  inline def apply(): `86` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`86`]
  }
  
  extension [Self <: `86`](x: Self) {
    
    inline def setDefaultProps(value: PartialInputAdornmentPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesInputAdornment): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputAdornmentPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputAdornmentPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
