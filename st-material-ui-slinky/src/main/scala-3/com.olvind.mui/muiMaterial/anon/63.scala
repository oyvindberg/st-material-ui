package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogContentTextPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogContentT] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogContentTextPropsspan]] = js.undefined
}
object `63` {
  
  inline def apply(): `63` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`63`]
  }
  
  extension [Self <: `63`](x: Self) {
    
    inline def setDefaultProps(value: PartialDialogContentTextPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesDialogContentT): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogContentTextPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogContentTextPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
