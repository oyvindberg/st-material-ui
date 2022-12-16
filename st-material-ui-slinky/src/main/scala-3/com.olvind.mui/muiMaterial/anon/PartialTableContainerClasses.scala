package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/TableContainer/tableContainerClasses.TableContainerClasses> */
trait PartialTableContainerClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialTableContainerClasses {
  
  inline def apply(): PartialTableContainerClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableContainerClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTableContainerClasses] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
