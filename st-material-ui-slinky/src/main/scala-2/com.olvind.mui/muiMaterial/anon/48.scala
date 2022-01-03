package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `48` extends StObject {
  
  var defaultProps: js.UndefOr[PartialCardPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesCardClassKey] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialCardPropsdiv]] = js.native
}
object `48` {
  
  @scala.inline
  def apply(): `48` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`48`]
  }
  
  @scala.inline
  implicit class `48MutableBuilder`[Self <: `48`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialCardPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesCardClassKey): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialCardPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialCardPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
