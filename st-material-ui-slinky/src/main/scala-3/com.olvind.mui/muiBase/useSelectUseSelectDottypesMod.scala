package com.olvind.mui.muiBase

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectUseSelectDottypesMod {
  
  trait SelectOption[TValue] extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: ReactElement
    
    var value: TValue
  }
  object SelectOption {
    
    inline def apply[TValue](label: ReactElement, value: TValue): SelectOption[TValue] = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectOption[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectOption[?], TValue] (val x: Self & SelectOption[TValue]) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Multiple extends true ? std.Array<Value> : Value | null
    }}}
    */
  type SelectValue[Value, Multiple] = js.Array[Value]
}
