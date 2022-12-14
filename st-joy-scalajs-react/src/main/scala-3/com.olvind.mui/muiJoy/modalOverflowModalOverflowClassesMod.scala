package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalOverflowModalOverflowClassesMod {
  
  @JSImport("@mui/joy/ModalOverflow/modalOverflowClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/ModalOverflow/modalOverflowClasses", JSImport.Default)
  @js.native
  val default: ModalOverflowClasses = js.native
  
  inline def getModalOverflowUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalOverflowUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ModalOverflowClassKey = "root"
  
  trait ModalOverflowClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ModalOverflowClasses {
    
    inline def apply(root: String): ModalOverflowClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalOverflowClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalOverflowClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
