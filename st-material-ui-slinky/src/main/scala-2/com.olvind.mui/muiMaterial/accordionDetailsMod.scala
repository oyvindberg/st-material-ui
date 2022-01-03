package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.accordionDetailsAccordionDetailsMod.AccordionDetailsProps
import com.olvind.mui.muiMaterial.accordionDetailsClassesMod.AccordionDetailsClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionDetailsMod {
  
  @JSImport("@mui/material/AccordionDetails", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: AccordionDetailsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/AccordionDetails", "accordionDetailsClasses")
  @js.native
  val accordionDetailsClasses: AccordionDetailsClasses = js.native
  
  @scala.inline
  def getAccordionDetailsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccordionDetailsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
