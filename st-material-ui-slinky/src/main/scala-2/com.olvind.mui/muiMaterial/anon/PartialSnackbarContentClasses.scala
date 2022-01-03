package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/SnackbarContent/snackbarContentClasses.SnackbarContentClasses> */
@js.native
trait PartialSnackbarContentClasses extends StObject {
  
  var action: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialSnackbarContentClasses {
  
  @scala.inline
  def apply(): PartialSnackbarContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSnackbarContentClasses]
  }
  
  @scala.inline
  implicit class PartialSnackbarContentClassesMutableBuilder[Self <: PartialSnackbarContentClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
