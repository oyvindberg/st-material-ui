package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `43` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBottomNavigationActionPropsbutton] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesBottomNavigatiIconOnly] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialBottomNavigationActionPropsbutton]] = js.native
}
object `43` {
  
  @scala.inline
  def apply(): `43` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit class `43MutableBuilder`[Self <: `43`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialBottomNavigationActionPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesBottomNavigatiIconOnly): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialBottomNavigationActionPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialBottomNavigationActionPropsbutton*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
