package com.olvind.mui.muiJoy

import com.olvind.mui.muiSystem.stackStackClassesMod.StackClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackStackClassesMod {
  
  @JSImport("@mui/joy/Stack/stackClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Stack/stackClasses", JSImport.Default)
  @js.native
  val default: StackClasses = js.native
  
  inline def getStackUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
