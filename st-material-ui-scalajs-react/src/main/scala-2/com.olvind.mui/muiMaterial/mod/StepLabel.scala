package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.stepLabelStepLabelMod.StepLabelProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Demos:
  *
  * - [Steppers](https://mui.com/components/steppers/)
  *
  * API:
  *
  * - [StepLabel API](https://mui.com/api/step-label/)
  */
/* Inlined (props : @mui/material.@mui/material/StepLabel/StepLabel.StepLabelProps): react.react.<global>.JSX.Element & {  muiName :string} */
object StepLabel {
  
  @scala.inline
  def apply(props: StepLabelProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "StepLabel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "StepLabel.muiName")
  @js.native
  def muiName: String = js.native
  @scala.inline
  def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}
