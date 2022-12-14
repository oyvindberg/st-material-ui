package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.skeletonSkeletonClassesMod.SkeletonClassKey
import com.olvind.mui.muiMaterial.stylesOverridesMod.OverridesStyleRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `117`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialSkeletonPropsspan] = js.undefined
  
  var styleOverrides: js.UndefOr[
    com.olvind.mui.std.Partial[OverridesStyleRules[SkeletonClassKey, "MuiSkeleton", Theme]]
  ] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSkeletonPropsspan]] = js.undefined
}
object `117` {
  
  inline def apply[Theme](): `117`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`117`[Theme]]
  }
  
  extension [Self <: `117`[?], Theme](x: Self & `117`[Theme]) {
    
    inline def setDefaultProps(value: PartialSkeletonPropsspan): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: com.olvind.mui.std.Partial[OverridesStyleRules[SkeletonClassKey, "MuiSkeleton", Theme]]): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSkeletonPropsspan]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSkeletonPropsspan*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
