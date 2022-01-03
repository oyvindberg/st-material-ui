package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `145` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTouchRippleProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTouchRippleCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTouchRippleProps]] = js.undefined
}
object `145` {
  
  inline def apply(): `145` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`145`]
  }
  
  extension [Self <: `145`](x: Self) {
    
    inline def setDefaultProps(value: PartialTouchRippleProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTouchRippleCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTouchRippleProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTouchRippleProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
