package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listSubheaderListSubheaderClassesMod.ListSubheaderClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `101`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListSubheaderPropsli] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ListSubheaderClassKey, "MuiListSubheader", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListSubheaderPropsli]] = js.undefined
}
object `101` {
  
  inline def apply[Theme](): `101`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`101`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `101`[?], Theme] (val x: Self & `101`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListSubheaderPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ListSubheaderClassKey, "MuiListSubheader", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListSubheaderPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListSubheaderPropsli*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
