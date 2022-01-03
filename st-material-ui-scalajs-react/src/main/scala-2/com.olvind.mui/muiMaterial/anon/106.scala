package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `106` extends StObject {
  
  var defaultProps: js.UndefOr[PartialPaginationItemPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesPaginationItem] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialPaginationItemPropsdiv]] = js.native
}
object `106` {
  
  @scala.inline
  def apply(): `106` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`106`]
  }
  
  @scala.inline
  implicit class `106MutableBuilder`[Self <: `106`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialPaginationItemPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesPaginationItem): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialPaginationItemPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialPaginationItemPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
