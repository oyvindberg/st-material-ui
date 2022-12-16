package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listListClassesMod.ListClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListPropsul] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[ListClassKey, "MuiList", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListPropsul]] = js.undefined
}
object `94` {
  
  inline def apply[Theme](): `94`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`94`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `94`[?], Theme] (val x: Self & `94`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListPropsul): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ListClassKey, "MuiList", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListPropsul]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListPropsul*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
