package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.radioRadioClassesMod.RadioClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `113`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialRadioProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[RadioClassKey, "MuiRadio", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialRadioProps]] = js.undefined
}
object `113` {
  
  inline def apply[Theme](): `113`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`113`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `113`[?], Theme] (val x: Self & `113`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialRadioProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[RadioClassKey, "MuiRadio", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialRadioProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialRadioProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
