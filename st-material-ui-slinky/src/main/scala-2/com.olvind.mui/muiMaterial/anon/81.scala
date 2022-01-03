package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `81` extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListItemPropsli] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesImageListItemC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListItemPropsli]] = js.native
}
object `81` {
  
  @scala.inline
  def apply(): `81` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`81`]
  }
  
  @scala.inline
  implicit class `81MutableBuilder`[Self <: `81`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialImageListItemPropsli): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesImageListItemC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialImageListItemPropsli]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialImageListItemPropsli*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
