package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.buttonBaseButtonBaseClassesMod.ButtonBaseClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `48`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonBasePropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ButtonBaseClassKey, "MuiButtonBase", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonBasePropsbutton]] = js.undefined
}
object `48` {
  
  inline def apply[Theme](): `48`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`48`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `48`[?], Theme] (val x: Self & `48`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialButtonBasePropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ButtonBaseClassKey, "MuiButtonBase", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialButtonBasePropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialButtonBasePropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
