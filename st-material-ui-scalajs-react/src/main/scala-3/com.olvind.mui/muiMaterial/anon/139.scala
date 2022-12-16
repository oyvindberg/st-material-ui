package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableFooterTableFooterClassesMod.TableFooterClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `139`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableFooterPropstfoot] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableFooterClassKey, "MuiTableFooter", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableFooterPropstfoot]] = js.undefined
}
object `139` {
  
  inline def apply[Theme](): `139`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`139`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `139`[?], Theme] (val x: Self & `139`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTableFooterPropstfoot): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[TableFooterClassKey, "MuiTableFooter", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableFooterPropstfoot]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableFooterPropstfoot*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
