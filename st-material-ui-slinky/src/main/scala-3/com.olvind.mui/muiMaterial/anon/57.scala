package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.chipChipClassesMod.ChipClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `57`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialChipPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[ChipClassKey, "MuiChip", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialChipPropsdiv]] = js.undefined
}
object `57` {
  
  inline def apply[Theme](): `57`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`57`[Theme]]
  }
  
  extension [Self <: `57`[?], Theme](x: Self & `57`[Theme]) {
    
    inline def setDefaultProps(value: PartialChipPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ChipClassKey, "MuiChip", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialChipPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialChipPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
