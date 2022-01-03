package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCssBaselineProps] = js.undefined
  
  var styleOverrides: js.UndefOr[CSSObject | String] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCssBaselineProps]] = js.undefined
}
object `59` {
  
  inline def apply(): `59` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`59`]
  }
  
  extension [Self <: `59`](x: Self) {
    
    inline def setDefaultProps(value: PartialCssBaselineProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: CSSObject | String): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCssBaselineProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCssBaselineProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
