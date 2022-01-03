package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait In extends StObject {
  
  var in: Boolean = js.native
  
  def onEnter(): js.Object = js.native
  
  def onExited(): js.Object = js.native
}
object In {
  
  @scala.inline
  def apply(in: Boolean, onEnter: CallbackTo[js.Object], onExited: CallbackTo[js.Object]): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onEnter = onEnter.toJsFn, onExited = onExited.toJsFn)
    __obj.asInstanceOf[In]
  }
  
  @scala.inline
  implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnter(value: CallbackTo[js.Object]): Self = StObject.set(x, "onEnter", value.toJsFn)
    
    @scala.inline
    def setOnExited(value: CallbackTo[js.Object]): Self = StObject.set(x, "onExited", value.toJsFn)
  }
}
