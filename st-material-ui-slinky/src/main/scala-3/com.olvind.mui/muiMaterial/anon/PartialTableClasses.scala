package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Table/tableClasses.TableClasses> */
trait PartialTableClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
  
  var stickyHeader: js.UndefOr[String] = js.undefined
}
object PartialTableClasses {
  
  inline def apply(): PartialTableClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableClasses]
  }
  
  extension [Self <: PartialTableClasses](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    inline def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
  }
}
