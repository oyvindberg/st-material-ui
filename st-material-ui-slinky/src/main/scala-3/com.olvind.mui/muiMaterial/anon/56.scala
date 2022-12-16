package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.checkboxCheckboxClassesMod.CheckboxClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `56`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCheckboxProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CheckboxClassKey, "MuiCheckbox", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCheckboxProps]] = js.undefined
}
object `56` {
  
  inline def apply[Theme](): `56`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`56`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `56`[?], Theme] (val x: Self & `56`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCheckboxProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[CheckboxClassKey, "MuiCheckbox", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCheckboxProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCheckboxProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
