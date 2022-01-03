package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.formControlLabelClassesMod.FormControlLabelClasses
import com.olvind.mui.muiMaterial.formControlLabelFormControlLabelMod.FormControlLabelProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formControlLabelMod {
  
  @JSImport("@mui/material/FormControlLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FormControlLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/FormControlLabel", "formControlLabelClasses")
  @js.native
  val formControlLabelClasses: FormControlLabelClasses = js.native
  
  inline def getFormControlLabelUtilityClasses(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormControlLabelUtilityClasses")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
