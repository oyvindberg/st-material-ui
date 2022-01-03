package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabScrollButtonClassesMod {
  
  @JSImport("@mui/material/TabScrollButton/tabScrollButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/TabScrollButton/tabScrollButtonClasses", JSImport.Default)
  @js.native
  val default: TabScrollButtonClasses = js.native
  
  @scala.inline
  def getTabScrollButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabScrollButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
  */
  trait TabScrollButtonClassKey extends StObject
  
  @js.native
  trait TabScrollButtonClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String = js.native
  }
  object TabScrollButtonClasses {
    
    @scala.inline
    def apply(disabled: String, root: String, vertical: String): TabScrollButtonClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabScrollButtonClasses]
    }
    
    @scala.inline
    implicit class TabScrollButtonClassesMutableBuilder[Self <: TabScrollButtonClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
