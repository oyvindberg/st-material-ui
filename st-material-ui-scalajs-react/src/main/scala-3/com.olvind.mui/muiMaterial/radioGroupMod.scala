package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.radioGroupRadioGroupMod.RadioGroupProps
import com.olvind.mui.muiMaterial.useRadioGroupMod.RadioGroupState
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioGroupMod {
  
  @JSImport("@mui/material/RadioGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: RadioGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useRadioGroup(): js.UndefOr[RadioGroupState] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRadioGroup")().asInstanceOf[js.UndefOr[RadioGroupState]]
}
