package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.dialogTitleDialogTitleClassesMod.DialogTitleClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogTitlePropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DialogTitleClassKey, "MuiDialogTitle", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogTitlePropsspan]] = js.undefined
}
object `66` {
  
  inline def apply[Theme](): `66`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`66`[Theme]]
  }
  
  extension [Self <: `66`[?], Theme](x: Self & `66`[Theme]) {
    
    inline def setDefaultProps(value: PartialDialogTitlePropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[DialogTitleClassKey, "MuiDialogTitle", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogTitlePropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogTitlePropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
