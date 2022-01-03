package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `143` extends StObject {
  
  var defaultProps: js.UndefOr[PartialToolbarPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesToolbarClassKe] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialToolbarPropsdiv]] = js.native
}
object `143` {
  
  @scala.inline
  def apply(): `143` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`143`]
  }
  
  @scala.inline
  implicit class `143MutableBuilder`[Self <: `143`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialToolbarPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesToolbarClassKe): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialToolbarPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialToolbarPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
