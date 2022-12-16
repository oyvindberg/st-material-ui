package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.inputBaseInputBaseClassesMod.InputBaseClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `90`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputBaseProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[InputBaseClassKey, "MuiInputBase", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputBaseProps]] = js.undefined
}
object `90` {
  
  inline def apply[Theme](): `90`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`90`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `90`[?], Theme] (val x: Self & `90`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialInputBaseProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[InputBaseClassKey, "MuiInputBase", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputBaseProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputBaseProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
