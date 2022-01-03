package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapCard
import com.olvind.mui.muiMaterial.cardActionAreaClassesMod.CardActionAreaClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionAreaMod {
  
  @JSImport("@mui/material/CardActionArea", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  @JSImport("@mui/material/CardActionArea", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapCard | DefaultComponentPropsExtendButtonBaseTypAriaactivedescendant, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@mui/material/CardActionArea", "cardActionAreaClasses")
  @js.native
  val cardActionAreaClasses: CardActionAreaClasses = js.native
  
  @scala.inline
  def getCardActionAreaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionAreaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
