package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import com.olvind.mui.muiStyledEngine.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61`[Theme] extends StObject {
  
  var defaultProps: js.UndefOr[PartialCssBaselineProps] = js.undefined
  
  var styleOverrides: js.UndefOr[CSSObject | String | (js.Function1[/* theme */ Theme, CSSInterpolation])] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialCssBaselineProps]] = js.undefined
}
object `61` {
  
  inline def apply[Theme](): `61`[Theme] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`61`[Theme]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `61`[?], Theme] (val x: Self & `61`[Theme]) extends AnyVal {
    
    inline def setDefaultProps(value: PartialCssBaselineProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: CSSObject | String | (js.Function1[/* theme */ Theme, CSSInterpolation])): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesFunction1(value: /* theme */ Theme => CSSInterpolation): Self = StObject.set(x, "styleOverrides", js.Any.fromFunction1(value))
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialCssBaselineProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialCssBaselineProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
