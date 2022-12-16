package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.imageListImageListClassesMod.ImageListClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `83`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListPropsul] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ImageListClassKey, "MuiImageList", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListPropsul]] = js.undefined
}
object `83` {
  
  inline def apply[Theme](): `83`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`83`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `83`[?], Theme] (val x: Self & `83`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialImageListPropsul): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ImageListClassKey, "MuiImageList", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialImageListPropsul]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialImageListPropsul*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
