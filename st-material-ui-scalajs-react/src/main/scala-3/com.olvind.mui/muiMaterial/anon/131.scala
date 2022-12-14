package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.svgIconSvgIconClassesMod.SvgIconClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `131`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSvgIconPropssvg] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SvgIconClassKey, "MuiSvgIcon", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSvgIconPropssvg]] = js.undefined
}
object `131` {
  
  inline def apply[Theme](): `131`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`131`[Theme]]
  }
  
  extension [Self <: `131`[?], Theme](x: Self & `131`[Theme]) {
    
    inline def setDefaultProps(value: PartialSvgIconPropssvg): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SvgIconClassKey, "MuiSvgIcon", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSvgIconPropssvg]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSvgIconPropssvg*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
