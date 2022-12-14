package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaperTypeMapdiv
import com.olvind.mui.muiMaterial.paperPaperClassesMod.PaperClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperMod {
  
  @JSImport("@mui/material/Paper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Card](https://mui.com/material-ui/react-card/)
    * - [Paper](https://mui.com/material-ui/react-paper/)
    *
    * API:
    *
    * - [Paper API](https://mui.com/material-ui/api/paper/)
    */
  @JSImport("@mui/material/Paper", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = js.native
  
  inline def getPaperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Paper", "paperClasses")
  @js.native
  val paperClasses: PaperClasses = js.native
}
