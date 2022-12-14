package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.accordionSummaryAccordionSummaryClassesMod.AccordionSummaryClasses
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTyp
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapAcco
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryMod {
  
  @JSImport("@mui/material/AccordionSummary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Accordion](https://mui.com/material-ui/react-accordion/)
    *
    * API:
    *
    * - [AccordionSummary API](https://mui.com/material-ui/api/accordion-summary/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/AccordionSummary", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@mui/material/AccordionSummary", "accordionSummaryClasses")
  @js.native
  val accordionSummaryClasses: AccordionSummaryClasses = js.native
  
  inline def getAccordionSummaryUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionSummaryUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
