package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputLabelTypeMapla
import com.olvind.mui.muiMaterial.inputLabelInputLabelClassesMod.InputLabelClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelMod {
  
  @JSImport("@mui/material/InputLabel", JSImport.Namespace)
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
    * - [InputLabel API](https://mui.com/material-ui/api/input-label/)
    * - inherits [FormLabel API](https://mui.com/material-ui/api/form-label/)
    */
  @JSImport("@mui/material/InputLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputLabelTypeMapla, Element] = js.native
  
  inline def getInputLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/InputLabel", "inputLabelClasses")
  @js.native
  val inputLabelClasses: InputLabelClasses = js.native
}
