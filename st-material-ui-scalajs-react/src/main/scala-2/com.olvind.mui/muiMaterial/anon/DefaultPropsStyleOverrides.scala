package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPropsStyleOverrides extends StObject {
  
  var defaultProps: js.UndefOr[PartialAppBarPropsheader] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAppBarClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAppBarPropsheader]] = js.native
}
object DefaultPropsStyleOverrides {
  
  @scala.inline
  def apply(): DefaultPropsStyleOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsStyleOverrides]
  }
  
  @scala.inline
  implicit class DefaultPropsStyleOverridesMutableBuilder[Self <: DefaultPropsStyleOverrides] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAppBarPropsheader): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAppBarClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAppBarPropsheader]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAppBarPropsheader*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
