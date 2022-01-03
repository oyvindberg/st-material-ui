package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.muiMaterialStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionDetailsClassesMod {
  
  @JSImport("@mui/material/AccordionDetails/accordionDetailsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AccordionDetails/accordionDetailsClasses", JSImport.Default)
  @js.native
  val default: AccordionDetailsClasses = js.native
  
  inline def getAccordionDetailsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionDetailsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AccordionDetailsClassKey = root
  
  trait AccordionDetailsClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String
  }
  object AccordionDetailsClasses {
    
    inline def apply(root: String): AccordionDetailsClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionDetailsClasses]
    }
    
    extension [Self <: AccordionDetailsClasses](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
