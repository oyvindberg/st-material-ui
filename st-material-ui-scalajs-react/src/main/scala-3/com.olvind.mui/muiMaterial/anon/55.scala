package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.cardMediaCardMediaClassesMod.CardMediaClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardMediaPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CardMediaClassKey, "MuiCardMedia", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardMediaPropsdiv]] = js.undefined
}
object `55` {
  
  inline def apply[Theme](): `55`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`55`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `55`[?], Theme] (val x: Self & `55`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardMediaPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[CardMediaClassKey, "MuiCardMedia", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardMediaPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardMediaPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
