package com.olvind.mui.muiBase

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUnstyledPropsMod {
  
  @js.native
  trait ButtonUnstyledActions extends StObject {
    
    def focusVisible(): Unit = js.native
  }
  object ButtonUnstyledActions {
    
    @scala.inline
    def apply(focusVisible: Callback): ButtonUnstyledActions = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
      __obj.asInstanceOf[ButtonUnstyledActions]
    }
    
    @scala.inline
    implicit class ButtonUnstyledActionsMutableBuilder[Self <: ButtonUnstyledActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
    }
  }
  
  @js.native
  trait ButtonUnstyledComponentsPropsOverrides extends StObject
}
