package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `57` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCollapseProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCollapseClassK] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCollapseProps]] = js.native
}
object `57` {
  
  @scala.inline
  def apply(): `57` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit class `57MutableBuilder`[Self <: `57`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCollapseProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCollapseClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCollapseProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCollapseProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
