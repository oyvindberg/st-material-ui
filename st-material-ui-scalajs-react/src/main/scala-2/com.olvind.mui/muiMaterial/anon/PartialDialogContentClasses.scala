package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/DialogContent/dialogContentClasses.DialogContentClasses> */
@js.native
trait PartialDialogContentClasses extends StObject {
  
  var dividers: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialDialogContentClasses {
  
  @scala.inline
  def apply(): PartialDialogContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDialogContentClasses]
  }
  
  @scala.inline
  implicit class PartialDialogContentClassesMutableBuilder[Self <: PartialDialogContentClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDividers(value: String): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividersUndefined: Self = StObject.set(x, "dividers", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
