package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemButtonListItemButtonClassesMod.ListItemButtonClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `96`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemButtonPropsdefaultCompone] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ListItemButtonClassKey, "MuiListItemButton", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemButtonPropsdefaultCompone]] = js.undefined
}
object `96` {
  
  inline def apply[Theme](): `96`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`96`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `96`[?], Theme] (val x: Self & `96`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListItemButtonPropsdefaultCompone): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ListItemButtonClassKey, "MuiListItemButton", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemButtonPropsdefaultCompone]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemButtonPropsdefaultCompone*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
