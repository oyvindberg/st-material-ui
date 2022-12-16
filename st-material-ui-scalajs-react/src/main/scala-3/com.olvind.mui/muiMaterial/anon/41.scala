package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.avatarGroupAvatarGroupClassesMod.AvatarGroupClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `41`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarGroupProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AvatarGroupClassKey, "MuiAvatarGroup", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAvatarGroupProps]] = js.undefined
}
object `41` {
  
  inline def apply[Theme](): `41`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`41`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `41`[?], Theme] (val x: Self & `41`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAvatarGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[AvatarGroupClassKey, "MuiAvatarGroup", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAvatarGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAvatarGroupProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
