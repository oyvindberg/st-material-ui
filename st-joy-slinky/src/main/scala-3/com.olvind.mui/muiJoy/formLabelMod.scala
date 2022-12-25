package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsFormLabelTypeMaplab
import com.olvind.mui.muiJoy.formLabelFormLabelClassesMod.FormLabelClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelMod {
  
  @JSImport("@mui/joy/FormLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/FormLabel", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsFormLabelTypeMaplab, Element | Null] = js.native
  
  @JSImport("@mui/joy/FormLabel", "formLabelClasses")
  @js.native
  val formLabelClasses: FormLabelClasses = js.native
  
  inline def getFormLabelUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormLabelUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
