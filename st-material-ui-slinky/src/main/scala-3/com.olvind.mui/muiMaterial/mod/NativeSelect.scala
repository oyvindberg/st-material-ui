package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.nativeSelectNativeSelectMod.NativeSelectProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An alternative to `<Select native />` with a much smaller bundle size footprint.
  *
  * Demos:
  *
  * - [Select](https://mui.com/material-ui/react-select/)
  *
  * API:
  *
  * - [NativeSelect API](https://mui.com/material-ui/api/native-select/)
  * - inherits [Input API](https://mui.com/material-ui/api/input/)
  */
/* Inlined (props : @mui/material.@mui/material/NativeSelect/NativeSelect.NativeSelectProps): react.react.<global>.JSX.Element & {  muiName :string} */
object NativeSelect {
  
  inline def apply(props: NativeSelectProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "NativeSelect")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "NativeSelect.muiName")
  @js.native
  def muiName: String = js.native
  inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}
