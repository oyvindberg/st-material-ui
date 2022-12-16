package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Popover/popoverClasses.PopoverClasses> */
trait PartialPopoverClasses extends StObject {
  
  var paper: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialPopoverClasses {
  
  inline def apply(): PartialPopoverClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPopoverClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPopoverClasses] (val x: Self) extends AnyVal {
    
    inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
    
    inline def setPaperUndefined: Self = StObject.set(x, "paper", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
