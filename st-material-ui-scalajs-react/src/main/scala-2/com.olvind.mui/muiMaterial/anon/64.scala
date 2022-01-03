package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `64` extends StObject {
  
  var defaultProps: js.UndefOr[PartialDialogTitleProps] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesDialogTitleCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialDialogTitleProps]] = js.native
}
object `64` {
  
  @scala.inline
  def apply(): `64` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit class `64MutableBuilder`[Self <: `64`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialDialogTitleProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesDialogTitleCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialDialogTitleProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialDialogTitleProps*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
