package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponent
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTyp
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapAcco
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryAccordionSummaryMod extends Shortcut {
  
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
  @JSImport("@mui/material/AccordionSummary/AccordionSummary", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    ReactElement | Null
  ] = js.native
  
  type AccordionSummaryProps[D /* <: ReactElement */, P] = OverrideProps[AccordionSummaryTypeMap[P, D], D]
  
  type AccordionSummaryTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[DefaultComponent[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSummaryAccordionSummaryMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    ReactElement | Null
  ] = default
}
