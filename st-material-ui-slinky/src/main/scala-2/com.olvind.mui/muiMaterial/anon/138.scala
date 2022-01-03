package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `138` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableSortLabelPropsdefaultCompone] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableSortLabel] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTableSortLabelPropsdefaultCompone]] = js.native
}
object `138` {
  
  @scala.inline
  def apply(): `138` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`138`]
  }
  
  @scala.inline
  implicit class `138MutableBuilder`[Self <: `138`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTableSortLabelPropsdefaultCompone): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTableSortLabel): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTableSortLabelPropsdefaultCompone]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTableSortLabelPropsdefaultCompone*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
