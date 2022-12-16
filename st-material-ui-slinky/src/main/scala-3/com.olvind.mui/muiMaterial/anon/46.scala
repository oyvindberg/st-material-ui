package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.breadcrumbsBreadcrumbsClassesMod.BreadcrumbsClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBreadcrumbsPropsnav] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[BreadcrumbsClassKey, "MuiBreadcrumbs", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBreadcrumbsPropsnav]] = js.undefined
}
object `46` {
  
  inline def apply[Theme](): `46`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`46`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `46`[?], Theme] (val x: Self & `46`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialBreadcrumbsPropsnav): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[BreadcrumbsClassKey, "MuiBreadcrumbs", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBreadcrumbsPropsnav]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBreadcrumbsPropsnav*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
