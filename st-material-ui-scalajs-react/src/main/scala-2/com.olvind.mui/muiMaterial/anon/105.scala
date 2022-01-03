package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `105` extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaginationProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesPaginationClas] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialPaginationProps]] = js.native
}
object `105` {
  
  @scala.inline
  def apply(): `105` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`105`]
  }
  
  @scala.inline
  implicit class `105MutableBuilder`[Self <: `105`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialPaginationProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesPaginationClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialPaginationProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialPaginationProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
