package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.typographyTypographyClassesMod.TypographyClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `151`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTypographyPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TypographyClassKey, "MuiTypography", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTypographyPropsspan]] = js.undefined
}
object `151` {
  
  inline def apply[Theme](): `151`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`151`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `151`[?], Theme] (val x: Self & `151`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTypographyPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TypographyClassKey, "MuiTypography", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTypographyPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTypographyPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
