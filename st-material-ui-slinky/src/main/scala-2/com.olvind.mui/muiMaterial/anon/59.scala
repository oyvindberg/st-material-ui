package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `59` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCssBaselineProps] = js.native
  
  var styleOverrides: js.UndefOr[CSSObject | String] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCssBaselineProps]] = js.native
}
object `59` {
  
  @scala.inline
  def apply(): `59` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`59`]
  }
  
  @scala.inline
  implicit class `59MutableBuilder`[Self <: `59`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCssBaselineProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: CSSObject | String): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCssBaselineProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCssBaselineProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
