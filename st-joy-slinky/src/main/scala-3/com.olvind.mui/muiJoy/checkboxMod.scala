package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCheckboxTypeMapspan
import com.olvind.mui.muiJoy.checkboxCheckboxClassesMod.CheckboxClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxMod {
  
  @JSImport("@mui/joy/Checkbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Checkbox", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCheckboxTypeMapspan, Element | Null] = js.native
  
  @JSImport("@mui/joy/Checkbox", "checkboxClasses")
  @js.native
  val checkboxClasses: CheckboxClasses = js.native
  
  inline def getCheckboxUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCheckboxUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
