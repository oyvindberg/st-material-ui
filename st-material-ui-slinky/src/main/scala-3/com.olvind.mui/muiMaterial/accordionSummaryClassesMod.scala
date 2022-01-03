package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryClassesMod {
  
  @JSImport("@mui/material/AccordionSummary/accordionSummaryClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/AccordionSummary/accordionSummaryClasses", JSImport.Default)
  @js.native
  val default: AccordionSummaryClasses = js.native
  
  inline def getAccordionSummaryUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionSummaryUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.expanded
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.focusVisible
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.disabled
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.gutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.contentGutters
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.content
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.expandIconWrapper
  */
  trait AccordionSummaryClassKey extends StObject
  
  trait AccordionSummaryClasses extends StObject {
    
    /** Styles applied to the children wrapper element. */
    var content: String
    
    /** Styles applied to the children wrapper element unless `disableGutters={true}`. */
    var contentGutters: String
    
    /** State class applied to the root element if `disabled={true}`. */
    var disabled: String
    
    /** Styles applied to the `expandIcon`'s wrapper element. */
    var expandIconWrapper: String
    
    /** State class applied to the root element, children wrapper element and `IconButton` component if `expanded={true}`. */
    var expanded: String
    
    /** State class applied to the ButtonBase root element if the button is keyboard focused. */
    var focusVisible: String
    
    /** Styles applied to the root element unless `disableGutters={true}`. */
    var gutters: String
    
    /** Styles applied to the root element. */
    var root: String
  }
  object AccordionSummaryClasses {
    
    inline def apply(
      content: String,
      contentGutters: String,
      disabled: String,
      expandIconWrapper: String,
      expanded: String,
      focusVisible: String,
      gutters: String,
      root: String
    ): AccordionSummaryClasses = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentGutters = contentGutters.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expandIconWrapper = expandIconWrapper.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], focusVisible = focusVisible.asInstanceOf[js.Any], gutters = gutters.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionSummaryClasses]
    }
    
    extension [Self <: AccordionSummaryClasses](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentGutters(value: String): Self = StObject.set(x, "contentGutters", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setExpandIconWrapper(value: String): Self = StObject.set(x, "expandIconWrapper", value.asInstanceOf[js.Any])
      
      inline def setExpanded(value: String): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setFocusVisible(value: String): Self = StObject.set(x, "focusVisible", value.asInstanceOf[js.Any])
      
      inline def setGutters(value: String): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
