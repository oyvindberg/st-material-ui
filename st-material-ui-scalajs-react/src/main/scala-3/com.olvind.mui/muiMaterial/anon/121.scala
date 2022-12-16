package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.speedDialSpeedDialClassesMod.SpeedDialClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `121`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SpeedDialClassKey, "MuiSpeedDial", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialProps]] = js.undefined
}
object `121` {
  
  inline def apply[Theme](): `121`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`121`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `121`[?], Theme] (val x: Self & `121`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialSpeedDialProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SpeedDialClassKey, "MuiSpeedDial", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSpeedDialProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSpeedDialProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
