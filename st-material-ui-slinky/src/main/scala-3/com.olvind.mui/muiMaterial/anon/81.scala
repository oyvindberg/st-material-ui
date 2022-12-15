package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.gridGridClassesMod.GridClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `81`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialGridPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[GridClassKey, "MuiGrid", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialGridPropsdiv]] = js.undefined
}
object `81` {
  
  inline def apply[Theme](): `81`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`81`[Theme]]
  }
  
  extension [Self <: `81`[?], Theme](x: Self & `81`[Theme]) {
    
    inline def setDefaultProps(value: PartialGridPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[GridClassKey, "MuiGrid", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialGridPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialGridPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
