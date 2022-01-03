package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `94` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemAvatarProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemAvatar] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemAvatarProps]] = js.undefined
}
object `94` {
  
  inline def apply(): `94` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`94`]
  }
  
  extension [Self <: `94`](x: Self) {
    
    inline def setDefaultProps(value: PartialListItemAvatarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesListItemAvatar): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemAvatarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemAvatarProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
