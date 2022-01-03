package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `99` extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuPropsAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesMenuClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialMenuPropsAbout]] = js.undefined
}
object `99` {
  
  inline def apply(): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`99`]
  }
  
  extension [Self <: `99`](x: Self) {
    
    inline def setDefaultProps(value: PartialMenuPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesMenuClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialMenuPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialMenuPropsAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
