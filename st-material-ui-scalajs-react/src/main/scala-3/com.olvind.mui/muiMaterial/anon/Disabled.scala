package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabled extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[Boolean] = js.undefined
  
  var filled: js.UndefOr[Boolean] = js.undefined
  
  var focused: js.UndefOr[Boolean] = js.undefined
  
  var margin: js.UndefOr["dense" | "none" | "normal"] = js.undefined
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var startAdornment: js.UndefOr[japgolly.scalajs.react.facade.React.Node] = js.undefined
}
object Disabled {
  
  inline def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disabled] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    inline def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
    
    inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setMargin(value: "dense" | "none" | "normal"): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStartAdornment(value: VdomNode): Self = StObject.set(x, "startAdornment", value.rawNode.asInstanceOf[js.Any])
    
    inline def setStartAdornmentNull: Self = StObject.set(x, "startAdornment", null)
    
    inline def setStartAdornmentUndefined: Self = StObject.set(x, "startAdornment", js.undefined)
    
    inline def setStartAdornmentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startAdornment", js.Array(value*))
    
    inline def setStartAdornmentVdomElement(value: VdomElement): Self = StObject.set(x, "startAdornment", value.rawElement.asInstanceOf[js.Any])
  }
}
