package com.olvind.mui.muiMaterial.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndAdornment extends StObject {
  
  var className: String = js.native
  
  var endAdornment: japgolly.scalajs.react.facade.React.Node = js.native
  
  var ref: com.olvind.mui.react.mod.Ref[Any] = js.native
  
  var startAdornment: japgolly.scalajs.react.facade.React.Node = js.native
}
object EndAdornment {
  
  @scala.inline
  def apply(className: String): EndAdornment = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endAdornment = null, ref = null, startAdornment = null)
    __obj.asInstanceOf[EndAdornment]
  }
  
  @scala.inline
  implicit class EndAdornmentMutableBuilder[Self <: EndAdornment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornment(value: VdomNode): Self = StObject.set(x, "endAdornment", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAdornmentNull: Self = StObject.set(x, "endAdornment", null)
    
    @scala.inline
    def setEndAdornmentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "endAdornment", js.Array(value :_*))
    
    @scala.inline
    def setEndAdornmentVdomElement(value: VdomElement): Self = StObject.set(x, "endAdornment", value.rawElement.asInstanceOf[js.Any])
    
    @scala.inline
    def setRef(value: com.olvind.mui.react.mod.Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setStartAdornment(value: VdomNode): Self = StObject.set(x, "startAdornment", value.rawNode.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAdornmentNull: Self = StObject.set(x, "startAdornment", null)
    
    @scala.inline
    def setStartAdornmentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "startAdornment", js.Array(value :_*))
    
    @scala.inline
    def setStartAdornmentVdomElement(value: VdomElement): Self = StObject.set(x, "startAdornment", value.rawElement.asInstanceOf[js.Any])
  }
}
