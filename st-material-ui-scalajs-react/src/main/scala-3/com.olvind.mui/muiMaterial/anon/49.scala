package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `49` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardActionAreaPropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardActionArea] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardActionAreaPropsbutton]] = js.undefined
}
object `49` {
  
  inline def apply(): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`49`]
  }
  
  extension [Self <: `49`](x: Self) {
    
    inline def setDefaultProps(value: PartialCardActionAreaPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesCardActionArea): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardActionAreaPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardActionAreaPropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
