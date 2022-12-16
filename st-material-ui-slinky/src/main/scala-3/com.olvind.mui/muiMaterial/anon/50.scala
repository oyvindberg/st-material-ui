package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.cardCardClassesMod.CardClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[CardClassKey, "MuiCard", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardPropsdiv]] = js.undefined
}
object `50` {
  
  inline def apply[Theme](): `50`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`50`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `50`[?], Theme] (val x: Self & `50`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[CardClassKey, "MuiCard", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
