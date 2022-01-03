package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `66` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDrawerProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDrawerClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDrawerProps]] = js.native
}
object `66` {
  
  @scala.inline
  def apply(): `66` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`66`]
  }
  
  @scala.inline
  implicit class `66MutableBuilder`[Self <: `66`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDrawerProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDrawerClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDrawerProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDrawerProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
