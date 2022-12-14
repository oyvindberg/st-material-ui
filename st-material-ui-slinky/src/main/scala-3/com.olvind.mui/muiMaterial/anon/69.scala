package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.accordionAccordionClassesMod.AccordionClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AccordionClassKey, "MuiAccordion", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionProps]] = js.undefined
}
object `69` {
  
  inline def apply[Theme](): `69`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`69`[Theme]]
  }
  
  extension [Self <: `69`[?], Theme](x: Self & `69`[Theme]) {
    
    inline def setDefaultProps(value: PartialAccordionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[AccordionClassKey, "MuiAccordion", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAccordionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAccordionProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
