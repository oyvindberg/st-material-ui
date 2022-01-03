package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolcount
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapStep
import com.olvind.mui.muiMaterial.stepButtonClassesMod.StepButtonClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonMod {
  
  @JSImport("@mui/material/StepButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Steppers](https://mui.com/components/steppers/)
    *
    * API:
    *
    * - [StepButton API](https://mui.com/api/step-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/StepButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    Element | Null
  ] = js.native
  
  @scala.inline
  def getStepButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStepButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/StepButton", "stepButtonClasses")
  @js.native
  val stepButtonClasses: StepButtonClasses = js.native
}
