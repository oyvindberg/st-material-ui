package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableRowTableRowClassesMod.TableRowClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `142`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableRowPropstr] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableRowClassKey, "MuiTableRow", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableRowPropstr]] = js.undefined
}
object `142` {
  
  inline def apply[Theme](): `142`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`142`[Theme]]
  }
  
  extension [Self <: `142`[?], Theme](x: Self & `142`[Theme]) {
    
    inline def setDefaultProps(value: PartialTableRowPropstr): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TableRowClassKey, "MuiTableRow", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableRowPropstr]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableRowPropstr*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
