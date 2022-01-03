package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ListItemAvatar/listItemAvatarClasses.ListItemAvatarClasses> */
trait PartialListItemAvatarClasses extends StObject {
  
  var alignItemsFlexStart: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialListItemAvatarClasses {
  
  inline def apply(): PartialListItemAvatarClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemAvatarClasses]
  }
  
  extension [Self <: PartialListItemAvatarClasses](x: Self) {
    
    inline def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
    
    inline def setAlignItemsFlexStartUndefined: Self = StObject.set(x, "alignItemsFlexStart", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
