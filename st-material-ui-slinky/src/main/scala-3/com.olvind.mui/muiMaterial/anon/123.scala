package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.speedDialIconSpeedDialIconClassesMod.SpeedDialIconClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `123`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialIconProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SpeedDialIconClassKey, "MuiSpeedDialIcon", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialIconProps]] = js.undefined
}
object `123` {
  
  inline def apply[Theme](): `123`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`123`[Theme]]
  }
  
  extension [Self <: `123`[?], Theme](x: Self & `123`[Theme]) {
    
    inline def setDefaultProps(value: PartialSpeedDialIconProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[SpeedDialIconClassKey, "MuiSpeedDialIcon", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSpeedDialIconProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSpeedDialIconProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
