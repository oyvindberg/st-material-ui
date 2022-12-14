package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolindex
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTabT
import com.olvind.mui.muiMaterial.anon.`28`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabTabMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/material-ui/react-tabs/)
    *
    * API:
    *
    * - [Tab API](https://mui.com/material-ui/api/tab/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/Tab/Tab", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabT | DefaultComponentPropsExtendButtonBaseTypAriacolindex, 
    ReactElement | Null
  ] = js.native
  
  type TabProps[D /* <: ReactElement */, P] = OverrideProps[TabTypeMap[P, D], D]
  
  type TabTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`28`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabT | DefaultComponentPropsExtendButtonBaseTypAriacolindex, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tabTabMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTabT | DefaultComponentPropsExtendButtonBaseTypAriacolindex, 
    ReactElement | Null
  ] = default
}
