package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Backdrop/backdropClasses.BackdropClasses> */
trait PartialBackdropClasses extends StObject {
  
  var invisible: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialBackdropClasses {
  
  inline def apply(): PartialBackdropClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBackdropClasses]
  }
  
  extension [Self <: PartialBackdropClasses](x: Self) {
    
    inline def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
