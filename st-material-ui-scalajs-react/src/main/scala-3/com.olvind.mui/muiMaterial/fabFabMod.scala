package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaatomic
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapFabT
import com.olvind.mui.muiMaterial.anon.`10`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabFabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Floating Action Button](https://mui.com/material-ui/react-floating-action-button/)
    *
    * API:
    *
    * - [Fab API](https://mui.com/material-ui/api/fab/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/Fab/Fab", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    Element | Null
  ] = js.native
  
  type FabProps[D /* <: ElementType */, P] = OverrideProps[FabTypeMap[P, D], D]
  
  trait FabPropsColorOverrides extends StObject
  
  trait FabPropsSizeOverrides extends StObject
  
  trait FabPropsVariantOverrides extends StObject
  
  type FabTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[`10`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `fabFabMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    Element | Null
  ] = default
}
