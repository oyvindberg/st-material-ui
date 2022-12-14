package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapCard
import com.olvind.mui.muiMaterial.anon.`4`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaCardActionAreaMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    *
    * API:
    *
    * - [CardActionArea API](https://mui.com/material-ui/api/card-action-area/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/CardActionArea/CardActionArea", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    Element | Null
  ] = js.native
  
  type CardActionAreaProps[D /* <: ElementType */, P] = OverrideProps[CardActionAreaTypeMap[P, D], D]
  
  type CardActionAreaTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[`4`[P, D]]
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `cardActionAreaCardActionAreaMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    Element | Null
  ] = default
}