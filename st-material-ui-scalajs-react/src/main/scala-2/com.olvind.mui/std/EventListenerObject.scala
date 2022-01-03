package com.olvind.mui.std

import japgolly.scalajs.react.Callback
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
  def apply(handleEvent: org.scalajs.dom.Event => Callback): EventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1((t0: org.scalajs.dom.Event) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[EventListenerObject]
  }
  
  @scala.inline
  implicit class EventListenerObjectMutableBuilder[Self <: EventListenerObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandleEvent(value: org.scalajs.dom.Event => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: org.scalajs.dom.Event) => value(t0).runNow()))
  }
}
