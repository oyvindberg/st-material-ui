package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolcount
import com.olvind.mui.muiMaterial.anon.IgnoredProps
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapStep
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepButtonStepButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Stepper](https://mui.com/material-ui/react-stepper/)
    *
    * API:
    *
    * - [StepButton API](https://mui.com/material-ui/api/step-button/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/StepButton/StepButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    Element | Null
  ] = js.native
  
  type StepButtonClasskey = /* keyof std.NonNullable<@mui/material.anon.PartialStepButtonClasses | undefined & std.Partial<@mui/material.@mui/material/styles.ClassNameMap<never>> | undefined> */ String
  
  type StepButtonIcon = Node
  
  type StepButtonProps[D /* <: ElementType */, P] = OverrideProps[StepButtonTypeMap[P, D], D]
  
  type StepButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[IgnoredProps[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `stepButtonStepButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapStep | DefaultComponentPropsExtendButtonBaseTypAriacolcount, 
    Element | Null
  ] = default
}
