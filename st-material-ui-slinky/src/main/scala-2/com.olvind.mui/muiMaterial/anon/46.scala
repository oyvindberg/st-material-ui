package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `46` extends StObject {
  
  var defaultProps: js.UndefOr[PartialButtonBasePropsbutton] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesButtonBaseClas] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialButtonBasePropsbutton]] = js.native
}
object `46` {
  
  @scala.inline
  def apply(): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialButtonBasePropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesButtonBaseClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialButtonBasePropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialButtonBasePropsbutton*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
