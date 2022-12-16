package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.dialogDialogClassesMod.DialogClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `62`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[DialogClassKey, "MuiDialog", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogProps]] = js.undefined
}
object `62` {
  
  inline def apply[Theme](): `62`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`62`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `62`[?], Theme] (val x: Self & `62`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialDialogProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[DialogClassKey, "MuiDialog", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialDialogProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialDialogProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
