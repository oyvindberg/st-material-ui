package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.cardHeaderCardHeaderClassesMod.CardHeaderClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardHeaderPropsdivspanspan] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CardHeaderClassKey, "MuiCardHeader", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardHeaderPropsdivspanspan]] = js.undefined
}
object `54` {
  
  inline def apply[Theme](): `54`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`54`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `54`[?], Theme] (val x: Self & `54`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardHeaderPropsdivspanspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[CardHeaderClassKey, "MuiCardHeader", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardHeaderPropsdivspanspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardHeaderPropsdivspanspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
