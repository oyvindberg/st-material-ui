package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.appBarAppBarClassesMod.AppBarClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropsStyleOverrides[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialAppBarPropsheader] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[AppBarClassKey, "MuiAppBar", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAppBarPropsheader]] = js.undefined
}
object DefaultPropsStyleOverrides {
  
  inline def apply[Theme](): DefaultPropsStyleOverrides[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsStyleOverrides[Theme]]
  }
  
  extension [Self <: DefaultPropsStyleOverrides[?], Theme](x: Self & DefaultPropsStyleOverrides[Theme]) {
    
    inline def setDefaultProps(value: PartialAppBarPropsheader): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[AppBarClassKey, "MuiAppBar", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAppBarPropsheader]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAppBarPropsheader*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
