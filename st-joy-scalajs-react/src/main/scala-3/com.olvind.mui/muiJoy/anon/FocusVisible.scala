package com.olvind.mui.muiJoy.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisible extends StObject {
  
  def focusVisible(): Unit
}
object FocusVisible {
  
  inline def apply(focusVisible: Callback): FocusVisible = {
    val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
    __obj.asInstanceOf[FocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusVisible] (val x: Self) extends AnyVal {
    
    inline def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
  }
}
