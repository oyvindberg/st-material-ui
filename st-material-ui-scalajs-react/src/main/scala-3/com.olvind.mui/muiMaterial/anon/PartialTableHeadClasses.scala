package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/TableHead/tableHeadClasses.TableHeadClasses> */
trait PartialTableHeadClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialTableHeadClasses {
  
  inline def apply(): PartialTableHeadClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableHeadClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialTableHeadClasses] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
