package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snackbarContentClassesMod {
  
  @JSImport("@mui/material/SnackbarContent/snackbarContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/SnackbarContent/snackbarContentClasses", JSImport.Default)
  @js.native
  val default: SnackbarContentClasses = js.native
  
  inline def getSnackbarContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSnackbarContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.message
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.action
  */
  trait SnackbarContentClassKey extends StObject
  
  trait SnackbarContentClasses extends StObject {
    
    /** Styles applied to the action wrapper element if `action` is provided. */
    var action: String
    
    /** Styles applied to the message wrapper element. */
    var message: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object SnackbarContentClasses {
    
    inline def apply(action: String, message: String, root: String): SnackbarContentClasses = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnackbarContentClasses]
    }
    
    extension [Self <: SnackbarContentClasses](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
