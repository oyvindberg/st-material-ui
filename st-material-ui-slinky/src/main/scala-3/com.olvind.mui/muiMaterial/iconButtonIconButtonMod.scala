package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaautocomplete
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapIcon
import com.olvind.mui.muiMaterial.anon.`11`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonMod extends Shortcut {
  
  /**
    * Refer to the [Icons](https://mui.com/components/icons/) section of the documentation
    * regarding the available icon options.
    *
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/IconButton/IconButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    ReactElement | Null
  ] = js.native
  
  type IconButtonProps[D /* <: ReactElement */, P] = OverrideProps[IconButtonTypeMap[P, D], D]
  
  trait IconButtonPropsColorOverrides extends StObject
  
  trait IconButtonPropsSizeOverrides extends StObject
  
  type IconButtonTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`11`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonIconButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    ReactElement | Null
  ] = default
}
