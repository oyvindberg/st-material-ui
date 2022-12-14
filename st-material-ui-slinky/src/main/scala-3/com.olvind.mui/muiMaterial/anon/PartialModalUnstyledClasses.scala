package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/base.@mui/base/ModalUnstyled.ModalUnstyledClasses> */
trait PartialModalUnstyledClasses extends StObject {
  
  var backdrop: js.UndefOr[String] = js.undefined
  
  var hidden: js.UndefOr[String] = js.undefined
  
  var root: js.UndefOr[String] = js.undefined
}
object PartialModalUnstyledClasses {
  
  inline def apply(): PartialModalUnstyledClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalUnstyledClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModalUnstyledClasses] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
