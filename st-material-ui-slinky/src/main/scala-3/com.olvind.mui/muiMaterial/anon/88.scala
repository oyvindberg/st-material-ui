package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var defaultProps: js.UndefOr[PartialInputLabelPropsAbout] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesInputLabelClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialInputLabelPropsAbout]] = js.undefined
}
object `88` {
  
  inline def apply(): `88` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`88`]
  }
  
  extension [Self <: `88`](x: Self) {
    
    inline def setDefaultProps(value: PartialInputLabelPropsAbout): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesInputLabelClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialInputLabelPropsAbout]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialInputLabelPropsAbout*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
