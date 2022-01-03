package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBottomNavigationPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesBottomNavigati] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBottomNavigationPropsdiv]] = js.undefined
}
object `42` {
  
  inline def apply(): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`42`]
  }
  
  extension [Self <: `42`](x: Self) {
    
    inline def setDefaultProps(value: PartialBottomNavigationPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesBottomNavigati): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBottomNavigationPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBottomNavigationPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
