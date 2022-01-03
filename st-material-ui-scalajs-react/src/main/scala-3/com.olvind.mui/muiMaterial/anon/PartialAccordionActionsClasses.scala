package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/AccordionActions/accordionActionsClasses.AccordionActionsClasses> */
trait PartialAccordionActionsClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var spacing: js.UndefOr[String] = js.undefined
}
object PartialAccordionActionsClasses {
  
  inline def apply(): PartialAccordionActionsClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAccordionActionsClasses]
  }
  
  extension [Self <: PartialAccordionActionsClasses](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
