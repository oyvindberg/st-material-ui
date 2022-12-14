package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.accordionActionsAccordionActionsClassesMod.AccordionActionsClasses
import com.olvind.mui.muiMaterial.accordionActionsAccordionActionsMod.AccordionActionsProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionActionsMod {
  
  @JSImport("@mui/material/AccordionActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AccordionActionsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/AccordionActions", "accordionActionsClasses")
  @js.native
  val accordionActionsClasses: AccordionActionsClasses = js.native
  
  inline def getAccordionActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
