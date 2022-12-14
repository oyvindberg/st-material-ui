package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionAccordionClassesMod {
  
  @JSImport("@mui/material/Accordion/accordionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Accordion/accordionClasses", JSImport.Default)
  @js.native
  val default: AccordionClasses = js.native
  
  inline def getAccordionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AccordionClassKey = "root" | "rounded" | "expanded" | "disabled" | "gutters" | "region"
  
  trait AccordionClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** State class applied to the root element if `expanded={true}`. */
    var expanded: String
    
    /** Styles applied to the root element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the region element, the container of the children. */
    var region: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the root element unless `square={true}`. */
    var rounded: String
  }
  object AccordionClasses {
    
    inline def apply(disabled: String, expanded: String, gutters: String, region: String, root: String, rounded: String): AccordionClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionClasses]
    }
    
    extension [Self <: AccordionClasses](x: Self) {
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    }
  }
}
