package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `87` extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputBaseProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesInputBaseClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialInputBaseProps]] = js.native
}
object `87` {
  
  @scala.inline
  def apply(): `87` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`87`]
  }
  
  @scala.inline
  implicit class `87MutableBuilder`[Self <: `87`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialInputBaseProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesInputBaseClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialInputBaseProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialInputBaseProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
