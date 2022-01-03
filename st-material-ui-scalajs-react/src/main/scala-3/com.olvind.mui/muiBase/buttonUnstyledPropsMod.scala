package com.olvind.mui.muiBase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUnstyledPropsMod {
  
  trait ButtonUnstyledActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonUnstyledActions {
    
    inline def apply(focusVisible: Callback): ButtonUnstyledActions = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
      __obj.asInstanceOf[ButtonUnstyledActions]
    }
    
    extension [Self <: ButtonUnstyledActions](x: Self) {
      
      inline def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
    }
  }
  
  trait ButtonUnstyledComponentsPropsOverrides extends StObject
}
