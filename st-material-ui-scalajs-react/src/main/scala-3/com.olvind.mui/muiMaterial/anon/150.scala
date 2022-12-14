package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonBaseTouchRippleClassesMod.TouchRippleClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTouchRippleProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TouchRippleClassKey, "MuiTouchRipple", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTouchRippleProps]] = js.undefined
}
object `150` {
  
  inline def apply[Theme](): `150`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`150`[Theme]]
  }
  
  extension [Self <: `150`[?], Theme](x: Self & `150`[Theme]) {
    
    inline def setDefaultProps(value: PartialTouchRippleProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[TouchRippleClassKey, "MuiTouchRipple", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTouchRippleProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTouchRippleProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
