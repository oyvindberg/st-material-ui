package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Modal/ModalProps.ModalSlots> */
trait PartialModalSlots extends StObject {
  
  var backdrop: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object PartialModalSlots {
  
  inline def apply(): PartialModalSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModalSlots] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: ReactElement): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
