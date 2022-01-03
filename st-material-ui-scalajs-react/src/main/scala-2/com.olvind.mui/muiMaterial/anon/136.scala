package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `136` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTablePaginationPropsJSXElementCon] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTablePaginatio] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTablePaginationPropsJSXElementCon]] = js.native
}
object `136` {
  
  @scala.inline
  def apply(): `136` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`136`]
  }
  
  @scala.inline
  implicit class `136MutableBuilder`[Self <: `136`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTablePaginationPropsJSXElementCon): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTablePaginatio): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTablePaginationPropsJSXElementCon]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTablePaginationPropsJSXElementCon*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
