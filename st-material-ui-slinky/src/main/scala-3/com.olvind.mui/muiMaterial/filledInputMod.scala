package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.filledInputClassesMod.FilledInputClasses
import com.olvind.mui.muiMaterial.filledInputFilledInputMod.FilledInputProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filledInputMod {
  
  @JSImport("@mui/material/FilledInput", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Text Fields](https://mui.com/components/text-fields/)
    *
    * API:
    *
    * - [FilledInput API](https://mui.com/api/filled-input/)
    * - inherits [InputBase API](https://mui.com/api/input-base/)
    */
  /* Inlined (props : @mui/material.@mui/material/FilledInput/FilledInput.FilledInputProps): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: FilledInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/FilledInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/FilledInput", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@mui/material/FilledInput", "filledInputClasses")
  @js.native
  val filledInputClasses: FilledInputClasses = js.native
  
  inline def getFilledInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilledInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
