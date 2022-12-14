package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.modalModalMod.ModalClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `105`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialModalPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ModalClassKey, "MuiModal", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialModalPropsdefaultComponent]] = js.undefined
}
object `105` {
  
  inline def apply[Theme](): `105`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`105`[Theme]]
  }
  
  extension [Self <: `105`[?], Theme](x: Self & `105`[Theme]) {
    
    inline def setDefaultProps(value: PartialModalPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ModalClassKey, "MuiModal", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialModalPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialModalPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
