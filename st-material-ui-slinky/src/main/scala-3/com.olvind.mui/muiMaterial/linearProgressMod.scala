package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.linearProgressClassesMod.LinearProgressClasses
import com.olvind.mui.muiMaterial.linearProgressLinearProgressMod.LinearProgressProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressMod {
  
  @JSImport("@mui/material/LinearProgress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: LinearProgressProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getLinearProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLinearProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/LinearProgress", "linearProgressClasses")
  @js.native
  val linearProgressClasses: LinearProgressClasses = js.native
}
