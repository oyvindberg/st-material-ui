package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.accordionAccordionMod.AccordionProps
import com.olvind.mui.muiMaterial.accordionClassesMod.AccordionClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("@mui/material/Accordion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: AccordionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Accordion", "accordionClasses")
  @js.native
  val accordionClasses: AccordionClasses = js.native
  
  inline def getAccordionUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
