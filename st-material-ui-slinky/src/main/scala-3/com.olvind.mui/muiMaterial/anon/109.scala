package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var defaultProps: js.UndefOr[PartialRadioProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesRadioClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialRadioProps]] = js.undefined
}
object `109` {
  
  inline def apply(): `109` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`109`]
  }
  
  extension [Self <: `109`](x: Self) {
    
    inline def setDefaultProps(value: PartialRadioProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesRadioClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialRadioProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialRadioProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
