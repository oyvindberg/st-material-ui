package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `99` extends StObject {
  
  var defaultProps: js.UndefOr[PartialMenuPropsAbout] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesMenuClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialMenuPropsAbout]] = js.native
}
object `99` {
  
  @scala.inline
  def apply(): `99` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`99`]
  }
  
  @scala.inline
  implicit class `99MutableBuilder`[Self <: `99`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialMenuPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesMenuClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialMenuPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialMenuPropsAbout*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
