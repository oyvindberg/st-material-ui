package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.mobileStepperClassesMod.MobileStepperClasses
import com.olvind.mui.muiMaterial.mobileStepperMobileStepperMod.MobileStepperProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileStepperMod {
  
  @JSImport("@mui/material/MobileStepper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: MobileStepperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @scala.inline
  def getMobileStepperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getMobileStepperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/MobileStepper", "mobileStepperClasses")
  @js.native
  val mobileStepperClasses: MobileStepperClasses = js.native
}
