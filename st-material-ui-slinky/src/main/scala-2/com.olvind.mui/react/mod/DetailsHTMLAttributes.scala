package com.olvind.mui.react.mod

import org.scalajs.dom.Event
import slinky.core.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetailsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onToggle: js.UndefOr[ReactEventHandler[T]] = js.native
  
  var open: js.UndefOr[Boolean] = js.native
}
object DetailsHTMLAttributes {
  
  @scala.inline
  def apply[T](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class DetailsHTMLAttributesMutableBuilder[Self <: DetailsHTMLAttributes[_], T] (val x: Self with DetailsHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setOnToggle(value: SyntheticEvent[Event, T] => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
