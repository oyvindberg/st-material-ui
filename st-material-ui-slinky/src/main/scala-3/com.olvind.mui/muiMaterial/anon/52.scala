package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardHeaderPropsdivspanspan] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardHeaderClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardHeaderPropsdivspanspan]] = js.undefined
}
object `52` {
  
  inline def apply(): `52` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`52`]
  }
  
  extension [Self <: `52`](x: Self) {
    
    inline def setDefaultProps(value: PartialCardHeaderPropsdivspanspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCardHeaderClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardHeaderPropsdivspanspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardHeaderPropsdivspanspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
