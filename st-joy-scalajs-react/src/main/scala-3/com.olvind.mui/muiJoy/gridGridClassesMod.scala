package com.olvind.mui.muiJoy

import com.olvind.mui.muiSystem.unstableGridGridClassesMod.GridClasses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridGridClassesMod {
  
  @JSImport("@mui/joy/Grid/gridClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Grid/gridClasses", JSImport.Default)
  @js.native
  val default: GridClasses = js.native
  
  inline def getGridUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGridUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type GridClassKey = /* keyof @mui/system.@mui/system/Unstable_Grid/gridClasses.GridClasses */ "root" | "container" | "direction-xs-column" | "direction-xs-column-reverse" | "direction-xs-row-reverse" | "wrap-xs-nowrap" | "wrap-xs-wrap-reverse"
}
