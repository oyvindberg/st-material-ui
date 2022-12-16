package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.fabFabClassesMod.FabClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialFabPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[FabClassKey, "MuiFab", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFabPropsdefaultComponent]] = js.undefined
}
object `73` {
  
  inline def apply[Theme](): `73`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`73`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `73`[?], Theme] (val x: Self & `73`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialFabPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[FabClassKey, "MuiFab", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFabPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFabPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
