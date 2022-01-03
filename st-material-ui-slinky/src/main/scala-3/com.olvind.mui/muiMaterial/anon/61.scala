package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogActionsProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogActionsC] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogActionsProps]] = js.undefined
}
object `61` {
  
  inline def apply(): `61` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setDefaultProps(value: PartialDialogActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesDialogActionsC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogActionsProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
