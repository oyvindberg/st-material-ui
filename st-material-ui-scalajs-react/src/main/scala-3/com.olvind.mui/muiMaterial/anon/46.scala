package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonBasePropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesButtonBaseClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonBasePropsbutton]] = js.undefined
}
object `46` {
  
  inline def apply(): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`46`]
  }
  
  extension [Self <: `46`](x: Self) {
    
    inline def setDefaultProps(value: PartialButtonBasePropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesButtonBaseClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialButtonBasePropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialButtonBasePropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
