package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextFormHelperTextClassesMod {
  
  @JSImport("@mui/joy/FormHelperText/formHelperTextClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/FormHelperText/formHelperTextClasses", JSImport.Default)
  @js.native
  val default: FormHelperTextClasses = js.native
  
  inline def getFormHelperTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormHelperTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FormHelperTextClassKey = "root"
  
  trait FormHelperTextClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object FormHelperTextClasses {
    
    inline def apply(root: String): FormHelperTextClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormHelperTextClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormHelperTextClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
