package com.olvind.mui.muiBase

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
    def apply(focusVisible: () => Unit): ButtonUnstyledActions = {
      val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
      __obj.asInstanceOf[ButtonUnstyledActions]
    }
    
    @scala.inline
    implicit class ButtonUnstyledActionsMutableBuilder[Self <: ButtonUnstyledActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusVisible(value: () => Unit): Self = StObject.set(x, "focusVisible", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ButtonUnstyledComponentsPropsOverrides extends StObject
}
