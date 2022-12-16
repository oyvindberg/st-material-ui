package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.accordionActionsAccordionActionsClassesMod.AccordionActionsClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `70`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionActionsProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AccordionActionsClassKey, "MuiAccordionActions", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionActionsProps]] = js.undefined
}
object `70` {
  
  inline def apply[Theme](): `70`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`70`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `70`[?], Theme] (val x: Self & `70`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAccordionActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[AccordionActionsClassKey, "MuiAccordionActions", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAccordionActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAccordionActionsProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
