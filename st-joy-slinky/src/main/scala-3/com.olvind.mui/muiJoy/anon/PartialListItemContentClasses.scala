package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/ListItemContent/listItemContentClasses.ListItemContentClasses> */
trait PartialListItemContentClasses extends StObject {
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialListItemContentClasses {
  
  inline def apply(): PartialListItemContentClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemContentClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListItemContentClasses] (val x: Self) extends AnyVal {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
