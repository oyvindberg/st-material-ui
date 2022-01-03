package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ListItemSecondaryAction/listItemSecondaryActionClasses.ListItemSecondaryActionClasses> */
@js.native
trait PartialListItemSecondaryActionClasses extends StObject {
  
  var disableGutters: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialListItemSecondaryActionClasses {
  
  @scala.inline
  def apply(): PartialListItemSecondaryActionClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemSecondaryActionClasses]
  }
  
  @scala.inline
  implicit class PartialListItemSecondaryActionClassesMutableBuilder[Self <: PartialListItemSecondaryActionClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableGutters(value: String): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
