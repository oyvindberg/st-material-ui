package com.olvind.mui.muiJoy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusVisible extends StObject {
  
  def focusVisible(): Unit
}
object FocusVisible {
  
  inline def apply(focusVisible: () => Unit): FocusVisible = {
    val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
    __obj.asInstanceOf[FocusVisible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusVisible] (val x: Self) extends AnyVal {
    
    inline def setFocusVisible(value: () => Unit): Self = StObject.set(x, "focusVisible", js.Any.fromFunction0(value))
  }
}
