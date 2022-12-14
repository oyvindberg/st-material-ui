package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.badgeBadgeClassesMod.BadgeClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `43`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBadgePropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[BadgeClassKey, "MuiBadge", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBadgePropsdefaultComponent]] = js.undefined
}
object `43` {
  
  inline def apply[Theme](): `43`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`43`[Theme]]
  }
  
  extension [Self <: `43`[?], Theme](x: Self & `43`[Theme]) {
    
    inline def setDefaultProps(value: PartialBadgePropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[BadgeClassKey, "MuiBadge", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBadgePropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBadgePropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
