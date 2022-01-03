package com.olvind.mui.muiUtils

import com.olvind.mui.react.mod.MutableRefObject
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIsFocusVisibleMod {
  
  @js.native
  trait UseIsFocusVisibleResult extends StObject {
    
    var isFocusVisibleRef: MutableRefObject[Boolean] = js.native
    
    def onBlur(event: ReactFocusEventFrom[Any with Element]): Unit = js.native
    
    def onFocus(event: ReactFocusEventFrom[Any with Element]): Unit = js.native
    
    var ref: Ref[Any] = js.native
  }
  object UseIsFocusVisibleResult {
    
    @scala.inline
    def apply(
      isFocusVisibleRef: MutableRefObject[Boolean],
      onBlur: ReactFocusEventFrom[Any with Element] => Callback,
      onFocus: ReactFocusEventFrom[Any with Element] => Callback
    ): UseIsFocusVisibleResult = {
      val __obj = js.Dynamic.literal(isFocusVisibleRef = isFocusVisibleRef.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with Element]) => onBlur(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with Element]) => onFocus(t0).runNow()), ref = null)
      __obj.asInstanceOf[UseIsFocusVisibleResult]
    }
    
    @scala.inline
    implicit class UseIsFocusVisibleResultMutableBuilder[Self <: UseIsFocusVisibleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsFocusVisibleRef(value: MutableRefObject[Boolean]): Self = StObject.set(x, "isFocusVisibleRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnBlur(value: ReactFocusEventFrom[Any with Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setOnFocus(value: ReactFocusEventFrom[Any with Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any with Element]) => value(t0).runNow()))
      
      @scala.inline
      def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
}
