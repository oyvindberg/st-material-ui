package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.popoverPopoverClassesMod.PopoverClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `112`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialPopoverProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[PopoverClassKey, "MuiPopover", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPopoverProps]] = js.undefined
}
object `112` {
  
  inline def apply[Theme](): `112`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`112`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `112`[?], Theme] (val x: Self & `112`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialPopoverProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[PopoverClassKey, "MuiPopover", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPopoverProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPopoverProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
