package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCardTypeMapdiv
import com.olvind.mui.muiJoy.cardCardClassesMod.CardClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@mui/joy/Card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/joy-ui/react-card/)
    *
    * API:
    *
    * - [Card API](https://mui.com/joy-ui/api/card/)
    */
  @JSImport("@mui/joy/Card", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/Card", "cardClasses")
  @js.native
  val cardClasses: CardClasses = js.native
  
  inline def getCardUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
