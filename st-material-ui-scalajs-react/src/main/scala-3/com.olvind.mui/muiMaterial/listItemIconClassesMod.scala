package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemIconClassesMod {
  
  @JSImport("@mui/material/ListItemIcon/listItemIconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/ListItemIcon/listItemIconClasses", JSImport.Default)
  @js.native
  val default: ListItemIconClasses = js.native
  
  inline def getListItemIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListItemIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.alignItemsFlexStart
  */
  trait ListItemIconClassKey extends StObject
  
  trait ListItemIconClasses extends StObject {
    
    /** Styles applied to the root element when the parent `ListItem` uses `alignItems="flex-start"`. */
    var alignItemsFlexStart: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ListItemIconClasses {
    
    inline def apply(alignItemsFlexStart: String, root: String): ListItemIconClasses = {
      val __obj = js.Dynamic.literal(alignItemsFlexStart = alignItemsFlexStart.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemIconClasses]
    }
    
    extension [Self <: ListItemIconClasses](x: Self) {
      
      inline def setAlignItemsFlexStart(value: String): Self = StObject.set(x, "alignItemsFlexStart", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
