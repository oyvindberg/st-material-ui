package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultPropsVariants extends StObject {
  
  var defaultProps: js.UndefOr[PartialStackPropsdiv] = js.native
  
  var variants: js.UndefOr[js.Array[PropsPartialStackPropsdiv]] = js.native
}
object DefaultPropsVariants {
  
  @scala.inline
  def apply(): DefaultPropsVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsVariants]
  }
  
  @scala.inline
  implicit class DefaultPropsVariantsMutableBuilder[Self <: DefaultPropsVariants] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultProps(value: PartialStackPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    @scala.inline
    def setVariants(value: js.Array[PropsPartialStackPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    @scala.inline
    def setVariantsVarargs(value: PropsPartialStackPropsdiv*): Self = StObject.set(x, "variants", js.Array(value :_*))
  }
}
