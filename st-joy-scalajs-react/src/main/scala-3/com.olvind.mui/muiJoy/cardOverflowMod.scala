package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCardOverflowTypeMap
import com.olvind.mui.muiJoy.cardOverflowCardOverflowClassesMod.CardOverflowClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardOverflowMod {
  
  @JSImport("@mui/joy/CardOverflow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/CardOverflow", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardOverflowTypeMap, Element | Null] = js.native
  
  @JSImport("@mui/joy/CardOverflow", "cardOverflowClasses")
  @js.native
  val cardOverflowClasses: CardOverflowClasses = js.native
  
  inline def getCardOverflowUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardOverflowUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
