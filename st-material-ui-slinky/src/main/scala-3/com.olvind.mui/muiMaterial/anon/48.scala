package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardPropsdiv]] = js.undefined
}
object `48` {
  
  inline def apply(): `48` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`48`]
  }
  
  extension [Self <: `48`](x: Self) {
    
    inline def setDefaultProps(value: PartialCardPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCardClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
