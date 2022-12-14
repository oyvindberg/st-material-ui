package com.olvind.mui.muiMaterial

import com.olvind.mui.react.mod.Context
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepStepContextMod {
  
  @JSImport("@mui/material/Step/StepContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides information about the current step in Stepper.
    */
  @JSImport("@mui/material/Step/StepContext", JSImport.Default)
  @js.native
  val default: Context[js.Object | StepContextType] = js.native
  
  inline def useStepContext(): StepContextType | js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("useStepContext")().asInstanceOf[StepContextType | js.Object]
  
  trait StepContextType extends StObject {
    
    var active: Boolean
    
    var completed: Boolean
    
    var disabled: Boolean
    
    var expanded: Boolean
    
    var icon: ReactElement
    
    var index: Double
    
    var last: Boolean
  }
  object StepContextType {
    
    inline def apply(
      active: Boolean,
      completed: Boolean,
      disabled: Boolean,
      expanded: Boolean,
      icon: ReactElement,
      index: Double,
      last: Boolean
    ): StepContextType = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepContextType]
    }
    
    extension [Self <: StepContextType](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: ReactElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    }
  }
}
