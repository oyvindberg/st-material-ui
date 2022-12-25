package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id[P] extends StObject {
  
  /**
    * The helper text content.
    */
  var helperText: js.UndefOr[Node] = js.undefined
  
  /**
    * The id of the `input` element.
    * Use this prop to make `label` and `helperText` accessible for screen readers.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The label content.
    */
  var label: js.UndefOr[Node] = js.undefined
  
  /**
    * Name attribute of the `input` element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The short hint displayed in the `input` before the user enters a value.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  var slotProps: js.UndefOr[InputLabel[P]] = js.undefined
  
  var slots: js.UndefOr[HelperText] = js.undefined
}
object Id {
  
  inline def apply[P](): Id[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Id[P]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id[?], P] (val x: Self & Id[P]) extends AnyVal {
    
    inline def setHelperText(value: VdomNode): Self = StObject.set(x, "helperText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setHelperTextNull: Self = StObject.set(x, "helperText", null)
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setHelperTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "helperText", js.Array(value*))
    
    inline def setHelperTextVdomElement(value: VdomElement): Self = StObject.set(x, "helperText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSlotProps(value: InputLabel[P]): Self = StObject.set(x, "slotProps", value.asInstanceOf[js.Any])
    
    inline def setSlotPropsUndefined: Self = StObject.set(x, "slotProps", js.undefined)
    
    inline def setSlots(value: HelperText): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
