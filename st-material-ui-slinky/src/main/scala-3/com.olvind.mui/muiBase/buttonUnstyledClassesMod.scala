package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.active
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
    - `com.olvind.mui`.muiBase.muiBaseStrings.focusVisible
  */
  trait ButtonUnstyledClassKey extends StObject
  
  trait ButtonUnstyledClasses extends StObject {
    
    var active: String
    
    var disabled: String
    
    var focusVisible: String
    
    var root: String
  }
  object ButtonUnstyledClasses {
    
    inline def apply(active: String, disabled: String, focusVisible: String, root: String): ButtonUnstyledClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonUnstyledClasses]
    }
    
    extension [Self <: ButtonUnstyledClasses](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
