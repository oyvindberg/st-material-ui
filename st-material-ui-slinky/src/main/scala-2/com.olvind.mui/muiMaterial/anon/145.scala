package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `145` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTouchRippleProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTouchRippleCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTouchRippleProps]] = js.native
}
object `145` {
  
  @scala.inline
  def apply(): `145` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit class `145MutableBuilder`[Self <: `145`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTouchRippleProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTouchRippleCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTouchRippleProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTouchRippleProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
