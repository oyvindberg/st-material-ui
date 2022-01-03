package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `94` extends StObject {
  
  var defaultProps: js.UndefOr[PartialListItemAvatarProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesListItemAvatar] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialListItemAvatarProps]] = js.native
}
object `94` {
  
  @scala.inline
  def apply(): `94` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`94`]
  }
  
  @scala.inline
  implicit class `94MutableBuilder`[Self <: `94`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialListItemAvatarProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesListItemAvatar): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialListItemAvatarProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialListItemAvatarProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
