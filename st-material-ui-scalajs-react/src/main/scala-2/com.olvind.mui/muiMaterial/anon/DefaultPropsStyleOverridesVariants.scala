package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPropsStyleOverridesVariants extends StObject {
  
  var defaultProps: js.UndefOr[PartialAvatarPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAvatarClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialAvatarPropsdiv]] = js.native
}
object DefaultPropsStyleOverridesVariants {
  
  @scala.inline
  def apply(): DefaultPropsStyleOverridesVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsStyleOverridesVariants]
  }
  
  @scala.inline
  implicit class DefaultPropsStyleOverridesVariantsMutableBuilder[Self <: DefaultPropsStyleOverridesVariants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialAvatarPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesAvatarClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialAvatarPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialAvatarPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
