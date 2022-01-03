package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `42` extends StObject {
  
  var defaultProps: js.UndefOr[PartialBottomNavigationPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesBottomNavigati] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialBottomNavigationPropsdiv]] = js.native
}
object `42` {
  
  @scala.inline
  def apply(): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit class `42MutableBuilder`[Self <: `42`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialBottomNavigationPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesBottomNavigati): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialBottomNavigationPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialBottomNavigationPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
