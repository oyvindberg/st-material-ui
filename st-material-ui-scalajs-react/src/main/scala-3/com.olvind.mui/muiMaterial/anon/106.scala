package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.nativeSelectNativeSelectClassesMod.NativeSelectClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialNativeSelectProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[NativeSelectClassKey, "MuiNativeSelect", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialNativeSelectProps]] = js.undefined
}
object `106` {
  
  inline def apply[Theme](): `106`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`106`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `106`[?], Theme] (val x: Self & `106`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialNativeSelectProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[NativeSelectClassKey, "MuiNativeSelect", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialNativeSelectProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialNativeSelectProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
