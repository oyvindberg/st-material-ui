package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `137` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableRowPropstr] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableRowClassK] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTableRowPropstr]] = js.native
}
object `137` {
  
  @scala.inline
  def apply(): `137` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`137`]
  }
  
  @scala.inline
  implicit class `137MutableBuilder`[Self <: `137`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTableRowPropstr): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTableRowClassK): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTableRowPropstr]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTableRowPropstr*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
