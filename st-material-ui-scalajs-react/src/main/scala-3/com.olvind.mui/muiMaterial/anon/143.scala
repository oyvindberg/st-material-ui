package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var defaultProps: js.UndefOr[PartialToolbarPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesToolbarClassKe] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialToolbarPropsdiv]] = js.undefined
}
object `143` {
  
  inline def apply(): `143` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`143`]
  }
  
  extension [Self <: `143`](x: Self) {
    
    inline def setDefaultProps(value: PartialToolbarPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesToolbarClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialToolbarPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialToolbarPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
