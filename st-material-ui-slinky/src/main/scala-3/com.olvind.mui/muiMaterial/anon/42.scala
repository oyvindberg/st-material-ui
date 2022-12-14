package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.backdropBackdropClassesMod.BackdropClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBackdropPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[BackdropClassKey, "MuiBackdrop", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBackdropPropsdiv]] = js.undefined
}
object `42` {
  
  inline def apply[Theme](): `42`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`42`[Theme]]
  }
  
  extension [Self <: `42`[?], Theme](x: Self & `42`[Theme]) {
    
    inline def setDefaultProps(value: PartialBackdropPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[BackdropClassKey, "MuiBackdrop", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBackdropPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBackdropPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
