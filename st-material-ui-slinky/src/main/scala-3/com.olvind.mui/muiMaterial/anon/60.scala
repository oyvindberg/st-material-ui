package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import com.olvind.mui.muiSystem.containerContainerClassesMod.ContainerClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialContainerPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ContainerClassKey, "MuiContainer", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialContainerPropsdiv]] = js.undefined
}
object `60` {
  
  inline def apply[Theme](): `60`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`60`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `60`[?], Theme] (val x: Self & `60`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialContainerPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[ContainerClassKey, "MuiContainer", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialContainerPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialContainerPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
