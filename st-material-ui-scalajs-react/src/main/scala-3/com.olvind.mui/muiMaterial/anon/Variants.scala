package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variants extends StObject {
  
  var defaultProps: js.UndefOr[PartialAlertTitleProps] = js.undefined
  
  var styleOverrides: js.UndefOr[PartialOverridesStyleRulesAlertTitleClas] = js.undefined
  
  var variants: js.UndefOr[js.Array[PropsPartialAlertTitleProps]] = js.undefined
}
object Variants {
  
  inline def apply(): Variants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Variants]
  }
  
  extension [Self <: Variants](x: Self) {
    
    inline def setDefaultProps(value: PartialAlertTitleProps): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setStyleOverrides(value: PartialOverridesStyleRulesAlertTitleClas): Self = StObject.set(x, "styleOverrides", value.asInstanceOf[js.Any])
    
    inline def setStyleOverridesUndefined: Self = StObject.set(x, "styleOverrides", js.undefined)
    
    inline def setVariants(value: js.Array[PropsPartialAlertTitleProps]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: PropsPartialAlertTitleProps*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
