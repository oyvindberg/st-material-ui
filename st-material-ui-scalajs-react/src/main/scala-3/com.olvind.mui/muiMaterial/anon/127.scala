package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `127` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSvgIconPropssvg] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSvgIconClassKe] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialSvgIconPropssvg]] = js.undefined
}
object `127` {
  
  inline def apply(): `127` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`127`]
  }
  
  extension [Self <: `127`](x: Self) {
    
    inline def setDefaultProps(value: PartialSvgIconPropssvg): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesSvgIconClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialSvgIconPropssvg]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialSvgIconPropssvg*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
