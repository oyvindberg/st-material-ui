package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemButtonPropsdefaultCompone] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemButton] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemButtonPropsdefaultCompone]] = js.undefined
}
object `93` {
  
  inline def apply(): `93` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`93`]
  }
  
  extension [Self <: `93`](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemButtonPropsdefaultCompone): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListItemButton): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemButtonPropsdefaultCompone]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemButtonPropsdefaultCompone*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
