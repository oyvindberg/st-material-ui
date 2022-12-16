package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.inputLabelInputLabelClassesMod.InputLabelClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputLabelPropsAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[InputLabelClassKey, "MuiInputLabel", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputLabelPropsAbout]] = js.undefined
}
object `91` {
  
  inline def apply[Theme](): `91`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`91`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `91`[?], Theme] (val x: Self & `91`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialInputLabelPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[InputLabelClassKey, "MuiInputLabel", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputLabelPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputLabelPropsAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
