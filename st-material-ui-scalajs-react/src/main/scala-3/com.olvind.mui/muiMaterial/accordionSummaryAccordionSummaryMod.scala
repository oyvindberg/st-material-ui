package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponent
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTyp
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapAcco
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionSummaryAccordionSummaryMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Accordion](https://mui.com/components/accordion/)
    *
    * API:
    *
    * - [AccordionSummary API](https://mui.com/api/accordion-summary/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/AccordionSummary/AccordionSummary", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    Element | Null
  ] = js.native
  
  type AccordionSummaryProps[D /* <: ElementType */, P] = OverrideProps[AccordionSummaryTypeMap[P, D], D]
  
  type AccordionSummaryTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[DefaultComponent[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `accordionSummaryAccordionSummaryMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapAcco | DefaultComponentPropsExtendButtonBaseTyp, 
    Element | Null
  ] = default
}
