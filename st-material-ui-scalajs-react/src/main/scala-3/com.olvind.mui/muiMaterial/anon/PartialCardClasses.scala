package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Card/cardClasses.CardClasses> */
trait PartialCardClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialCardClasses {
  
  inline def apply(): PartialCardClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCardClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCardClasses] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
