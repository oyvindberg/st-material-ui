package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
  */
  trait FormControlUnstyledClassKey extends StObject
  
  trait FormControlUnstyledClasses extends StObject {
    
    /** Class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Class applied to the root element. */
    var root: String
  }
  object FormControlUnstyledClasses {
    
    inline def apply(disabled: String, root: String): FormControlUnstyledClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlUnstyledClasses]
    }
    
    extension [Self <: FormControlUnstyledClasses](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
