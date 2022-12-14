package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsInputLabelTypeMapla
import com.olvind.mui.muiMaterial.anon.`15`
import com.olvind.mui.muiMaterial.formLabelFormLabelMod.ExtendFormLabelTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelInputLabelMod extends Shortcut {
  
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
  @JSImport("@mui/material/InputLabel/InputLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsInputLabelTypeMapla, Element] = js.native
  
  type InputLabelProps[D /* <: ReactElement */, P] = OverrideProps[InputLabelTypeMap[P, D], D]
  
  trait InputLabelPropsSizeOverrides extends StObject
  
  type InputLabelTypeMap[P, D /* <: ReactElement */] = ExtendFormLabelTypeMap[`15`[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsInputLabelTypeMapla, Element]
  
  /* This means you don't have to write `default`, but can instead just say `inputLabelInputLabelMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsInputLabelTypeMapla, Element] = default
}
