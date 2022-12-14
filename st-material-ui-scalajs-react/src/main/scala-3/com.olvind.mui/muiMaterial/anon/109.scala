package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.paginationItemPaginationItemClassesMod.PaginationItemClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaginationItemPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[PaginationItemClassKey, "MuiPaginationItem", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPaginationItemPropsdiv]] = js.undefined
}
object `109` {
  
  inline def apply[Theme](): `109`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`109`[Theme]]
  }
  
  extension [Self <: `109`[?], Theme](x: Self & `109`[Theme]) {
    
    inline def setDefaultProps(value: PartialPaginationItemPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[PaginationItemClassKey, "MuiPaginationItem", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPaginationItemPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPaginationItemPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
