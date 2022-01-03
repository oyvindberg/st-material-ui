package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.checkboxCheckboxMod.CheckboxProps
import com.olvind.mui.muiMaterial.checkboxClassesMod.CheckboxClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@mui/material/Checkbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: CheckboxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/Checkbox", "checkboxClasses")
  @js.native
  val checkboxClasses: CheckboxClasses = js.native
  
  @scala.inline
  def getCheckboxUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckboxUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
