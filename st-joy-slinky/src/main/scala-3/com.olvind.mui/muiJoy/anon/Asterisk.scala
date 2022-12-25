package com.olvind.mui.muiJoy.anon

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ P in keyof {  root :@mui/joy.@mui/joy/utils/types.SlotProps<'label', {}, @mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelOwnerState>,   asterisk :@mui/joy.@mui/joy/utils/types.SlotProps<'span', {}, @mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelOwnerState>} ]:? react.react.ElementType<any>} */
trait Asterisk extends StObject {
  
  var asterisk: js.UndefOr[ReactElement] = js.undefined
  
  var root: js.UndefOr[ReactElement] = js.undefined
}
object Asterisk {
  
  inline def apply(): Asterisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Asterisk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asterisk] (val x: Self) extends AnyVal {
    
    inline def setAsterisk(value: ReactElement): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
    
    inline def setAsteriskUndefined: Self = StObject.set(x, "asterisk", js.undefined)
    
    inline def setRoot(value: ReactElement): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
