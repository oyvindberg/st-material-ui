package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.inputInputClassesMod.InputClasses
import com.olvind.mui.muiMaterial.inputInputMod.InputProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@mui/material/Input", JSImport.Namespace)
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
    * - [Input API](https://mui.com/material-ui/api/input/)
    * - inherits [InputBase API](https://mui.com/material-ui/api/input-base/)
    */
  /* Inlined (props : @mui/material.@mui/material/Input/Input.InputProps): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: InputProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/Input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/Input", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  inline def getInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Input", "inputClasses")
  @js.native
  val inputClasses: InputClasses = js.native
}
