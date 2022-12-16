package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/SnackbarContent/snackbarContentClasses.SnackbarContentClasses> */
trait PartialSnackbarContentClasses extends StObject {
  
  var action: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialSnackbarContentClasses {
  
  inline def apply(): PartialSnackbarContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSnackbarContentClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialSnackbarContentClasses] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
