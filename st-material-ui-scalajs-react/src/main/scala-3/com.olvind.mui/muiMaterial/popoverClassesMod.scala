package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverClassesMod {
  
  @JSImport("@mui/material/Popover/popoverClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Popover/popoverClasses", JSImport.Default)
  @js.native
  val default: PopoverClasses = js.native
  
  inline def getPopoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.paper
  */
  trait PopoverClassKey extends StObject
  
  trait PopoverClasses extends StObject {
    
    /** Styles applied to the Paper component. */
    var paper: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object PopoverClasses {
    
    inline def apply(paper: String, root: String): PopoverClasses = {
      val __obj = js.Dynamic.literal(paper = paper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverClasses]
    }
    
    extension [Self <: PopoverClasses](x: Self) {
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
