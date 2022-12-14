package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.linkLinkClassesMod.LinkClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinkPropsa] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[LinkClassKey, "MuiLink", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialLinkPropsa]] = js.undefined
}
object `93` {
  
  inline def apply[Theme](): `93`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`93`[Theme]]
  }
  
  extension [Self <: `93`[?], Theme](x: Self & `93`[Theme]) {
    
    inline def setDefaultProps(value: PartialLinkPropsa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[LinkClassKey, "MuiLink", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialLinkPropsa]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialLinkPropsa*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
