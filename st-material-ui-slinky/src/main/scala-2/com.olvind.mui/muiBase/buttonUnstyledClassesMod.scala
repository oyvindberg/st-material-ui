package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.active
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.focusVisible
  */
  trait ButtonUnstyledClassKey extends StObject
  
  @js.native
  trait ButtonUnstyledClasses extends StObject {
    
    var active: String = js.native
    
    var disabled: String = js.native
    
    var focusVisible: String = js.native
    
    var root: String = js.native
  }
  object ButtonUnstyledClasses {
    
    @scala.inline
    def apply(active: String, disabled: String, focusVisible: String, root: String): ButtonUnstyledClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonUnstyledClasses]
    }
    
    @scala.inline
    implicit class ButtonUnstyledClassesMutableBuilder[Self <: ButtonUnstyledClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
