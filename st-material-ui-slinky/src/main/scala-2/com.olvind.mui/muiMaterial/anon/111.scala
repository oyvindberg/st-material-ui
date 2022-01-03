package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `111` extends StObject {
  
  var defaultProps: js.UndefOr[PartialScopedCssBaselinePropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesScopedCssBasel] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialScopedCssBaselinePropsdiv]] = js.native
}
object `111` {
  
  @scala.inline
  def apply(): `111` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`111`]
  }
  
  @scala.inline
  implicit class `111MutableBuilder`[Self <: `111`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialScopedCssBaselinePropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesScopedCssBasel): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialScopedCssBaselinePropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialScopedCssBaselinePropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
