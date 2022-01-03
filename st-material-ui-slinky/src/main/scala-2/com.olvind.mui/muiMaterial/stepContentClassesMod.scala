package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepContentClassesMod {
  
  @JSImport("@mui/material/StepContent/stepContentClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepContent/stepContentClasses", JSImport.Default)
  @js.native
  val default: StepContentClasses = js.native
  
  @scala.inline
  def getStepContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.last
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.transition
  */
  trait StepContentClassKey extends StObject
  
  @js.native
  trait StepContentClasses extends StObject {
    
    /** Styles applied to the root element if `last={true}` (controlled by `Step`). */
    var last: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the Transition component. */
    var transition: String = js.native
  }
  object StepContentClasses {
    
    @scala.inline
    def apply(last: String, root: String, transition: String): StepContentClasses = {
      val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepContentClasses]
    }
    
    @scala.inline
    implicit class StepContentClassesMutableBuilder[Self <: StepContentClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
}
