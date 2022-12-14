package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalUnstyledModalUnstyledClassesMod {
  
  trait ModalUnstyledClasses extends StObject {
    
    /** Styles applied to the root element if the `Modal` has exited. */
    var hidden: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ModalUnstyledClasses {
    
    inline def apply(hidden: String, root: String): ModalUnstyledClasses = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalUnstyledClasses]
    }
    
    extension [Self <: ModalUnstyledClasses](x: Self) {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
