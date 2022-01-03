package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `117` extends StObject {
  
  var defaultProps: js.UndefOr[PartialSpeedDialProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesSpeedDialClass] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialSpeedDialProps]] = js.native
}
object `117` {
  
  @scala.inline
  def apply(): `117` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`117`]
  }
  
  @scala.inline
  implicit class `117MutableBuilder`[Self <: `117`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialSpeedDialProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesSpeedDialClass): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialSpeedDialProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialSpeedDialProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
