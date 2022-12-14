package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.speedDialActionSpeedDialActionClassesMod.SpeedDialActionClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `122`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialActionProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SpeedDialActionClassKey, "MuiSpeedDialAction", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialActionProps]] = js.undefined
}
object `122` {
  
  inline def apply[Theme](): `122`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`122`[Theme]]
  }
  
  extension [Self <: `122`[?], Theme](x: Self & `122`[Theme]) {
    
    inline def setDefaultProps(value: PartialSpeedDialActionProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[SpeedDialActionClassKey, "MuiSpeedDialAction", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSpeedDialActionProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSpeedDialActionProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
