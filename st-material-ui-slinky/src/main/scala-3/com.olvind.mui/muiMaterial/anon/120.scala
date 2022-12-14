package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.snackbarContentSnackbarContentClassesMod.SnackbarContentClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `120`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSnackbarContentPropsAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SnackbarContentClassKey, "MuiSnackbarContent", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSnackbarContentPropsAbout]] = js.undefined
}
object `120` {
  
  inline def apply[Theme](): `120`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`120`[Theme]]
  }
  
  extension [Self <: `120`[?], Theme](x: Self & `120`[Theme]) {
    
    inline def setDefaultProps(value: PartialSnackbarContentPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[SnackbarContentClassKey, "MuiSnackbarContent", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSnackbarContentPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSnackbarContentPropsAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
