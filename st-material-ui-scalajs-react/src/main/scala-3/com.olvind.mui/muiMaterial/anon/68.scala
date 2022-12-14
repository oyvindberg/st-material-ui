package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.drawerDrawerClassesMod.DrawerClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `68`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDrawerProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DrawerClassKey, "MuiDrawer", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDrawerProps]] = js.undefined
}
object `68` {
  
  inline def apply[Theme](): `68`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`68`[Theme]]
  }
  
  extension [Self <: `68`[?], Theme](x: Self & `68`[Theme]) {
    
    inline def setDefaultProps(value: PartialDrawerProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[DrawerClassKey, "MuiDrawer", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDrawerProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDrawerProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
