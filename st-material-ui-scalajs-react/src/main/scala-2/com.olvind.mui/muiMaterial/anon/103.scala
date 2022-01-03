package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `103` extends StObject {
  
  var defaultProps: js.UndefOr[PartialNativeSelectProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesNativeSelectCl] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialNativeSelectProps]] = js.native
}
object `103` {
  
  @scala.inline
  def apply(): `103` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`103`]
  }
  
  @scala.inline
  implicit class `103MutableBuilder`[Self <: `103`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialNativeSelectProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesNativeSelectCl): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialNativeSelectProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialNativeSelectProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
