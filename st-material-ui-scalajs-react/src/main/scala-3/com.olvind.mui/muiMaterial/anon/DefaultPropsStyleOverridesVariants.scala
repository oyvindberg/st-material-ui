package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropsStyleOverridesVariants extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAvatarClassKey] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAvatarPropsdiv]] = js.undefined
}
object DefaultPropsStyleOverridesVariants {
  
  inline def apply(): DefaultPropsStyleOverridesVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsStyleOverridesVariants]
  }
  
  extension [Self <: DefaultPropsStyleOverridesVariants](x: Self) {
    
    inline def setDefaultProps(value: PartialAvatarPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAvatarClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAvatarPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAvatarPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
