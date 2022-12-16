package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ListItemSecondaryAction/listItemSecondaryActionClasses.ListItemSecondaryActionClasses> */
trait PartialListItemSecondaryActionClasses extends StObject {
  
  var disableGutters: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialListItemSecondaryActionClasses {
  
  inline def apply(): PartialListItemSecondaryActionClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemSecondaryActionClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListItemSecondaryActionClasses] (val x: Self) extends AnyVal {
    
    inline def setDisableGutters(value: String): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
    
    inline def setDisableGuttersUndefined: Self = StObject.set(x, "disableGutters", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
