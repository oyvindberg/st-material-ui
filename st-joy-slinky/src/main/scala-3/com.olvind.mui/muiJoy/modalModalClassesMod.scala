package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalClassesMod {
  
  @JSImport("@mui/joy/Modal/modalClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Modal/modalClasses", JSImport.Default)
  @js.native
  val default: ModalClasses = js.native
  
  inline def getModalUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ModalClassKey = "root" | "backdrop"
  
  trait ModalClasses extends StObject {
    
    /** Styles applied to the backdrop element. */
    var backdrop: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ModalClasses {
    
    inline def apply(backdrop: String, root: String): ModalClasses = {
      val __obj = js.Dynamic.literal(backdrop = backdrop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalClasses] (val x: Self) extends AnyVal {
      
      inline def setBackdrop(value: String): Self = StObject.set(x, "backdrop", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
