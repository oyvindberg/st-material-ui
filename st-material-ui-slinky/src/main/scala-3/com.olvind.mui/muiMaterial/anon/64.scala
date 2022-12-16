package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.dialogContentDialogContentClassesMod.DialogContentClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogContentProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DialogContentClassKey, "MuiDialogContent", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogContentProps]] = js.undefined
}
object `64` {
  
  inline def apply[Theme](): `64`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`64`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `64`[?], Theme] (val x: Self & `64`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialDialogContentProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[DialogContentClassKey, "MuiDialogContent", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogContentProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogContentProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
