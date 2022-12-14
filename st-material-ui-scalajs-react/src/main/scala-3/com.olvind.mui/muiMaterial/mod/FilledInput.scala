package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.filledInputFilledInputMod.FilledInputProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Demos:
  *
  * - [Text Field](https://mui.com/material-ui/react-text-field/)
  *
  * API:
  *
  * - [FilledInput API](https://mui.com/material-ui/api/filled-input/)
  * - inherits [InputBase API](https://mui.com/material-ui/api/input-base/)
  */
/* Inlined (props : @mui/material.@mui/material/FilledInput/FilledInput.FilledInputProps): react.react.<global>.JSX.Element & {  muiName :string} */
object FilledInput {
  
  inline def apply(props: FilledInputProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "FilledInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "FilledInput.muiName")
  @js.native
  def muiName: String = js.native
  inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}
