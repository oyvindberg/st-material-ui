package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.toolbarToolbarClassesMod.ToolbarClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialToolbarPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ToolbarClassKey, "MuiToolbar", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialToolbarPropsdiv]] = js.undefined
}
object `148` {
  
  inline def apply[Theme](): `148`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`148`[Theme]]
  }
  
  extension [Self <: `148`[?], Theme](x: Self & `148`[Theme]) {
    
    inline def setDefaultProps(value: PartialToolbarPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ToolbarClassKey, "MuiToolbar", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialToolbarPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialToolbarPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
