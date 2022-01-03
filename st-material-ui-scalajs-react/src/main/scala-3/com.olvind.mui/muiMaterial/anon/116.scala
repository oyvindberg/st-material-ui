package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSnackbarContentPropsAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSnackbarConten] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSnackbarContentPropsAbout]] = js.undefined
}
object `116` {
  
  inline def apply(): `116` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`116`]
  }
  
  extension [Self <: `116`](x: Self) {
    
    inline def setDefaultProps(value: PartialSnackbarContentPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSnackbarConten): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSnackbarContentPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSnackbarContentPropsAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
