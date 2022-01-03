package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/ListItemIcon/listItemIconClasses.ListItemIconClasses> */
@js.native
trait PartialListItemIconClasses extends StObject {
  
  var alignItemsFlexStart: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialListItemIconClasses {
  
  @scala.inline
  def apply(): PartialListItemIconClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemIconClasses]
  }
  
  @scala.inline
  implicit class PartialListItemIconClassesMutableBuilder[Self <: PartialListItemIconClasses] (val x: Self) extends AnyVal {
    
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
