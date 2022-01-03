package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `60` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogProps]] = js.native
}
object `60` {
  
  @scala.inline
  def apply(): `60` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`60`]
  }
  
  @scala.inline
  implicit class `60MutableBuilder`[Self <: `60`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDialogProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDialogClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDialogProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDialogProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
