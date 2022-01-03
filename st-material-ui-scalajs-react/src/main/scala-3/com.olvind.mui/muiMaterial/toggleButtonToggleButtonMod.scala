package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolspan
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTogg
import com.olvind.mui.muiMaterial.anon.`36`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonToggleButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
    Element | Null
  ] = js.native
  
  type ToggleButtonProps[D /* <: ElementType */, P] = OverrideProps[ToggleButtonTypeMap[P, D], D]
  
  trait ToggleButtonPropsColorOverrides extends StObject
  
  trait ToggleButtonPropsSizeOverrides extends StObject
  
  type ToggleButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[`36`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `toggleButtonToggleButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
    Element | Null
  ] = default
}
