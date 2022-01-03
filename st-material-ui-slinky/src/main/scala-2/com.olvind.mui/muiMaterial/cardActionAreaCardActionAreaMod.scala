package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapCard
import com.olvind.mui.muiMaterial.anon.`5`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaCardActionAreaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    *
    * API:
    *
    * - [CardActionArea API](https://mui.com/api/card-action-area/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/CardActionArea/CardActionArea", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    ReactElement | Null
  ] = js.native
  
  type CardActionAreaProps[D /* <: ReactElement */, P] = OverrideProps[CardActionAreaTypeMap[P, D], D]
  
  type CardActionAreaTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`5`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionAreaCardActionAreaMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    ReactElement | Null
  ] = default
}
