package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonButtonClassesMod.ButtonClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `47`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ButtonClassKey, "MuiButton", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonPropsdefaultComponent]] = js.undefined
}
object `47` {
  
  inline def apply[Theme](): `47`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`47`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `47`[?], Theme] (val x: Self & `47`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ButtonClassKey, "MuiButton", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
