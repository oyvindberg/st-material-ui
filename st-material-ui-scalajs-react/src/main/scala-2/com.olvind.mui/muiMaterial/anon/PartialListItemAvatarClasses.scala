package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ListItemAvatar/listItemAvatarClasses.ListItemAvatarClasses> */
@js.native
trait PartialListItemAvatarClasses extends StObject {
  
  var alignItemsFlexStart: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialListItemAvatarClasses {
  
  @scala.inline
  def apply(): PartialListItemAvatarClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemAvatarClasses]
  }
  
  @scala.inline
  implicit class PartialListItemAvatarClassesMutableBuilder[Self <: PartialListItemAvatarClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignItemsFlexStartUndefined: Self = StObject.set(x, "alignItemsFlexStart", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
