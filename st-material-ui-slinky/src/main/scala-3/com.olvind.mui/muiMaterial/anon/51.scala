package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardContentPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardContentCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardContentPropsdiv]] = js.undefined
}
object `51` {
  
  inline def apply(): `51` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`51`]
  }
  
  extension [Self <: `51`](x: Self) {
    
    inline def setDefaultProps(value: PartialCardContentPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCardContentCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardContentPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardContentPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
