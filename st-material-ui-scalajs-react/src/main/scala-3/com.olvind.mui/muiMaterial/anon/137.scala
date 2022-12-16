package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableCellTableCellClassesMod.TableCellClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `137`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableCellProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableCellClassKey, "MuiTableCell", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableCellProps]] = js.undefined
}
object `137` {
  
  inline def apply[Theme](): `137`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`137`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `137`[?], Theme] (val x: Self & `137`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTableCellProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TableCellClassKey, "MuiTableCell", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableCellProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableCellProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
