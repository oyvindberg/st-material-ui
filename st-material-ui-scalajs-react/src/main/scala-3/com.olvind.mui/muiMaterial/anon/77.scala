package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `77` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormHelperTextPropsp] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormHelperText] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFormHelperTextPropsp]] = js.undefined
}
object `77` {
  
  inline def apply(): `77` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`77`]
  }
  
  extension [Self <: `77`](x: Self) {
    
    inline def setDefaultProps(value: PartialFormHelperTextPropsp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesFormHelperText): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFormHelperTextPropsp]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFormHelperTextPropsp*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
