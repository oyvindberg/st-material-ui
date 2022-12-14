package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.bottomNavigationActionBottomNavigationActionClassesMod.BottomNavigationActionClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialBottomNavigationActionPropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[
      OverridesStyleRules[BottomNavigationActionClassKey, "MuiBottomNavigationAction", Theme]
    ]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialBottomNavigationActionPropsbutton]] = js.undefined
}
object `45` {
  
  inline def apply[Theme](): `45`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`45`[Theme]]
  }
  
  extension [Self <: `45`[?], Theme](x: Self & `45`[Theme]) {
    
    inline def setDefaultProps(value: PartialBottomNavigationActionPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[
          OverridesStyleRules[BottomNavigationActionClassKey, "MuiBottomNavigationAction", Theme]
        ]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialBottomNavigationActionPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialBottomNavigationActionPropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}