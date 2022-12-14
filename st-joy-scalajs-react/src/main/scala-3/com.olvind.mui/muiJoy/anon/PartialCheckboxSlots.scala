package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/joy.@mui/joy/Checkbox/CheckboxProps.CheckboxSlots> */
trait PartialCheckboxSlots extends StObject {
  
  var action: js.UndefOr[ElementType] = js.undefined
  
  var checkbox: js.UndefOr[ElementType] = js.undefined
  
  var input: js.UndefOr[ElementType] = js.undefined
  
  var label: js.UndefOr[ElementType] = js.undefined
  
  var root: js.UndefOr[ElementType] = js.undefined
}
object PartialCheckboxSlots {
  
  inline def apply(): PartialCheckboxSlots = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckboxSlots]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCheckboxSlots] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ElementType): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setCheckbox(value: ElementType): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
    
    inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLabel(value: ElementType): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
