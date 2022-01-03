package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSpeedDialClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialProps]] = js.undefined
}
object `117` {
  
  inline def apply(): `117` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`117`]
  }
  
  extension [Self <: `117`](x: Self) {
    
    inline def setDefaultProps(value: PartialSpeedDialProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSpeedDialClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSpeedDialProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSpeedDialProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
