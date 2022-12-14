package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuMenuClassesMod {
  
  @JSImport("@mui/material/Menu/menuClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Menu/menuClasses", JSImport.Default)
  @js.native
  val default: MenuClasses = js.native
  
  inline def getMenuUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type MenuClassKey = "root" | "paper" | "list"
  
  trait MenuClasses extends StObject {
    
    /** Styles applied to the List component via `MenuList`. */
    var list: String
    
    /** Styles applied to the Paper component. */
    var paper: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object MenuClasses {
    
    inline def apply(list: String, paper: String, root: String): MenuClasses = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], paper = paper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuClasses]
    }
    
    extension [Self <: MenuClasses](x: Self) {
      
      inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setPaper(value: String): Self = StObject.set(x, "paper", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
