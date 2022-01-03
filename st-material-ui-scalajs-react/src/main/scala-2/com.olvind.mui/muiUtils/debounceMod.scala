package com.olvind.mui.muiUtils

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debounceMod {
  
  @js.native
  trait Cancelable extends StObject {
    
    def clear(): Unit = js.native
  }
  object Cancelable {
    
    @scala.inline
    def apply(clear: Callback): Cancelable = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn)
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit class CancelableMutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    }
  }
}
