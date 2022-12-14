package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.snackbarSnackbarClassesMod.SnackbarClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `119`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSnackbarProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SnackbarClassKey, "MuiSnackbar", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSnackbarProps]] = js.undefined
}
object `119` {
  
  inline def apply[Theme](): `119`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`119`[Theme]]
  }
  
  extension [Self <: `119`[?], Theme](x: Self & `119`[Theme]) {
    
    inline def setDefaultProps(value: PartialSnackbarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SnackbarClassKey, "MuiSnackbar", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSnackbarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSnackbarProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
