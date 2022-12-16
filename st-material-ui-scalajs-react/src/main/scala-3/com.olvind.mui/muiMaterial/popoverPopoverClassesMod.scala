package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverPopoverClassesMod {
  
  @JSImport("@mui/material/Popover/popoverClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Popover/popoverClasses", JSImport.Default)
  @js.native
  val default: PopoverClasses = js.native
  
  inline def getPopoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type PopoverClassKey = "root" | "paper"
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverClasses] (val x: Self) extends AnyVal {
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
