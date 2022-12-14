package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaautocomplete
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapIcon
import com.olvind.mui.muiMaterial.anon.`12`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonIconButtonMod extends Shortcut {
  
  /**
    * Refer to the [Icons](https://mui.com/material-ui/icons/) section of the documentation
    * regarding the available icon options.
    *
    * Demos:
    *
    * - [Button](https://mui.com/material-ui/react-button/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/material-ui/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/IconButton/IconButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    Element | Null
  ] = js.native
  
  type IconButtonProps[D /* <: ElementType */, P] = OverrideProps[IconButtonTypeMap[P, D], D]
  
  trait IconButtonPropsColorOverrides extends StObject
  
  trait IconButtonPropsSizeOverrides extends StObject
  
  type IconButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[`12`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `iconButtonIconButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    Element | Null
  ] = default
}
