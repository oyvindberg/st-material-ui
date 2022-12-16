package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.unstableGrid2Grid2PropsMod.Grid2Slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `82`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialGrid2Propsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[Grid2Slot, "MuiGrid2", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialGrid2Propsdiv]] = js.undefined
}
object `82` {
  
  inline def apply[Theme](): `82`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`82`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `82`[?], Theme] (val x: Self & `82`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialGrid2Propsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[Grid2Slot, "MuiGrid2", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialGrid2Propsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialGrid2Propsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
