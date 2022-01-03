package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolspan
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTogg
import com.olvind.mui.muiMaterial.anon.`36`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    ReactElement | Null
  ] = js.native
  
  type ToggleButtonProps[D /* <: ReactElement */, P] = OverrideProps[ToggleButtonTypeMap[P, D], D]
  
  @js.native
  trait ToggleButtonPropsColorOverrides extends StObject
  
  @js.native
  trait ToggleButtonPropsSizeOverrides extends StObject
  
  type ToggleButtonTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`36`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `toggleButtonToggleButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
    ReactElement | Null
  ] = default
}
