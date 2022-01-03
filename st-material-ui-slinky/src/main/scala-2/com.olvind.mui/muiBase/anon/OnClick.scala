package com.olvind.mui.muiBase.anon

import org.scalajs.dom.HTMLInputElement
import slinky.web.SyntheticMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnClick extends StObject {
  
  def onClick(event: SyntheticMouseEvent[HTMLInputElement]): Unit = js.native
}
object OnClick {
  
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[HTMLInputElement] => Unit): OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
  }
}
