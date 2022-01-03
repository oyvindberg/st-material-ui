package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `62` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogContentProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogContentC] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogContentProps]] = js.native
}
object `62` {
  
  @scala.inline
  def apply(): `62` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`62`]
  }
  
  @scala.inline
  implicit class `62MutableBuilder`[Self <: `62`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDialogContentProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDialogContentC): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDialogContentProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDialogContentProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
