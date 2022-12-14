package com.olvind.mui.muiBase

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useSelectUseSelectDottypesMod {
  
  trait SelectOption[TValue] extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: Node
    
    var value: TValue
  }
  object SelectOption {
    
    inline def apply[TValue](value: TValue): SelectOption[TValue] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], label = null)
      __obj.asInstanceOf[SelectOption[TValue]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectOption[?], TValue] (val x: Self & SelectOption[TValue]) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
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
