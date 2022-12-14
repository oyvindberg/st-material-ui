package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableBodyTableBodyClassesMod.TableBodyClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `136`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableBodyPropstbody] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableBodyClassKey, "MuiTableBody", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableBodyPropstbody]] = js.undefined
}
object `136` {
  
  inline def apply[Theme](): `136`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`136`[Theme]]
  }
  
  extension [Self <: `136`[?], Theme](x: Self & `136`[Theme]) {
    
    inline def setDefaultProps(value: PartialTableBodyPropstbody): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TableBodyClassKey, "MuiTableBody", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableBodyPropstbody]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableBodyPropstbody*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}