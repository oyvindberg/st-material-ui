package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentDialogContentClassesMod {
  
  @JSImport("@mui/material/DialogContent/dialogContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/DialogContent/dialogContentClasses", JSImport.Default)
  @js.native
  val default: DialogContentClasses = js.native
  
  inline def getDialogContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DialogContentClassKey = "root" | "dividers"
  
  trait DialogContentClasses extends StObject {
    
    /** Styles applied to the root element if `dividers={true}`. */
    var dividers: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object DialogContentClasses {
    
    inline def apply(dividers: String, root: String): DialogContentClasses = {
      val __obj = js.Dynamic.literal(dividers = dividers.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogContentClasses]
    }
    
    extension [Self <: DialogContentClasses](x: Self) {
      
      inline def setDividers(value: String): Self = StObject.set(x, "dividers", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
