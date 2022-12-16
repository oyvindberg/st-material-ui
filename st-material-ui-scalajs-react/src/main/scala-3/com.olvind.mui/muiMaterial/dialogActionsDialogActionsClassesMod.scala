package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogActionsDialogActionsClassesMod {
  
  @JSImport("@mui/material/DialogActions/dialogActionsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/DialogActions/dialogActionsClasses", JSImport.Default)
  @js.native
  val default: DialogActionsClasses = js.native
  
  inline def getDialogActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDialogActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type DialogActionsClassKey = "root" | "spacing"
  
  trait DialogActionsClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element unless `disableSpacing={true}`. */
    var spacing: String
  }
  object DialogActionsClasses {
    
    inline def apply(root: String, spacing: String): DialogActionsClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialogActionsClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogActionsClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
}
