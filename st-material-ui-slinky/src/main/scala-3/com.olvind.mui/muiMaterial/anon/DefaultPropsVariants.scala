package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropsVariants extends StObject {
  
  var defaultProps: js.UndefOr[PartialStackPropsdiv] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialStackPropsdiv]] = js.undefined
}
object DefaultPropsVariants {
  
  inline def apply(): DefaultPropsVariants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPropsVariants]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultPropsVariants] (val x: Self) extends AnyVal {
    
    inline def setDefaultProps(value: PartialStackPropsdiv): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialStackPropsdiv]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialStackPropsdiv*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
