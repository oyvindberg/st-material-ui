package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.outlinedInputOutlinedInputClassesMod.OutlinedInputClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `107`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialOutlinedInputProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[OutlinedInputClassKey, "MuiOutlinedInput", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialOutlinedInputProps]] = js.undefined
}
object `107` {
  
  inline def apply[Theme](): `107`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`107`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `107`[?], Theme] (val x: Self & `107`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialOutlinedInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[OutlinedInputClassKey, "MuiOutlinedInput", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialOutlinedInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialOutlinedInputProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
