package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionClassesMod {
  
  @JSImport("@mui/material/BottomNavigationAction/bottomNavigationActionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/BottomNavigationAction/bottomNavigationActionClasses", JSImport.Default)
  @js.native
  val default: BottomNavigationActionClasses = js.native
  
  inline def getBottomNavigationActionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomNavigationActionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.selected
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.iconOnly
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.label
  */
  trait BottomNavigationActionClassKey extends StObject
  
  trait BottomNavigationActionClasses extends StObject {
    
    /** State class applied to the root element if `showLabel={false}` and not selected. */
    var iconOnly: String
    
    /** Styles applied to the label's span element. */
    var label: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** State class applied to the root element if selected. */
    var selected: String
  }
  object BottomNavigationActionClasses {
    
    inline def apply(iconOnly: String, label: String, root: String, selected: String): BottomNavigationActionClasses = {
      val __obj = js.Dynamic.literal(iconOnly = iconOnly.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomNavigationActionClasses]
    }
    
    extension [Self <: BottomNavigationActionClasses](x: Self) {
      
      inline def setIconOnly(value: String): Self = StObject.set(x, "iconOnly", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: String): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
