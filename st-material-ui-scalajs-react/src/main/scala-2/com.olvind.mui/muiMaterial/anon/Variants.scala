package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Variants extends StObject {
  
  var defaultProps: js.UndefOr[PartialAlertTitleProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAlertTitleClas] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAlertTitleProps]] = js.native
}
object Variants {
  
  @scala.inline
  def apply(): Variants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variants]
  }
  
  @scala.inline
  implicit class VariantsMutableBuilder[Self <: Variants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAlertTitleProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAlertTitleClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAlertTitleProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAlertTitleProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
