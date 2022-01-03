package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionClassesMod {
  
  @JSImport("@mui/material/Accordion/accordionClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Accordion/accordionClasses", JSImport.Default)
  @js.native
  val default: AccordionClasses = js.native
  
  @scala.inline
  def getAccordionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.rounded
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.expanded
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.gutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.region
  */
  trait AccordionClassKey extends StObject
  
  @js.native
  trait AccordionClasses extends StObject {
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String = js.native
    
    /** State class applied to the root element if `expanded={true}`. */
    var expanded: String = js.native
    
    /** Styles applied to the root element unless `disableGutters={true}`. */
    var gutters: String = js.native
    
    /** Styles applied to the region element, the container of the children. */
    var region: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element unless `square={true}`. */
    var rounded: String = js.native
  }
  object AccordionClasses {
    
    @scala.inline
    def apply(disabled: String, expanded: String, gutters: String, region: String, root: String, rounded: String): AccordionClasses = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rounded = rounded.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionClasses]
    }
    
    @scala.inline
    implicit class AccordionClassesMutableBuilder[Self <: AccordionClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRounded(value: String): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    }
  }
}
