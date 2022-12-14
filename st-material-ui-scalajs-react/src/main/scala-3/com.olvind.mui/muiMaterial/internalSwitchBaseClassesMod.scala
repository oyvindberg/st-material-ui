package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalSwitchBaseClassesMod {
  
  @JSImport("@mui/material/internal/switchBaseClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/internal/switchBaseClasses", JSImport.Default)
  @js.native
  val default: SwitchBaseClasses = js.native
  
  inline def getSwitchBaseUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSwitchBaseUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type SwitchBaseClassKey = "root" | "checked" | "disabled" | "input" | "edgeStart" | "edgeEnd"
  
  trait SwitchBaseClasses extends StObject {
    
    var checked: String
    
    var disabled: String
    
    var edgeEnd: String
    
    var edgeStart: String
    
    var input: String
    
    var root: String
  }
  object SwitchBaseClasses {
    
    inline def apply(checked: String, disabled: String, edgeEnd: String, edgeStart: String, input: String, root: String): SwitchBaseClasses = {
      val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], edgeEnd = edgeEnd.asInstanceOf[js.Any], edgeStart = edgeStart.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[SwitchBaseClasses]
    }
    
    extension [Self <: SwitchBaseClasses](x: Self) {
      
      inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEdgeEnd(value: String): Self = StObject.set(x, "edgeEnd", value.asInstanceOf[js.Any])
      
      inline def setEdgeStart(value: String): Self = StObject.set(x, "edgeStart", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
