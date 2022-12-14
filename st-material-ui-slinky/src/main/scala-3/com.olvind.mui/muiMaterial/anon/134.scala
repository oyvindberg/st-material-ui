package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tabTabClassesMod.TabClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTabPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[TabClassKey, "MuiTab", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTabPropsdefaultComponent]] = js.undefined
}
object `134` {
  
  inline def apply[Theme](): `134`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`134`[Theme]]
  }
  
  extension [Self <: `134`[?], Theme](x: Self & `134`[Theme]) {
    
    inline def setDefaultProps(value: PartialTabPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TabClassKey, "MuiTab", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTabPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTabPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}