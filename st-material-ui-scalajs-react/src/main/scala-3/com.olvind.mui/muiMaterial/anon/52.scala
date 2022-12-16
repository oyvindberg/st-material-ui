package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.cardActionsCardActionsClassesMod.CardActionsClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardActionsProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CardActionsClassKey, "MuiCardActions", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardActionsProps]] = js.undefined
}
object `52` {
  
  inline def apply[Theme](): `52`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`52`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `52`[?], Theme] (val x: Self & `52`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCardActionsProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[CardActionsClassKey, "MuiCardActions", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardActionsProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardActionsProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
