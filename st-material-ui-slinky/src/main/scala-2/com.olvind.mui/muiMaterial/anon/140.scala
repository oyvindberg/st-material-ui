package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiMaterial.textFieldTextFieldMod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `140` extends StObject {
  
  var defaultProps: js.UndefOr[com.olvind.mui.std.Partial[TextFieldProps]] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTextFieldClass] = js.native
  
  var variants: js.UndefOr[js.Array[StyleInterpolation]] = js.native
}
object `140` {
  
  @scala.inline
  def apply(): `140` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`140`]
  }
  
  @scala.inline
  implicit class `140MutableBuilder`[Self <: `140`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: com.olvind.mui.std.Partial[TextFieldProps]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTextFieldClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[StyleInterpolation]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: StyleInterpolation*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
