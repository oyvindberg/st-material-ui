package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.OmitFormControlUnstyledOwnPropsNonOption
import com.olvind.mui.muiBase.anon.PickFormControlUnstyledPropsFormControlU
import com.olvind.mui.muiTypes.mod.Simplify
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlUnstyledFormControlUnstyledDottypesMod {
  
  type FormControlUnstyledOwnerState = Simplify[OmitFormControlUnstyledOwnPropsNonOption]
  
  trait FormControlUnstyledRootSlotPropsOverrides extends StObject
  
  trait FormControlUnstyledSlots extends StObject {
    
    /**
      * The component that renders the root.
      * @default 'div'
      */
    var root: js.UndefOr[ElementType] = js.undefined
  }
  object FormControlUnstyledSlots {
    
    inline def apply(): FormControlUnstyledSlots = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormControlUnstyledSlots]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormControlUnstyledSlots] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: ElementType): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  type FormControlUnstyledState = Simplify[PickFormControlUnstyledPropsFormControlU]
  
  type NativeFormControlElement = HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement
}
