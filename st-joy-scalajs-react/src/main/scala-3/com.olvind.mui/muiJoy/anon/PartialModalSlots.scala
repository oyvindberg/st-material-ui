package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Modal/ModalProps.ModalSlots> */
trait PartialModalSlots extends StObject {
  
  var backdrop: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialModalSlots {
  
  inline def apply(): PartialModalSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModalSlots] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: ElementType): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
