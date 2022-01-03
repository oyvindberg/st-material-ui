package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemSecondaryActionProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemSecond] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemSecondaryActionProps]] = js.undefined
}
object `96` {
  
  inline def apply(): `96` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`96`]
  }
  
  extension [Self <: `96`](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemSecondaryActionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListItemSecond): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemSecondaryActionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemSecondaryActionProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
