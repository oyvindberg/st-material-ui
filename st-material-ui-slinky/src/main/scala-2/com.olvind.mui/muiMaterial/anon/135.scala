package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `135` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableHeadPropsthead] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableHeadClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTableHeadPropsthead]] = js.native
}
object `135` {
  
  @scala.inline
  def apply(): `135` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`135`]
  }
  
  @scala.inline
  implicit class `135MutableBuilder`[Self <: `135`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTableHeadPropsthead): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTableHeadClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTableHeadPropsthead]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTableHeadPropsthead*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
