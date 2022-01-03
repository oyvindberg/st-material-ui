package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.outlinedInputClassesMod.OutlinedInputClasses
import com.olvind.mui.muiMaterial.outlinedInputOutlinedInputMod.OutlinedInputProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outlinedInputMod {
  
  @JSImport("@mui/material/OutlinedInput", JSImport.Namespace)
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
    * - [OutlinedInput API](https://mui.com/api/outlined-input/)
    * - inherits [InputBase API](https://mui.com/api/input-base/)
    */
  /* Inlined (props : @mui/material.@mui/material/OutlinedInput/OutlinedInput.OutlinedInputProps): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: OutlinedInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/OutlinedInput", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/OutlinedInput", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  inline def getOutlinedInputUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutlinedInputUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/OutlinedInput", "outlinedInputClasses")
  @js.native
  val outlinedInputClasses: OutlinedInputClasses = js.native
}
