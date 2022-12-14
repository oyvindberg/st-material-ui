package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.cardActionsCardActionsClassesMod.CardActionsClasses
import com.olvind.mui.muiMaterial.cardActionsCardActionsMod.CardActionsProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardActionsMod {
  
  @JSImport("@mui/material/CardActions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CardActionsProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/CardActions", "cardActionsClasses")
  @js.native
  val cardActionsClasses: CardActionsClasses = js.native
  
  inline def getCardActionsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardActionsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
