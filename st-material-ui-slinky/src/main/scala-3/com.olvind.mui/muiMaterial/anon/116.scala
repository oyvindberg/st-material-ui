package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.selectSelectClassesMod.SelectClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `116`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSelectPropsunknownAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SelectClassKey, "MuiSelect", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSelectPropsunknownAbout]] = js.undefined
}
object `116` {
  
  inline def apply[Theme](): `116`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`116`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `116`[?], Theme] (val x: Self & `116`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSelectPropsunknownAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SelectClassKey, "MuiSelect", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSelectPropsunknownAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSelectPropsunknownAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
