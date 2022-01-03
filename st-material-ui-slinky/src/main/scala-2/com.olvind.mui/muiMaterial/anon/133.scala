package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `133` extends StObject {
  
  var defaultProps: js.UndefOr[PartialTableContainerPropsdiv] = js.native
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesTableContainer] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialTableContainerPropsdiv]] = js.native
}
object `133` {
  
  @scala.inline
  def apply(): `133` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`133`]
  }
  
  @scala.inline
  implicit class `133MutableBuilder`[Self <: `133`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialTableContainerPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setStyleOverrides(value: PartialOverridesStyleRulesTableContainer): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialTableContainerPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialTableContainerPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
