package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelFormLabelClassesMod {
  
  @JSImport("@mui/joy/FormLabel/formLabelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/FormLabel/formLabelClasses", JSImport.Default)
  @js.native
  val default: FormLabelClasses = js.native
  
  inline def getFormLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FormLabelClassKey = "root" | "asterisk"
  
  trait FormLabelClasses extends StObject {
    
    /** Styles applied to the asterisk element. */
    var asterisk: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object FormLabelClasses {
    
    inline def apply(asterisk: String, root: String): FormLabelClasses = {
      val __obj = js.Dynamic.literal(asterisk = asterisk.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormLabelClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormLabelClasses] (val x: Self) extends AnyVal {
      
      inline def setAsterisk(value: String): Self = StObject.set(x, "asterisk", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
