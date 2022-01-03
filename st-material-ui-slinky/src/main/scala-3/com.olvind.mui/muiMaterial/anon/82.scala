package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82` extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListItemBarProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesImageListItemB] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListItemBarProps]] = js.undefined
}
object `82` {
  
  inline def apply(): `82` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`82`]
  }
  
  extension [Self <: `82`](x: Self) {
    
    inline def setDefaultProps(value: PartialImageListItemBarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesImageListItemB): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialImageListItemBarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialImageListItemBarProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
