package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.ChangeEvent
import com.olvind.mui.react.mod.Context
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupContextMod extends Shortcut {
  
  /**
    * @ignore - internal component.
    */
  @JSImport("@mui/material/RadioGroup/RadioGroupContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[RadioGroupContextValue]] = js.native
  
  trait RadioGroupContextValue extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    def onChange(event: ChangeEvent[HTMLInputElement], value: String): Unit
    
    var value: Any
  }
  object RadioGroupContextValue {
    
    inline def apply(onChange: (ChangeEvent[HTMLInputElement], String) => Unit, value: Any): RadioGroupContextValue = {
      val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadioGroupContextValue]
    }
    
    extension [Self <: RadioGroupContextValue](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: (ChangeEvent[HTMLInputElement], String) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[js.UndefOr[RadioGroupContextValue]]
  
  /* This means you don't have to write `default`, but can instead just say `radioGroupContextMod.foo` */
  override def _to: Context[js.UndefOr[RadioGroupContextValue]] = default
}
