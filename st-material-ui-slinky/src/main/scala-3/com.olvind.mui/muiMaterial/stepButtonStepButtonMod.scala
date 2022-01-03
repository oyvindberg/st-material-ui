package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolcount
import com.olvind.mui.muiMaterial.anon.IgnoredProps
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapStep
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonStepButtonMod extends Shortcut {
  
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
  @JSImport("@mui/material/StepButton/StepButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    ReactElement | Null
  ] = js.native
  
  type StepButtonClasskey = /* keyof std.NonNullable<@mui/material.anon.PartialStepButtonClasses | undefined & std.Partial<@mui/material.@mui/material/styles.ClassNameMap<never>> | undefined> */ String
  
  type StepButtonIcon = ReactElement
  
  type StepButtonProps[D /* <: ReactElement */, P] = OverrideProps[StepButtonTypeMap[P, D], D]
  
  type StepButtonTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[IgnoredProps[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonStepButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    ReactElement | Null
  ] = default
}
