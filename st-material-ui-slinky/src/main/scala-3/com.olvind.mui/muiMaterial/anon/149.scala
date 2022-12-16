package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiMaterial.tooltipTooltipClassesMod.TooltipClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialTooltipProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[TooltipClassKey, "MuiTooltip", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialTooltipProps]] = js.undefined
}
object `149` {
  
  inline def apply[Theme](): `149`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`149`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `149`[?], Theme] (val x: Self & `149`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialTooltipProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[TooltipClassKey, "MuiTooltip", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialTooltipProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialTooltipProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
