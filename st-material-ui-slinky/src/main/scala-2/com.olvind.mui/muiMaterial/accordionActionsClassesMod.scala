package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionActionsClassesMod {
  
  @JSImport("@mui/material/AccordionActions/accordionActionsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AccordionActions/accordionActionsClasses", JSImport.Default)
  @js.native
  val default: AccordionActionsClasses = js.native
  
  @scala.inline
  def getAccordionActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.spacing
  */
  trait AccordionActionsClassKey extends StObject
  
  @js.native
  trait AccordionActionsClasses extends StObject {
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element unless `disableSpacing={true}`. */
    var spacing: String = js.native
  }
  object AccordionActionsClasses {
    
    @scala.inline
    def apply(root: String, spacing: String): AccordionActionsClasses = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionActionsClasses]
    }
    
    @scala.inline
    implicit class AccordionActionsClassesMutableBuilder[Self <: AccordionActionsClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: String): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
}
