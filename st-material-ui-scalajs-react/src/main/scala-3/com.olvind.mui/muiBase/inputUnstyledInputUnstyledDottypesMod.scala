package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.OmitInputUnstyledPropsInputUnstyledTypeM
import com.olvind.mui.muiTypes.mod.Simplify
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputUnstyledInputUnstyledDottypesMod {
  
  trait InputUnstyledInputSlotPropsOverrides extends StObject
  
  type InputUnstyledOwnerState = Simplify[OmitInputUnstyledPropsInputUnstyledTypeM]
  
  trait InputUnstyledRootSlotPropsOverrides extends StObject
  
  trait InputUnstyledSlots extends StObject {
    
    /**
      * The component that renders the input.
      * @default 'input'
      */
    var input: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: js.UndefOr[ElementType] = js.undefined
    
    /**
      * The component that renders the textarea.
      * @default 'textarea'
      */
    var textarea: js.UndefOr[ElementType] = js.undefined
  }
  object InputUnstyledSlots {
    
    inline def apply(): InputUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setInput(value: ElementType): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTextarea(value: ElementType): Self = StObject.set(x, "textarea", value.asInstanceOf[js.Any])
      
      inline def setTextareaUndefined: Self = StObject.set(x, "textarea", js.undefined)
    }
  }
}
