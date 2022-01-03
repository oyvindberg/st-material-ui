package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.selected
    - `com.olvind.mui`.muiBase.muiBaseStrings.disabled
  */
  trait TabUnstyledClassKey extends StObject
  
  trait TabUnstyledClasses extends StObject {
    
    var disabled: String
    
    var root: String
    
    var selected: String
  }
  object TabUnstyledClasses {
    
    inline def apply(disabled: String, root: String, selected: String): TabUnstyledClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabUnstyledClasses]
    }
    
    extension [Self <: TabUnstyledClasses](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
