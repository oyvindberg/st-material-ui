package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.cardActionAreaCardActionAreaClassesMod.CardActionAreaClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `51`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardActionAreaPropsbutton] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[CardActionAreaClassKey, "MuiCardActionArea", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCardActionAreaPropsbutton]] = js.undefined
}
object `51` {
  
  inline def apply[Theme](): `51`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`51`[Theme]]
  }
  
  extension [Self <: `51`[?], Theme](x: Self & `51`[Theme]) {
    
    inline def setDefaultProps(value: PartialCardActionAreaPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(
      value: com.olvind.mui.std.Partial[OverridesStyleRules[CardActionAreaClassKey, "MuiCardActionArea", Theme]]
    ): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCardActionAreaPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCardActionAreaPropsbutton*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
