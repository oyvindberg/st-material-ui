package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.dividerDividerClassesMod.DividerClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `67`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDividerPropshr] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DividerClassKey, "MuiDivider", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDividerPropshr]] = js.undefined
}
object `67` {
  
  inline def apply[Theme](): `67`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`67`[Theme]]
  }
  
  extension [Self <: `67`[?], Theme](x: Self & `67`[Theme]) {
    
    inline def setDefaultProps(value: PartialDividerPropshr): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[DividerClassKey, "MuiDivider", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDividerPropshr]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDividerPropshr*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
