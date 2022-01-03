package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBottomNavigationActionPropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesBottomNavigatiIconOnly] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBottomNavigationActionPropsbutton]] = js.undefined
}
object `43` {
  
  inline def apply(): `43` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`43`]
  }
  
  extension [Self <: `43`](x: Self) {
    
    inline def setDefaultProps(value: PartialBottomNavigationActionPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesBottomNavigatiIconOnly): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBottomNavigationActionPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBottomNavigationActionPropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
