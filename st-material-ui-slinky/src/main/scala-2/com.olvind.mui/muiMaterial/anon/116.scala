package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `116` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSnackbarContentPropsAbout] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSnackbarConten] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSnackbarContentPropsAbout]] = js.native
}
object `116` {
  
  @scala.inline
  def apply(): `116` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`116`]
  }
  
  @scala.inline
  implicit class `116MutableBuilder`[Self <: `116`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSnackbarContentPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSnackbarConten): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSnackbarContentPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSnackbarContentPropsAbout*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
