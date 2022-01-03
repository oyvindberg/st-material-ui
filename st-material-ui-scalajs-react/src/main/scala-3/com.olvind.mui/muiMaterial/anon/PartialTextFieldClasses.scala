package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/TextField/textFieldClasses.TextFieldClasses> */
trait PartialTextFieldClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialTextFieldClasses {
  
  inline def apply(): PartialTextFieldClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTextFieldClasses]
  }
  
  extension [Self <: PartialTextFieldClasses](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
