package com.olvind.mui.muiStyledEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Theme[T /* <: js.Object */] extends StObject {
    
    var theme: T
  }
  object Theme {
    
    inline def apply[T /* <: js.Object */](theme: T): Theme[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme[T]]
    }
    
    extension [Self <: Theme[?], T /* <: js.Object */](x: Self & Theme[T]) {
      
      inline def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
