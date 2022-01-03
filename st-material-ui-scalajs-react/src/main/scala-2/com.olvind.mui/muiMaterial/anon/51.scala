package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `51` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardContentPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardContentCla] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCardContentPropsdiv]] = js.native
}
object `51` {
  
  @scala.inline
  def apply(): `51` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`51`]
  }
  
  @scala.inline
  implicit class `51MutableBuilder`[Self <: `51`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCardContentPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCardContentCla): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCardContentPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCardContentPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
