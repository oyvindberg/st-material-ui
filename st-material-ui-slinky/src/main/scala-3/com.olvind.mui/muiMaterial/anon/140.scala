package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.textFieldTextFieldMod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140` extends StObject {
  
  var defaultProps: js.UndefOr[com.olvind.mui.std.Partial[TextFieldProps]] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTextFieldClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[StyleInterpolation]] = js.undefined
}
object `140` {
  
  inline def apply(): `140` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`140`]
  }
  
  extension [Self <: `140`](x: Self) {
    
    inline def setDefaultProps(value: com.olvind.mui.std.Partial[TextFieldProps]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTextFieldClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[StyleInterpolation]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: StyleInterpolation*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
