package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchBaseClassesMod {
  
  @JSImport("@mui/material/internal/switchBaseClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/internal/switchBaseClasses", JSImport.Default)
  @js.native
  val default: SwitchBaseClasses = js.native
  
  @scala.inline
  def getSwitchBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.checked
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.input
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.edgeStart
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.edgeEnd
  */
  trait SwitchBaseClassKey extends StObject
  
  @js.native
  trait SwitchBaseClasses extends StObject {
    
    var checked: String = js.native
    
    var disabled: String = js.native
    
    var edgeEnd: String = js.native
    
    var edgeStart: String = js.native
    
    var input: String = js.native
    
    var root: String = js.native
  }
  object SwitchBaseClasses {
    
    @scala.inline
    def apply(checked: String, disabled: String, edgeEnd: String, edgeStart: String, input: String, root: String): SwitchBaseClasses = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], edgeEnd = edgeEnd.asInstanceOf[js.Any], edgeStart = edgeStart.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchBaseClasses]
    }
    
    @scala.inline
    implicit class SwitchBaseClassesMutableBuilder[Self <: SwitchBaseClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
