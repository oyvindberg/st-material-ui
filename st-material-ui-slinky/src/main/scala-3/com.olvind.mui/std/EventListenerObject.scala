package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListenerObject extends StObject {
  
  /* standard dom */
  def handleEvent(evt: org.scalajs.dom.Event): Unit
}
object EventListenerObject {
  
  inline def apply(handleEvent: org.scalajs.dom.Event => Unit): EventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventListenerObject] (val x: Self) extends AnyVal {
    
    inline def setHandleEvent(value: org.scalajs.dom.Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
