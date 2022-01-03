package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `82` extends StObject {
  
  var defaultProps: js.UndefOr[PartialImageListItemBarProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesImageListItemB] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialImageListItemBarProps]] = js.native
}
object `82` {
  
  @scala.inline
  def apply(): `82` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`82`]
  }
  
  @scala.inline
  implicit class `82MutableBuilder`[Self <: `82`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialImageListItemBarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesImageListItemB): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialImageListItemBarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialImageListItemBarProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
