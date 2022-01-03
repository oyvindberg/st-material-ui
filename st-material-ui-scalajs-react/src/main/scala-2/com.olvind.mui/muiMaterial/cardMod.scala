package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardTypeMapdiv
import com.olvind.mui.muiMaterial.cardClassesMod.CardClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@mui/material/Card", JSImport.Namespace)
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
    * - [Card API](https://mui.com/api/card/)
    * - inherits [Paper API](https://mui.com/api/paper/)
    */
  @JSImport("@mui/material/Card", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/Card", "cardClasses")
  @js.native
  val cardClasses: CardClasses = js.native
  
  @scala.inline
  def getCardUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
