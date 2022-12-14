package com.olvind.mui.muiMaterial

import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generateUtilityClassesMod {
  
  @JSImport("@mui/material/generateUtilityClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: String */](componentName: String, slots: js.Array[T]): Record[T, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any], slots.asInstanceOf[js.Any])).asInstanceOf[Record[T, String]]
  inline def default[T /* <: String */](componentName: String, slots: js.Array[T], globalStatePrefix: String): Record[T, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(componentName.asInstanceOf[js.Any], slots.asInstanceOf[js.Any], globalStatePrefix.asInstanceOf[js.Any])).asInstanceOf[Record[T, String]]
}
