package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tablePaginationTablePaginationClassesMod.TablePaginationClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `141`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTablePaginationPropsJSXElementCon] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TablePaginationClassKey, "MuiTablePagination", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTablePaginationPropsJSXElementCon]] = js.undefined
}
object `141` {
  
  inline def apply[Theme](): `141`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`141`[Theme]]
  }
  
  extension [Self <: `141`[?], Theme](x: Self & `141`[Theme]) {
    
    inline def setDefaultProps(value: PartialTablePaginationPropsJSXElementCon): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[TablePaginationClassKey, "MuiTablePagination", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTablePaginationPropsJSXElementCon]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTablePaginationPropsJSXElementCon*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
