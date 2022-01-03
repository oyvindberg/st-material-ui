package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardContentTypeMapd
import com.olvind.mui.muiMaterial.cardContentClassesMod.CardContentClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentMod {
  
  @JSImport("@mui/material/CardContent", JSImport.Namespace)
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
    * - [CardContent API](https://mui.com/api/card-content/)
    */
  @JSImport("@mui/material/CardContent", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element] = js.native
  
  @JSImport("@mui/material/CardContent", "cardContentClasses")
  @js.native
  val cardContentClasses: CardContentClasses = js.native
  
  @scala.inline
  def getCardContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
