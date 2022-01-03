package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `72` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFilledInputProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFilledInputCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialFilledInputProps]] = js.undefined
}
object `72` {
  
  inline def apply(): `72` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`72`]
  }
  
  extension [Self <: `72`](x: Self) {
    
    inline def setDefaultProps(value: PartialFilledInputProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesFilledInputCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialFilledInputProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialFilledInputProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
