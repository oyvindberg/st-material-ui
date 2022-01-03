package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/FormGroup/formGroupClasses.FormGroupClasses> */
@js.native
trait PartialFormGroupClasses extends StObject {
  
  var root: js.UndefOr[String] = js.native
  
  var row: js.UndefOr[String] = js.native
}
object PartialFormGroupClasses {
  
  @scala.inline
  def apply(): PartialFormGroupClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormGroupClasses]
  }
  
  @scala.inline
  implicit class PartialFormGroupClassesMutableBuilder[Self <: PartialFormGroupClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setRow(value: String): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
