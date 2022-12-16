package com.olvind.mui.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onToggle: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply[T](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailsHTMLAttributes[?], T] (val x: Self & DetailsHTMLAttributes[T]) extends AnyVal {
    
    inline def setOnToggle(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onToggle", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
