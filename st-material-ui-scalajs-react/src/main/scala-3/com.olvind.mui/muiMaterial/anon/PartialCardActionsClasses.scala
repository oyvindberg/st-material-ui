package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/CardActions/cardActionsClasses.CardActionsClasses> */
trait PartialCardActionsClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var spacing: js.UndefOr[String] = js.undefined
}
object PartialCardActionsClasses {
  
  inline def apply(): PartialCardActionsClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardActionsClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCardActionsClasses] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
  }
}
