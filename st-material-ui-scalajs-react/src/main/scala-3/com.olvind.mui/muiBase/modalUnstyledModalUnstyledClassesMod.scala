package com.olvind.mui.muiBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalUnstyledModalUnstyledClassesMod {
  
  trait ModalUnstyledClasses extends StObject {
    
    /** Class name applied to the backdrop element. */
    var backdrop: String
    
    /** Class name applied to the root element if the `Modal` has exited. */
    var hidden: String
    
    /** Class name applied to the root element. */
    var root: String
  }
  object ModalUnstyledClasses {
    
    inline def apply(backdrop: String, hidden: String, root: String): ModalUnstyledClasses = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalUnstyledClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalUnstyledClasses] (val x: Self) extends AnyVal {
      
      inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
