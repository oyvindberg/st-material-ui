package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.menuMenuClassesMod.MenuClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `102`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuPropsAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[com.olvind.mui.std.Partial[OverridesStyleRules[MenuClassKey, "MuiMenu", Theme]]] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialMenuPropsAbout]] = js.undefined
}
object `102` {
  
  inline def apply[Theme](): `102`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`102`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `102`[?], Theme] (val x: Self & `102`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialMenuPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[MenuClassKey, "MuiMenu", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialMenuPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialMenuPropsAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
