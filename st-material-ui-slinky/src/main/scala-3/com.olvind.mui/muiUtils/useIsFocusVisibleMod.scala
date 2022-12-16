package com.olvind.mui.muiUtils

import com.olvind.mui.react.mod.MutableRefObject
import com.olvind.mui.react.mod.Ref
import slinky.core.facade.ReactRef
import slinky.web.SyntheticFocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useIsFocusVisibleMod {
  
  trait UseIsFocusVisibleResult extends StObject {
    
    var isFocusVisibleRef: MutableRefObject[Boolean]
    
    def onBlur(event: SyntheticFocusEvent[Any]): Unit
    
    def onFocus(event: SyntheticFocusEvent[Any]): Unit
    
    var ref: Ref[Any]
  }
  object UseIsFocusVisibleResult {
    
    inline def apply(
      isFocusVisibleRef: MutableRefObject[Boolean],
      onBlur: SyntheticFocusEvent[Any] => Unit,
      onFocus: SyntheticFocusEvent[Any] => Unit
    ): UseIsFocusVisibleResult = {
      val __obj = js.Dynamic.literal(isFocusVisibleRef = isFocusVisibleRef.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onFocus = js.Any.fromFunction1(onFocus), ref = null)
      __obj.asInstanceOf[UseIsFocusVisibleResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseIsFocusVisibleResult] (val x: Self) extends AnyVal {
      
      inline def setIsFocusVisibleRef(value: MutableRefObject[Boolean]): Self = StObject.set(x, "isFocusVisibleRef", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: SyntheticFocusEvent[Any] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnFocus(value: SyntheticFocusEvent[Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setRef(value: Ref[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
}
