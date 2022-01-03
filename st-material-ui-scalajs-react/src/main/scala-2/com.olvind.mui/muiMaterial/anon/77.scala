package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `77` extends StObject {
  
  var defaultProps: js.UndefOr[PartialFormHelperTextPropsp] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesFormHelperText] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialFormHelperTextPropsp]] = js.native
}
object `77` {
  
  @scala.inline
  def apply(): `77` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`77`]
  }
  
  @scala.inline
  implicit class `77MutableBuilder`[Self <: `77`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialFormHelperTextPropsp): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesFormHelperText): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialFormHelperTextPropsp]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialFormHelperTextPropsp*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
