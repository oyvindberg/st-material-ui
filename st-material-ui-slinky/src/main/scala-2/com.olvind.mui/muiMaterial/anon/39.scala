package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `39` extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarGroupProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAvatarGroupCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAvatarGroupProps]] = js.native
}
object `39` {
  
  @scala.inline
  def apply(): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit class `39MutableBuilder`[Self <: `39`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAvatarGroupProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAvatarGroupCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAvatarGroupProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAvatarGroupProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
