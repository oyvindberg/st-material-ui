package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alertTitleAlertTitleClassesMod {
  
  @JSImport("@mui/material/AlertTitle/alertTitleClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AlertTitle/alertTitleClasses", JSImport.Default)
  @js.native
  val default: AlertTitleClasses = js.native
  
  inline def getAlertTitleUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlertTitleUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AlertTitleClassKey = "root"
  
  trait AlertTitleClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object AlertTitleClasses {
    
    inline def apply(root: String): AlertTitleClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlertTitleClasses]
    }
    
    extension [Self <: AlertTitleClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
