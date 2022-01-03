package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionProps]] = js.undefined
}
object `67` {
  
  inline def apply(): `67` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`67`]
  }
  
  extension [Self <: `67`](x: Self) {
    
    inline def setDefaultProps(value: PartialAccordionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAccordionClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAccordionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAccordionProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
