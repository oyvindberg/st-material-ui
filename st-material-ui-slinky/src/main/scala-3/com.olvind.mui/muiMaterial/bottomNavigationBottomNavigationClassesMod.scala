package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationBottomNavigationClassesMod {
  
  @JSImport("@mui/material/BottomNavigation/bottomNavigationClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/BottomNavigation/bottomNavigationClasses", JSImport.Default)
  @js.native
  val default: BottomNavigationClasses = js.native
  
  inline def getBottomNavigationUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomNavigationUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type BottomNavigationClassKey = "root"
  
  trait BottomNavigationClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object BottomNavigationClasses {
    
    inline def apply(root: String): BottomNavigationClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomNavigationClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BottomNavigationClasses] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
