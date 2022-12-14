package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsCardMediaTypeMapdiv
import com.olvind.mui.muiMaterial.cardMediaCardMediaClassesMod.CardMediaClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMediaMod {
  
  @JSImport("@mui/material/CardMedia", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    *
    * API:
    *
    * - [CardMedia API](https://mui.com/material-ui/api/card-media/)
    */
  @JSImport("@mui/material/CardMedia", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCardMediaTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/CardMedia", "cardMediaClasses")
  @js.native
  val cardMediaClasses: CardMediaClasses = js.native
  
  inline def getCardMediaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCardMediaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
