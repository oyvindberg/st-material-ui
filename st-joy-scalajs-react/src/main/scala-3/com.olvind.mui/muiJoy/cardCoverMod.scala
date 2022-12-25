package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCardCoverTypeMapdiv
import com.olvind.mui.muiJoy.cardCoverCardCoverClassesMod.CardCoverClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCoverMod {
  
  @JSImport("@mui/joy/CardCover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/CardCover", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardCoverTypeMapdiv, Element | Null] = js.native
  
  @JSImport("@mui/joy/CardCover", "cardCoverClasses")
  @js.native
  val cardCoverClasses: CardCoverClasses = js.native
  
  inline def getCardCoverUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardCoverUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
