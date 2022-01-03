package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardActionsProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardActionsCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardActionsProps]] = js.undefined
}
object `50` {
  
  inline def apply(): `50` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`50`]
  }
  
  extension [Self <: `50`](x: Self) {
    
    inline def setDefaultProps(value: PartialCardActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCardActionsCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardActionsProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
