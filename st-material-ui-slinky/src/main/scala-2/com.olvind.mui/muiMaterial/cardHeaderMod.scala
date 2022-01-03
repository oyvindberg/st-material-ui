package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardHeaderTypeMapdi
import com.olvind.mui.muiMaterial.cardHeaderClassesMod.CardHeaderClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod {
  
  @JSImport("@mui/material/CardHeader", JSImport.Namespace)
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
    * - [CardHeader API](https://mui.com/api/card-header/)
    */
  @JSImport("@mui/material/CardHeader", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardHeaderTypeMapdi, Element] = js.native
  
  @JSImport("@mui/material/CardHeader", "cardHeaderClasses")
  @js.native
  val cardHeaderClasses: CardHeaderClasses = js.native
  
  @scala.inline
  def getCardHeaderUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardHeaderUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
