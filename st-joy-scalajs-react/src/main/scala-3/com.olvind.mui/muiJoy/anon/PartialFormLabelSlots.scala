package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/FormLabel/FormLabelProps.FormLabelSlots> */
trait PartialFormLabelSlots extends StObject {
  
  var asterisk: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialFormLabelSlots {
  
  inline def apply(): PartialFormLabelSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFormLabelSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFormLabelSlots] (val x: Self) extends AnyVal {
    
    inline def setAsterisk(value: ElementType): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
    
    inline def setAsteriskUndefined: Self = StObject.set(x, "asterisk", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
