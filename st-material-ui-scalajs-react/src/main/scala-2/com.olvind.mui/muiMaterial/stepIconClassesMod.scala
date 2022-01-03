package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepIconClassesMod {
  
  @JSImport("@mui/material/StepIcon/stepIconClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepIcon/stepIconClasses", JSImport.Default)
  @js.native
  val default: StepIconClasses = js.native
  
  @scala.inline
  def getStepIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.text
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.active
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.completed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.error
  */
  trait StepIconClassKey extends StObject
  
  @js.native
  trait StepIconClasses extends StObject {
    
    /** State class applied to the root element if `active={true}`. */
    var active: String = js.native
    
    /** State class applied to the root element if `completed={true}`. */
    var completed: String = js.native
    
    /** State class applied to the root element if `error={true}`. */
    var error: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the SVG text element. */
    var text: String = js.native
  }
  object StepIconClasses {
    
    @scala.inline
    def apply(active: String, completed: String, error: String, root: String, text: String): StepIconClasses = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepIconClasses]
    }
    
    @scala.inline
    implicit class StepIconClassesMutableBuilder[Self <: StepIconClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
