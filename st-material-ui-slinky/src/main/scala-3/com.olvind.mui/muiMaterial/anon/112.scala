package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSelectPropsunknownAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSelectClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSelectPropsunknownAbout]] = js.undefined
}
object `112` {
  
  inline def apply(): `112` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`112`]
  }
  
  extension [Self <: `112`](x: Self) {
    
    inline def setDefaultProps(value: PartialSelectPropsunknownAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSelectClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSelectPropsunknownAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSelectPropsunknownAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
