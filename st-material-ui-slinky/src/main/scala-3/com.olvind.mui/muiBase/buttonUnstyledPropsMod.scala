package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUnstyledPropsMod {
  
  trait ButtonUnstyledActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonUnstyledActions {
    
    inline def apply(focusVisible: () => Unit): ButtonUnstyledActions = {
      val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
      __obj.asInstanceOf[ButtonUnstyledActions]
    }
    
    extension [Self <: ButtonUnstyledActions](x: Self) {
      
      inline def setFocusVisible(value: () => Unit): Self = StObject.set(x, "focusVisible", js.Any.fromFunction0(value))
    }
  }
  
  trait ButtonUnstyledComponentsPropsOverrides extends StObject
}
