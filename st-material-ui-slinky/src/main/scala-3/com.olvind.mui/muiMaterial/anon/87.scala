package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.iconButtonIconButtonClassesMod.IconButtonClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `87`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialIconButtonPropsdefaultComponent] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[IconButtonClassKey, "MuiIconButton", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialIconButtonPropsdefaultComponent]] = js.undefined
}
object `87` {
  
  inline def apply[Theme](): `87`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`87`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `87`[?], Theme] (val x: Self & `87`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialIconButtonPropsdefaultComponent): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[IconButtonClassKey, "MuiIconButton", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialIconButtonPropsdefaultComponent]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialIconButtonPropsdefaultComponent*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
