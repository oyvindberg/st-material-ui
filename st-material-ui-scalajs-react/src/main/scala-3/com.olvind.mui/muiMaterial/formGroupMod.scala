package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.formGroupClassesMod.FormGroupClasses
import com.olvind.mui.muiMaterial.formGroupFormGroupMod.FormGroupProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupMod {
  
  @JSImport("@mui/material/FormGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FormGroupProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/FormGroup", "formGroupClasses")
  @js.native
  val formGroupClasses: FormGroupClasses = js.native
  
  inline def getFormGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
