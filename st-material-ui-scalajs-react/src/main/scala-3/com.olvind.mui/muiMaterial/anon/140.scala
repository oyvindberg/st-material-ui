package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableHeadTableHeadClassesMod.TableHeadClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `140`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableHeadPropsthead] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableHeadClassKey, "MuiTableHead", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableHeadPropsthead]] = js.undefined
}
object `140` {
  
  inline def apply[Theme](): `140`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`140`[Theme]]
  }
  
  extension [Self <: `140`[?], Theme](x: Self & `140`[Theme]) {
    
    inline def setDefaultProps(value: PartialTableHeadPropsthead): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TableHeadClassKey, "MuiTableHead", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableHeadPropsthead]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableHeadPropsthead*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
