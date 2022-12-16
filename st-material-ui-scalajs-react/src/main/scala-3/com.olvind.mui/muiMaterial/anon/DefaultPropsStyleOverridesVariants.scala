package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.avatarAvatarClassesMod.AvatarClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropsStyleOverridesVariants[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AvatarClassKey, "MuiAvatar", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAvatarPropsdiv]] = js.undefined
}
object DefaultPropsStyleOverridesVariants {
  
  inline def apply[Theme](): DefaultPropsStyleOverridesVariants[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsStyleOverridesVariants[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultPropsStyleOverridesVariants[?], Theme] (val x: Self & DefaultPropsStyleOverridesVariants[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialAvatarPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[AvatarClassKey, "MuiAvatar", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAvatarPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAvatarPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
