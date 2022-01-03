package com.olvind.mui.muiBase.anon

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
  def apply(in: Boolean, onEnter: () => js.Object, onExited: () => js.Object): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], onEnter = js.Any.fromFunction0(onEnter), onExited = js.Any.fromFunction0(onExited))
    __obj.asInstanceOf[In]
  }
  
  @scala.inline
  implicit class InMutableBuilder[Self <: In] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: Boolean): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnter(value: () => js.Object): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnExited(value: () => js.Object): Self = StObject.set(x, "onExited", js.Any.fromFunction0(value))
  }
}
