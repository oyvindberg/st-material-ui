package com.olvind.mui.muiJoy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabPanelTabPanelClassesMod {
  
  @JSImport("@mui/joy/TabPanel/tabPanelClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/TabPanel/tabPanelClasses", JSImport.Default)
  @js.native
  val default: TabPanelClasses = js.native
  
  inline def getTabPanelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabPanelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TabPanelClassKey = "root" | "hidden" | "sizeSm" | "sizeMd" | "sizeLg"
  
  trait TabPanelClasses extends StObject {
    
    /** Classname applied to the root element if the tab is not active. */
    var hidden: String
    
    /** Classname applied to the root element. */
    var root: String
    
    /** Classname applied to the root element if `size="lg"`. */
    var sizeLg: String
    
    /** Classname applied to the root element if `size="md"`. */
    var sizeMd: String
    
    /** Classname applied to the root element if `size="sm"`. */
    var sizeSm: String
  }
  object TabPanelClasses {
    
    inline def apply(hidden: String, root: String, sizeLg: String, sizeMd: String, sizeSm: String): TabPanelClasses = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], sizeLg = sizeLg.asInstanceOf[js.Any], sizeMd = sizeMd.asInstanceOf[js.Any], sizeSm = sizeSm.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabPanelClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabPanelClasses] (val x: Self) extends AnyVal {
      
      inline def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSizeLg(value: String): Self = StObject.set(x, "sizeLg", value.asInstanceOf[js.Any])
      
      inline def setSizeMd(value: String): Self = StObject.set(x, "sizeMd", value.asInstanceOf[js.Any])
      
      inline def setSizeSm(value: String): Self = StObject.set(x, "sizeSm", value.asInstanceOf[js.Any])
    }
  }
}
