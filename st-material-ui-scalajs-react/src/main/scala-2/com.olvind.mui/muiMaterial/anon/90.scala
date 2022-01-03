package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `90` extends StObject {
  
  var defaultProps: js.UndefOr[PartialLinkPropsa] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesLinkClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialLinkPropsa]] = js.native
}
object `90` {
  
  @scala.inline
  def apply(): `90` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`90`]
  }
  
  @scala.inline
  implicit class `90MutableBuilder`[Self <: `90`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialLinkPropsa): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesLinkClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialLinkPropsa]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialLinkPropsa*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
