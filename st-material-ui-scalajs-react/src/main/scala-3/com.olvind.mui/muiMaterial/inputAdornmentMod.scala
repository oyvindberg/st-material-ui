package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputAdornmentTypeM
import com.olvind.mui.muiMaterial.inputAdornmentInputAdornmentClassesMod.InputAdornmentClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputAdornmentMod {
  
  @JSImport("@mui/material/InputAdornment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Text Field](https://mui.com/material-ui/react-text-field/)
    *
    * API:
    *
    * - [InputAdornment API](https://mui.com/material-ui/api/input-adornment/)
    */
  @JSImport("@mui/material/InputAdornment", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputAdornmentTypeM, Element] = js.native
  
  inline def getInputAdornmentUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputAdornmentUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/InputAdornment", "inputAdornmentClasses")
  @js.native
  val inputAdornmentClasses: InputAdornmentClasses = js.native
}
