package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `132` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableCellProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableCellClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableCellProps]] = js.undefined
}
object `132` {
  
  inline def apply(): `132` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`132`]
  }
  
  extension [Self <: `132`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableCellProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableCellClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableCellProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableCellProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
