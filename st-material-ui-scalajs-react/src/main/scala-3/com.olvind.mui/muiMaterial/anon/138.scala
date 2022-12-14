package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tableContainerTableContainerClassesMod.TableContainerClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `138`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableContainerPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TableContainerClassKey, "MuiTableContainer", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTableContainerPropsdiv]] = js.undefined
}
object `138` {
  
  inline def apply[Theme](): `138`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`138`[Theme]]
  }
  
  extension [Self <: `138`[?], Theme](x: Self & `138`[Theme]) {
    
    inline def setDefaultProps(value: PartialTableContainerPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[TableContainerClassKey, "MuiTableContainer", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTableContainerPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTableContainerPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}