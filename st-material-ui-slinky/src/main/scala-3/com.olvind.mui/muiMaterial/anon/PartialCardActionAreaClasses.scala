package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CardActionArea/cardActionAreaClasses.CardActionAreaClasses> */
trait PartialCardActionAreaClasses extends StObject {
  
  var focusHighlight: js.UndefOr[String] = js.undefined
  
  var focusVisible: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialCardActionAreaClasses {
  
  inline def apply(): PartialCardActionAreaClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardActionAreaClasses]
  }
  
  extension [Self <: PartialCardActionAreaClasses](x: Self) {
    
    inline def setFocusHighlight(value: String): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    inline def setFocusHighlightUndefined: Self = StObject.set(x, "focusHighlight", js.undefined)
    
    inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
    
    inline def setFocusVisibleUndefined: Self = StObject.set(x, "focusVisible", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
