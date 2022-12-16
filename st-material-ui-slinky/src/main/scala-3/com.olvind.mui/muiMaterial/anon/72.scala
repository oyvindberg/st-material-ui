package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.accordionSummaryAccordionSummaryClassesMod.AccordionSummaryClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionSummaryPropsdefaultCompo] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AccordionSummaryClassKey, "MuiAccordionSummary", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionSummaryPropsdefaultCompo]] = js.undefined
}
object `72` {
  
  inline def apply[Theme](): `72`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`72`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `72`[?], Theme] (val x: Self & `72`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAccordionSummaryPropsdefaultCompo): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[AccordionSummaryClassKey, "MuiAccordionSummary", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAccordionSummaryPropsdefaultCompo]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAccordionSummaryPropsdefaultCompo*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
