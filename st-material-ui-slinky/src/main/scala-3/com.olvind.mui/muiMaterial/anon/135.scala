package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableTableClassesMod.TableClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `135`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTablePropstable] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableClassKey, "MuiTable", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTablePropstable]] = js.undefined
}
object `135` {
  
  inline def apply[Theme](): `135`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`135`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `135`[?], Theme] (val x: Self & `135`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTablePropstable): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TableClassKey, "MuiTable", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTablePropstable]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTablePropstable*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
