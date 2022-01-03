package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelUnstyledClassesMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiBase.muiBaseStrings.root
    - `com.olvind.mui`.muiBase.muiBaseStrings.hidden
  */
  trait TabPanelUnstyledClassKey extends StObject
  
  trait TabPanelUnstyledClasses extends StObject {
    
    var hidden: String
    
    var root: String
  }
  object TabPanelUnstyledClasses {
    
    inline def apply(hidden: String, root: String): TabPanelUnstyledClasses = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelUnstyledClasses]
    }
    
    extension [Self <: TabPanelUnstyledClasses](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
