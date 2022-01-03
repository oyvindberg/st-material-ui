package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.badgeBadgeMod.BadgeClassKey
import com.olvind.mui.muiMaterial.overridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBadgePropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[BadgeClassKey]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBadgePropsdefaultComponent]] = js.undefined
}
object `41` {
  
  inline def apply(): `41` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`41`]
  }
  
  extension [Self <: `41`](x: Self) {
    
    inline def setDefaultProps(value: PartialBadgePropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[BadgeClassKey]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBadgePropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBadgePropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
