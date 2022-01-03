package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/TableBody/tableBodyClasses.TableBodyClasses> */
@js.native
trait PartialTableBodyClasses extends StObject {
  
  var root: js.UndefOr[String] = js.native
}
object PartialTableBodyClasses {
  
  @scala.inline
  def apply(): PartialTableBodyClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableBodyClasses]
  }
  
  @scala.inline
  implicit class PartialTableBodyClassesMutableBuilder[Self <: PartialTableBodyClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
