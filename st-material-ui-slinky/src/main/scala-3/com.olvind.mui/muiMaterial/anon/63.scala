package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.dialogActionsDialogActionsClassesMod.DialogActionsClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `63`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogActionsProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DialogActionsClassKey, "MuiDialogActions", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogActionsProps]] = js.undefined
}
object `63` {
  
  inline def apply[Theme](): `63`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`63`[Theme]]
  }
  
  extension [Self <: `63`[?], Theme](x: Self & `63`[Theme]) {
    
    inline def setDefaultProps(value: PartialDialogActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[DialogActionsClassKey, "MuiDialogActions", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogActionsProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
