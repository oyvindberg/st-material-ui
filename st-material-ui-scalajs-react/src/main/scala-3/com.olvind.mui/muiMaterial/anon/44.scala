package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.bottomNavigationBottomNavigationClassesMod.BottomNavigationClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBottomNavigationPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[BottomNavigationClassKey, "MuiBottomNavigation", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBottomNavigationPropsdiv]] = js.undefined
}
object `44` {
  
  inline def apply[Theme](): `44`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`44`[Theme]]
  }
  
  extension [Self <: `44`[?], Theme](x: Self & `44`[Theme]) {
    
    inline def setDefaultProps(value: PartialBottomNavigationPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[BottomNavigationClassKey, "MuiBottomNavigation", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBottomNavigationPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBottomNavigationPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
