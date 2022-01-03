package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `118` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialActionProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSpeedDialActio] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialActionProps]] = js.undefined
}
object `118` {
  
  inline def apply(): `118` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`118`]
  }
  
  extension [Self <: `118`](x: Self) {
    
    inline def setDefaultProps(value: PartialSpeedDialActionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSpeedDialActio): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSpeedDialActionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSpeedDialActionProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
