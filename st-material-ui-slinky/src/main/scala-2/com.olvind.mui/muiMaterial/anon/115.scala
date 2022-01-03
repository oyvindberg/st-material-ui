package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `115` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSnackbarProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSnackbarClassK] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSnackbarProps]] = js.native
}
object `115` {
  
  @scala.inline
  def apply(): `115` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`115`]
  }
  
  @scala.inline
  implicit class `115MutableBuilder`[Self <: `115`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSnackbarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSnackbarClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSnackbarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSnackbarProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
