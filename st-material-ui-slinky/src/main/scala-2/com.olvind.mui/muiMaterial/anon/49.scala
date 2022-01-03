package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `49` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardActionAreaPropsbutton] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardActionArea] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCardActionAreaPropsbutton]] = js.native
}
object `49` {
  
  @scala.inline
  def apply(): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit class `49MutableBuilder`[Self <: `49`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCardActionAreaPropsbutton): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCardActionArea): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCardActionAreaPropsbutton]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCardActionAreaPropsbutton*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
