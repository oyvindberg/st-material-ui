package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  var defaultProps: js.UndefOr[PartialPopoverProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesPopoverClassKe] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPopoverProps]] = js.undefined
}
object `108` {
  
  inline def apply(): `108` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`108`]
  }
  
  extension [Self <: `108`](x: Self) {
    
    inline def setDefaultProps(value: PartialPopoverProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesPopoverClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPopoverProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPopoverProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
