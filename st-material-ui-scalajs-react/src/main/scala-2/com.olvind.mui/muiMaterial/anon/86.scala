package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `86` extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputAdornmentPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesInputAdornment] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialInputAdornmentPropsdiv]] = js.native
}
object `86` {
  
  @scala.inline
  def apply(): `86` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`86`]
  }
  
  @scala.inline
  implicit class `86MutableBuilder`[Self <: `86`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialInputAdornmentPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesInputAdornment): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialInputAdornmentPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialInputAdornmentPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
