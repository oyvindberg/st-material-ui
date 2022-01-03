package com.olvind.mui.muiBase.anon

import org.scalajs.dom.HTMLInputElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  def onClick(event: SyntheticMouseEvent[HTMLInputElement]): Unit
}
object OnClick {
  
  inline def apply(onClick: SyntheticMouseEvent[HTMLInputElement] => Unit): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setOnClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
  }
}
