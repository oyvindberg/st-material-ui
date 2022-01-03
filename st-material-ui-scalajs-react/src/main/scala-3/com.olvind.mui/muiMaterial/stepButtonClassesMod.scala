package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonClassesMod {
  
  @JSImport("@mui/material/StepButton/stepButtonClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/StepButton/stepButtonClasses", JSImport.Default)
  @js.native
  val default: StepButtonClasses = js.native
  
  inline def getStepButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.horizontal
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.touchRipple
  */
  trait StepButtonClassKey extends StObject
  
  trait StepButtonClasses extends StObject {
    
    /** Styles applied to the root element if `orientation="horizontal"`. */
    var horizontal: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the `ButtonBase` touch-ripple. */
    var touchRipple: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object StepButtonClasses {
    
    inline def apply(horizontal: String, root: String, touchRipple: String, vertical: String): StepButtonClasses = {
      val __obj = js.Dynamic.literal(horizontal = horizontal.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], touchRipple = touchRipple.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepButtonClasses]
    }
    
    extension [Self <: StepButtonClasses](x: Self) {
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setTouchRipple(value: String): Self = StObject.set(x, "touchRipple", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
