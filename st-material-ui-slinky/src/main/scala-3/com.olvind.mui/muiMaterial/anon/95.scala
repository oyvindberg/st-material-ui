package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemListItemClassesMod.ListItemClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemPropsli] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ListItemClassKey, "MuiListItem", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemPropsli]] = js.undefined
}
object `95` {
  
  inline def apply[Theme](): `95`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`95`[Theme]]
  }
  
  extension [Self <: `95`[?], Theme](x: Self & `95`[Theme]) {
    
    inline def setDefaultProps(value: PartialListItemPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ListItemClassKey, "MuiListItem", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemPropsli*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
