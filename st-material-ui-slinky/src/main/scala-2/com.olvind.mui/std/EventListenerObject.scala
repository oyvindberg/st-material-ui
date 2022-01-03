package com.olvind.mui.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventListenerObject extends StObject {
  
  /* standard dom */
  def handleEvent(evt: org.scalajs.dom.Event): Unit = js.native
}
object EventListenerObject {
  
  @scala.inline
  def apply(handleEvent: org.scalajs.dom.Event => Unit): EventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
    __obj.asInstanceOf[EventListenerObject]
  }
  
  @scala.inline
  implicit class EventListenerObjectMutableBuilder[Self <: EventListenerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleEvent(value: org.scalajs.dom.Event => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
  }
}
