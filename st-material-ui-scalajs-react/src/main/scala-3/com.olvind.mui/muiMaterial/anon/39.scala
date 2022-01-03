package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `39` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarGroupProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAvatarGroupCla] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAvatarGroupProps]] = js.undefined
}
object `39` {
  
  inline def apply(): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`39`]
  }
  
  extension [Self <: `39`](x: Self) {
    
    inline def setDefaultProps(value: PartialAvatarGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAvatarGroupCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAvatarGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAvatarGroupProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
