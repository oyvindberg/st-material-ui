package com.olvind.mui.react.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var onCancel: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var onClose: js.UndefOr[ReactEventHandler[T]] = js.undefined
  
  var open: js.UndefOr[Boolean] = js.undefined
}
object DialogHTMLAttributes {
  
  inline def apply[T](): DialogHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogHTMLAttributes[?], T] (val x: Self & DialogHTMLAttributes[T]) extends AnyVal {
    
    inline def setOnCancel(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onCancel", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnClose(value: ReactEventFrom[T & Element] => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: ReactEventFrom[T & Element]) => value(t0).runNow()))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
