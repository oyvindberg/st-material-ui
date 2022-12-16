package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.paginationPaginationClassesMod.PaginationClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaginationProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[PaginationClassKey, "MuiPagination", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPaginationProps]] = js.undefined
}
object `108` {
  
  inline def apply[Theme](): `108`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`108`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `108`[?], Theme] (val x: Self & `108`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialPaginationProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[PaginationClassKey, "MuiPagination", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPaginationProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPaginationProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
