package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.ratingRatingClassesMod.RatingClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `114`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialRatingProps] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[RatingClassKey, "MuiRating", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialRatingProps]] = js.undefined
}
object `114` {
  
  inline def apply[Theme](): `114`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`114`[Theme]]
  }
  
  extension [Self <: `114`[?], Theme](x: Self & `114`[Theme]) {
    
    inline def setDefaultProps(value: PartialRatingProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[RatingClassKey, "MuiRating", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialRatingProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialRatingProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
