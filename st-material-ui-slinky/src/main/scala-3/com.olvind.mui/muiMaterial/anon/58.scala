package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `58` extends StObject {
  
  var defaultProps: js.UndefOr[PartialContainerPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesContainerClass] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialContainerPropsdiv]] = js.undefined
}
object `58` {
  
  inline def apply(): `58` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`58`]
  }
  
  extension [Self <: `58`](x: Self) {
    
    inline def setDefaultProps(value: PartialContainerPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesContainerClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialContainerPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialContainerPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
