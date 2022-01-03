package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `106` extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaginationItemPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesPaginationItem] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPaginationItemPropsdiv]] = js.undefined
}
object `106` {
  
  inline def apply(): `106` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`106`]
  }
  
  extension [Self <: `106`](x: Self) {
    
    inline def setDefaultProps(value: PartialPaginationItemPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesPaginationItem): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPaginationItemPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPaginationItemPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
