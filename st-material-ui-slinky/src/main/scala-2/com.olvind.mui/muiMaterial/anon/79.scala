package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `79` extends StObject {
  
  var defaultProps: js.UndefOr[PartialGridPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesGridClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialGridPropsdiv]] = js.native
}
object `79` {
  
  @scala.inline
  def apply(): `79` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`79`]
  }
  
  @scala.inline
  implicit class `79MutableBuilder`[Self <: `79`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialGridPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesGridClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialGridPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialGridPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
