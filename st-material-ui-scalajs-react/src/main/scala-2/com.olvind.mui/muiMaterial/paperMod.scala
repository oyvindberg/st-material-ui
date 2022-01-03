package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsPaperTypeMapdiv
import com.olvind.mui.muiMaterial.paperClassesMod.PaperClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperMod {
  
  @JSImport("@mui/material/Paper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Cards](https://mui.com/components/cards/)
    * - [Paper](https://mui.com/components/paper/)
    *
    * API:
    *
    * - [Paper API](https://mui.com/api/paper/)
    */
  @JSImport("@mui/material/Paper", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsPaperTypeMapdiv, Element] = js.native
  
  @scala.inline
  def getPaperUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPaperUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Paper", "paperClasses")
  @js.native
  val paperClasses: PaperClasses = js.native
}
