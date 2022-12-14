package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemSecondaryActionListItemSecondaryActionClassesMod {
  
  @JSImport("@mui/material/ListItemSecondaryAction/listItemSecondaryActionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemSecondaryAction/listItemSecondaryActionClasses", JSImport.Default)
  @js.native
  val default: ListItemSecondaryActionClasses = js.native
  
  inline def getListItemSecondaryActionClassesUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemSecondaryActionClassesUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ListItemSecondaryActionClassKey = "root" | "disableGutters"
  
  trait ListItemSecondaryActionClasses extends StObject {
    
    /** Styles applied to the root element when the parent `ListItem` has `disableGutters={true}`. */
    var disableGutters: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ListItemSecondaryActionClasses {
    
    inline def apply(disableGutters: String, root: String): ListItemSecondaryActionClasses = {
      val __obj = js.Dynamic.literal(disableGutters = disableGutters.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemSecondaryActionClasses]
    }
    
    extension [Self <: ListItemSecondaryActionClasses](x: Self) {
      
      inline def setDisableGutters(value: String): Self = StObject.set(x, "disableGutters", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
