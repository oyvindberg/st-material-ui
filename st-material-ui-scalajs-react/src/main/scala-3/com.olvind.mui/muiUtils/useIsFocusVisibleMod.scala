package com.olvind.mui.muiUtils

import com.olvind.mui.react.mod.MutableRefObject
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIsFocusVisibleMod {
  
  trait UseIsFocusVisibleResult extends StObject {
    
    var isFocusVisibleRef: MutableRefObject[Boolean]
    
    def onBlur(event: ReactFocusEventFrom[Any & Element]): Unit
    
    def onFocus(event: ReactFocusEventFrom[Any & Element]): Unit
    
    var ref: Ref[Any]
  }
  object UseIsFocusVisibleResult {
    
    inline def apply(
      isFocusVisibleRef: MutableRefObject[Boolean],
      onBlur: ReactFocusEventFrom[Any & Element] => Callback,
      onFocus: ReactFocusEventFrom[Any & Element] => Callback
    ): UseIsFocusVisibleResult = {
      val __obj = js.Dynamic.literal(isFocusVisibleRef = isFocusVisibleRef.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => onFocus(t0).runNow()), ref = null)
      __obj.asInstanceOf[UseIsFocusVisibleResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseIsFocusVisibleResult] (val x: Self) extends AnyVal {
      
      inline def setIsFocusVisibleRef(value: MutableRefObject[Boolean]): Self = StObject.set(x, "isFocusVisibleRef", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setOnFocus(value: ReactFocusEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
