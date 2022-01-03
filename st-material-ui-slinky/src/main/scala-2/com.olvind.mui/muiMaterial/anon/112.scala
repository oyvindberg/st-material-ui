package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `112` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSelectPropsunknownAbout] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSelectClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSelectPropsunknownAbout]] = js.native
}
object `112` {
  
  @scala.inline
  def apply(): `112` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`112`]
  }
  
  @scala.inline
  implicit class `112MutableBuilder`[Self <: `112`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSelectPropsunknownAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSelectClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSelectPropsunknownAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSelectPropsunknownAbout*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
