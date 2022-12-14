package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.collapseCollapseClassesMod.CollapseClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCollapseProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CollapseClassKey, "MuiCollapse", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCollapseProps]] = js.undefined
}
object `59` {
  
  inline def apply[Theme](): `59`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`59`[Theme]]
  }
  
  extension [Self <: `59`[?], Theme](x: Self & `59`[Theme]) {
    
    inline def setDefaultProps(value: PartialCollapseProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[CollapseClassKey, "MuiCollapse", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCollapseProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCollapseProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
