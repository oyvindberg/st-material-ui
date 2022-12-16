package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlFormControlClassesMod {
  
  @JSImport("@mui/material/FormControl/formControlClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/FormControl/formControlClasses", JSImport.Default)
  @js.native
  val default: FormControlClasses = js.native
  
  inline def getFormControlUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FormControlClassKey = "root" | "marginNormal" | "marginDense" | "fullWidth"
  
  trait FormControlClasses extends StObject {
    
    /** Styles applied to the root element if `fullWidth={true}`. */
    var fullWidth: String
    
    /** Styles applied to the root element if `margin="dense"`. */
    var marginDense: String
    
    /** Styles applied to the root element if `margin="normal"`. */
    var marginNormal: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object FormControlClasses {
    
    inline def apply(fullWidth: String, marginDense: String, marginNormal: String, root: String): FormControlClasses = {
      val __obj = js.Dynamic.literal(fullWidth = fullWidth.asInstanceOf[js.Any], marginDense = marginDense.asInstanceOf[js.Any], marginNormal = marginNormal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormControlClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormControlClasses] (val x: Self) extends AnyVal {
      
      inline def setFullWidth(value: String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
      
      inline def setMarginDense(value: String): Self = StObject.set(x, "marginDense", value.asInstanceOf[js.Any])
      
      inline def setMarginNormal(value: String): Self = StObject.set(x, "marginNormal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
