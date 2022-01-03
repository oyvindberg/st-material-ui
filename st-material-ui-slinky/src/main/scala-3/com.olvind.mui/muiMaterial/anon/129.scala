package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTabPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTabClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTabPropsdefaultComponent]] = js.undefined
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setDefaultProps(value: PartialTabPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTabClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTabPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTabPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
