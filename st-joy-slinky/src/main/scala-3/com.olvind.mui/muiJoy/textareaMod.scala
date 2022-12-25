package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsTextareaTypeMapdiv
import com.olvind.mui.muiJoy.textareaTextareaClassesMod.TextareaClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaMod {
  
  @JSImport("@mui/joy/Textarea", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Textarea", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTextareaTypeMapdiv, Element | Null] = js.native
  
  inline def getTextareaUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTextareaUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Textarea", "textareaClasses")
  @js.native
  val textareaClasses: TextareaClasses = js.native
}
