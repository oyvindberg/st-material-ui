package com.olvind.mui.muiBase.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(event: ReactMouseEventFrom[HTMLInputElement]): Unit
}
object OnClick {
  
  inline def apply(onClick: ReactMouseEventFrom[HTMLInputElement] => Callback): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement]) => onClick(t0).runNow()))
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setOnClick(value: ReactMouseEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement]) => value(t0).runNow()))
  }
}
