package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCardContentTypeMapd
import com.olvind.mui.muiJoy.cardContentCardContentClassesMod.CardContentClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardContentMod {
  
  @JSImport("@mui/joy/CardContent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/CardContent", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardContentTypeMapd, Element | Null] = js.native
  
  @JSImport("@mui/joy/CardContent", "cardContentClasses")
  @js.native
  val cardContentClasses: CardContentClasses = js.native
  
  inline def getCardContentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardContentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
