package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/FormGroup/formGroupClasses.FormGroupClasses> */
trait PartialFormGroupClasses extends StObject {
  
  var error: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
  
  var row: js.UndefOr[String] = js.undefined
}
object PartialFormGroupClasses {
  
  inline def apply(): PartialFormGroupClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormGroupClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFormGroupClasses] (val x: Self) extends AnyVal {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
