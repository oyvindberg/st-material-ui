package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84` extends StObject {
  
  var defaultProps: js.UndefOr[PartialIconButtonPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesIconButtonClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialIconButtonPropsdefaultComponent]] = js.undefined
}
object `84` {
  
  inline def apply(): `84` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`84`]
  }
  
  extension [Self <: `84`](x: Self) {
    
    inline def setDefaultProps(value: PartialIconButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesIconButtonClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialIconButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialIconButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
