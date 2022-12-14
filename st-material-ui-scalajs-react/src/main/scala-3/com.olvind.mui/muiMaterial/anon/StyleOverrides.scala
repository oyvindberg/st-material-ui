package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.alertAlertClassesMod.AlertClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleOverrides[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAlertProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AlertClassKey, "MuiAlert", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsStyle]] = js.undefined
}
object StyleOverrides {
  
  inline def apply[Theme](): StyleOverrides[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverrides[Theme]]
  }
  
  extension [Self <: StyleOverrides[?], Theme](x: Self & StyleOverrides[Theme]) {
    
    inline def setDefaultProps(value: PartialAlertProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[AlertClassKey, "MuiAlert", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsStyle]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsStyle*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
