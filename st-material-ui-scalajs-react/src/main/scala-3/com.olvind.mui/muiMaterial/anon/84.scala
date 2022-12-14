package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.imageListItemImageListItemClassesMod.ImageListItemClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `84`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListItemPropsli] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ImageListItemClassKey, "MuiImageListItem", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListItemPropsli]] = js.undefined
}
object `84` {
  
  inline def apply[Theme](): `84`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`84`[Theme]]
  }
  
  extension [Self <: `84`[?], Theme](x: Self & `84`[Theme]) {
    
    inline def setDefaultProps(value: PartialImageListItemPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ImageListItemClassKey, "MuiImageListItem", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialImageListItemPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialImageListItemPropsli*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
