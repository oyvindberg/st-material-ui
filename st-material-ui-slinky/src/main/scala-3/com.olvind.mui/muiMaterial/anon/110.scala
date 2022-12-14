package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.paperPaperClassesMod.PaperClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `110`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaperPropsdiv] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[PaperClassKey, "MuiPaper", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialPaperPropsdiv]] = js.undefined
}
object `110` {
  
  inline def apply[Theme](): `110`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`110`[Theme]]
  }
  
  extension [Self <: `110`[?], Theme](x: Self & `110`[Theme]) {
    
    inline def setDefaultProps(value: PartialPaperPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[PaperClassKey, "MuiPaper", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialPaperPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialPaperPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
