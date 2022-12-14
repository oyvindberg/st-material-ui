package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemIconListItemIconClassesMod.ListItemIconClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `98`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemIconProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ListItemIconClassKey, "MuiListItemIcon", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemIconProps]] = js.undefined
}
object `98` {
  
  inline def apply[Theme](): `98`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`98`[Theme]]
  }
  
  extension [Self <: `98`[?], Theme](x: Self & `98`[Theme]) {
    
    inline def setDefaultProps(value: PartialListItemIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ListItemIconClassKey, "MuiListItemIcon", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemIconProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
