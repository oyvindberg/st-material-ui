package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Modal/ModalProps.ModalOwnerState>,   backdrop :@mui/joy.@mui/joy/utils/types.SlotProps<'div', {}, @mui/joy.@mui/joy/Modal/ModalProps.ModalOwnerState>} ]:? react.react.ElementType<any>} */
trait Backdrop extends StObject {
  
  var backdrop: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object Backdrop {
  
  inline def apply(): Backdrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Backdrop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backdrop] (val x: Self) extends AnyVal {
    
    inline def setBackdrop(value: ReactElement): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
    
    inline def setBackdropUndefined: Self = StObject.set(x, "backdrop", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
