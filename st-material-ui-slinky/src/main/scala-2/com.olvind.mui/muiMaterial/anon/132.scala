package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `132` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableCellProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableCellClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTableCellProps]] = js.native
}
object `132` {
  
  @scala.inline
  def apply(): `132` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`132`]
  }
  
  @scala.inline
  implicit class `132MutableBuilder`[Self <: `132`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTableCellProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTableCellClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTableCellProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTableCellProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
