package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarToolbarClassesMod {
  
  @JSImport("@mui/material/Toolbar/toolbarClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Toolbar/toolbarClasses", JSImport.Default)
  @js.native
  val default: ToolbarClasses = js.native
  
  inline def getToolbarUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToolbarUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ToolbarClassKey = "root" | "gutters" | "regular" | "dense"
  
  trait ToolbarClasses extends StObject {
    
    /** Styles applied to the root element if `variant="dense"`. */
    var dense: String
    
    /** Styles applied to the root element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the root element if `variant="regular"`. */
    var regular: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object ToolbarClasses {
    
    inline def apply(dense: String, gutters: String, regular: String, root: String): ToolbarClasses = {
      val __obj = js.Dynamic.literal(dense = dense.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarClasses]
    }
    
    extension [Self <: ToolbarClasses](x: Self) {
      
      inline def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setRegular(value: String): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
