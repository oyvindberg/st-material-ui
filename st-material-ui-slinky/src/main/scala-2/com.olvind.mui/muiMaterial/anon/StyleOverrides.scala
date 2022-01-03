package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleOverrides extends StObject {
  
  var defaultProps: js.UndefOr[PartialAlertProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAlertClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsStyle]] = js.native
}
object StyleOverrides {
  
  @scala.inline
  def apply(): StyleOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleOverrides]
  }
  
  @scala.inline
  implicit class StyleOverridesMutableBuilder[Self <: StyleOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAlertProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAlertClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsStyle]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsStyle*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
