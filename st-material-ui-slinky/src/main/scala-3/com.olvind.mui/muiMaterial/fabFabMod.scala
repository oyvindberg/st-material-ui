package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaatomic
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapFabT
import com.olvind.mui.muiMaterial.anon.`9`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabFabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Floating Action Button](https://mui.com/components/floating-action-button/)
    *
    * API:
    *
    * - [Fab API](https://mui.com/api/fab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/Fab/Fab", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    ReactElement | Null
  ] = js.native
  
  type FabProps[D /* <: ReactElement */, P] = OverrideProps[FabTypeMap[P, D], D]
  
  trait FabPropsColorOverrides extends StObject
  
  trait FabPropsSizeOverrides extends StObject
  
  trait FabPropsVariantOverrides extends StObject
  
  type FabTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`9`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `fabFabMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    ReactElement | Null
  ] = default
}
