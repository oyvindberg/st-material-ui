package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsFormHelperTextTypeM
import com.olvind.mui.muiJoy.formHelperTextFormHelperTextClassesMod.FormHelperTextClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formHelperTextMod {
  
  @JSImport("@mui/joy/FormHelperText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/FormHelperText", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormHelperTextTypeM, Element | Null] = js.native
  
  @JSImport("@mui/joy/FormHelperText", "formHelperTextClasses")
  @js.native
  val formHelperTextClasses: FormHelperTextClasses = js.native
  
  inline def getFormHelperTextUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormHelperTextUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
