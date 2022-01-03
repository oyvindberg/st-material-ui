package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/DialogContent/dialogContentClasses.DialogContentClasses> */
trait PartialDialogContentClasses extends StObject {
  
  var dividers: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialDialogContentClasses {
  
  inline def apply(): PartialDialogContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDialogContentClasses]
  }
  
  extension [Self <: PartialDialogContentClasses](x: Self) {
    
    inline def setDividers(value: String): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
    
    inline def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
