package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.cardContentCardContentClassesMod.CardContentClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `53`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardContentPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CardContentClassKey, "MuiCardContent", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardContentPropsdiv]] = js.undefined
}
object `53` {
  
  inline def apply[Theme](): `53`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`53`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `53`[?], Theme] (val x: Self & `53`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardContentPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[CardContentClassKey, "MuiCardContent", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardContentPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardContentPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
