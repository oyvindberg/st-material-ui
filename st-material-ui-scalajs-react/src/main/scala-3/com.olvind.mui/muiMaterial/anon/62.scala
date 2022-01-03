package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogContentProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogContentC] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogContentProps]] = js.undefined
}
object `62` {
  
  inline def apply(): `62` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`62`]
  }
  
  extension [Self <: `62`](x: Self) {
    
    inline def setDefaultProps(value: PartialDialogContentProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesDialogContentC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogContentProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogContentProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
