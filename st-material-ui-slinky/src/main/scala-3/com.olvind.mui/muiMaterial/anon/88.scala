package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.inputInputClassesMod.InputClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[InputClassKey, "MuiInput", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputProps]] = js.undefined
}
object `88` {
  
  inline def apply[Theme](): `88`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`88`[Theme]]
  }
  
  extension [Self <: `88`[?], Theme](x: Self & `88`[Theme]) {
    
    inline def setDefaultProps(value: PartialInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[InputClassKey, "MuiInput", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
