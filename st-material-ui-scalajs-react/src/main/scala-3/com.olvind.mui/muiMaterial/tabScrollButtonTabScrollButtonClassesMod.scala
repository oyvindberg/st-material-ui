package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabScrollButtonTabScrollButtonClassesMod {
  
  @JSImport("@mui/material/TabScrollButton/tabScrollButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TabScrollButton/tabScrollButtonClasses", JSImport.Default)
  @js.native
  val default: TabScrollButtonClasses = js.native
  
  inline def getTabScrollButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabScrollButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TabScrollButtonClassKey = "root" | "vertical" | "disabled"
  
  trait TabScrollButtonClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object TabScrollButtonClasses {
    
    inline def apply(disabled: String, root: String, vertical: String): TabScrollButtonClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabScrollButtonClasses]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabScrollButtonClasses] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
