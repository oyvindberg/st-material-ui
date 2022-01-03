package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `80` extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListPropsul] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesImageListClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListPropsul]] = js.native
}
object `80` {
  
  @scala.inline
  def apply(): `80` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`80`]
  }
  
  @scala.inline
  implicit class `80MutableBuilder`[Self <: `80`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialImageListPropsul): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesImageListClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialImageListPropsul]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialImageListPropsul*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
