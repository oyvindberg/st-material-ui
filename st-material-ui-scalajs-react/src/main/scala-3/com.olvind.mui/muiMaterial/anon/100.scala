package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.listItemTextListItemTextClassesMod.ListItemTextClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemTextPropsspanp] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[ListItemTextClassKey, "MuiListItemText", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemTextPropsspanp]] = js.undefined
}
object `100` {
  
  inline def apply[Theme](): `100`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`100`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `100`[?], Theme] (val x: Self & `100`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialListItemTextPropsspanp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[ListItemTextClassKey, "MuiListItemText", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialListItemTextPropsspanp]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialListItemTextPropsspanp*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
