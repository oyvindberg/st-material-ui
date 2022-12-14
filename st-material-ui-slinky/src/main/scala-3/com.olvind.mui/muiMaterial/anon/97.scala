package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemAvatarListItemAvatarClassesMod.ListItemAvatarClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemAvatarProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ListItemAvatarClassKey, "MuiListItemAvatar", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemAvatarProps]] = js.undefined
}
object `97` {
  
  inline def apply[Theme](): `97`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`97`[Theme]]
  }
  
  extension [Self <: `97`[?], Theme](x: Self & `97`[Theme]) {
    
    inline def setDefaultProps(value: PartialListItemAvatarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ListItemAvatarClassKey, "MuiListItemAvatar", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemAvatarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemAvatarProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
