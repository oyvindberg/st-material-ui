package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.menuItemMenuItemClassesMod.MenuItemClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuItemPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[MenuItemClassKey, "MuiMenuItem", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialMenuItemPropsdefaultComponent]] = js.undefined
}
object `103` {
  
  inline def apply[Theme](): `103`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`103`[Theme]]
  }
  
  extension [Self <: `103`[?], Theme](x: Self & `103`[Theme]) {
    
    inline def setDefaultProps(value: PartialMenuItemPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[MenuItemClassKey, "MuiMenuItem", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialMenuItemPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialMenuItemPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
