package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAccordionActionsProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAccordionActio] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAccordionActionsProps]] = js.undefined
}
object `68` {
  
  inline def apply(): `68` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`68`]
  }
  
  extension [Self <: `68`](x: Self) {
    
    inline def setDefaultProps(value: PartialAccordionActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAccordionActio): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAccordionActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAccordionActionsProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
