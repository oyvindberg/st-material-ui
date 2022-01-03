package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiMaterial.selectSelectMod.SelectProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Demos:
  *
  * - [Selects](https://mui.com/components/selects/)
  *
  * API:
  *
  * - [Select API](https://mui.com/api/select/)
  * - inherits [OutlinedInput API](https://mui.com/api/outlined-input/)
  */
/* Inlined <T>(props : @mui/material.@mui/material/Select/Select.SelectProps<T>): react.react.<global>.JSX.Element & {  muiName :string} */
object Select {
  
  inline def apply[T](props: SelectProps[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "Select")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "Select.muiName")
  @js.native
  def muiName: String = js.native
  inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
}
