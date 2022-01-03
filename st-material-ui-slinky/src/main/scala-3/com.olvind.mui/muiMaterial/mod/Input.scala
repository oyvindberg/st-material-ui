package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.inputInputMod.InputProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Demos:
  *
  * - [Text Fields](https://mui.com/components/text-fields/)
  *
  * API:
  *
  * - [Input API](https://mui.com/api/input/)
  * - inherits [InputBase API](https://mui.com/api/input-base/)
  */
/* Inlined (props : @mui/material.@mui/material/Input/Input.InputProps): react.react.<global>.JSX.Element & {  muiName :string} */
object Input {
  
  inline def apply(props: InputProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "Input")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "Input.muiName")
  @js.native
  def muiName: String = js.native
  inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}
