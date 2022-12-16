package com.olvind.mui.muiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  trait Cancelable extends StObject {
    
    def clear(): Unit
  }
  object Cancelable {
    
    inline def apply(clear: () => Unit): Cancelable = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
}
