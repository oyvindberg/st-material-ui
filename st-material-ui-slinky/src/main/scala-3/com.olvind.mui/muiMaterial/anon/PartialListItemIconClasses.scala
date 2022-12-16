package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ListItemIcon/listItemIconClasses.ListItemIconClasses> */
trait PartialListItemIconClasses extends StObject {
  
  var alignItemsFlexStart: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialListItemIconClasses {
  
  inline def apply(): PartialListItemIconClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemIconClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListItemIconClasses] (val x: Self) extends AnyVal {
    
    inline def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsFlexStartUndefined: Self = StObject.set(x, "alignItemsFlexStart", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
