package com.olvind.mui.muiStyledEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Theme[T /* <: js.Object */] extends StObject {
    
    var theme: T = js.native
  }
  object Theme {
    
    @scala.inline
    def apply[T /* <: js.Object */](theme: T): Theme[T] = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme[T]]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme[_], T /* <: js.Object */] (val x: Self with Theme[T]) extends AnyVal {
      
      @scala.inline
      def setTheme(value: T): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
