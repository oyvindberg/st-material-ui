package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/AlertTitle/alertTitleClasses.AlertTitleClasses> */
trait PartialAlertTitleClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialAlertTitleClasses {
  
  inline def apply(): PartialAlertTitleClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlertTitleClasses]
  }
  
  extension [Self <: PartialAlertTitleClasses](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
