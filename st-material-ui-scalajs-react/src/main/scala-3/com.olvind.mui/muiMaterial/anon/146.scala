package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `146` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTypographyPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTypographyClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTypographyPropsspan]] = js.undefined
}
object `146` {
  
  inline def apply(): `146` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`146`]
  }
  
  extension [Self <: `146`](x: Self) {
    
    inline def setDefaultProps(value: PartialTypographyPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTypographyClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTypographyPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTypographyPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
