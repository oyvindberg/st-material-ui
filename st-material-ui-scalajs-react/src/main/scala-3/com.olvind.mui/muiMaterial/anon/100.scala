package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuItemPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesMenuItemClassK] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialMenuItemPropsdefaultComponent]] = js.undefined
}
object `100` {
  
  inline def apply(): `100` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`100`]
  }
  
  extension [Self <: `100`](x: Self) {
    
    inline def setDefaultProps(value: PartialMenuItemPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesMenuItemClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialMenuItemPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialMenuItemPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
