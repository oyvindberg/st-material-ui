package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `133` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableContainerPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableContainer] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableContainerPropsdiv]] = js.undefined
}
object `133` {
  
  inline def apply(): `133` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`133`]
  }
  
  extension [Self <: `133`](x: Self) {
    
    inline def setDefaultProps(value: PartialTableContainerPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesTableContainer): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableContainerPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableContainerPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
