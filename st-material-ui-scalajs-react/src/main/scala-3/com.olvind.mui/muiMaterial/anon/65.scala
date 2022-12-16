package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.dialogContentTextDialogContentTextClassesMod.DialogContentTextClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `65`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogContentTextPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DialogContentTextClassKey, "MuiDialogContentText", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogContentTextPropsspan]] = js.undefined
}
object `65` {
  
  inline def apply[Theme](): `65`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`65`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `65`[?], Theme] (val x: Self & `65`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialDialogContentTextPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[DialogContentTextClassKey, "MuiDialogContentText", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogContentTextPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogContentTextPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
