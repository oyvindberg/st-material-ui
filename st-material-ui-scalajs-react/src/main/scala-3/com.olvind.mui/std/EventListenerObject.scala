package com.olvind.mui.std

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListenerObject extends StObject {
  
  /* standard dom */
  def handleEvent(evt: org.scalajs.dom.Event): Unit
}
object EventListenerObject {
  
  inline def apply(handleEvent: org.scalajs.dom.Event => Callback): EventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1((t0: org.scalajs.dom.Event) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[EventListenerObject]
  }
  
  extension [Self <: EventListenerObject](x: Self) {
    
    inline def setHandleEvent(value: org.scalajs.dom.Event => Callback): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1((t0: org.scalajs.dom.Event) => value(t0).runNow()))
  }
}
