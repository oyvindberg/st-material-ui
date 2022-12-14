package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.circularProgressCircularProgressClassesMod.CircularProgressClasses
import com.olvind.mui.muiMaterial.circularProgressCircularProgressMod.CircularProgressProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressMod {
  
  @JSImport("@mui/material/CircularProgress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CircularProgressProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material/CircularProgress", "circularProgressClasses")
  @js.native
  val circularProgressClasses: CircularProgressClasses = js.native
  
  inline def getCircularProgressUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCircularProgressUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
