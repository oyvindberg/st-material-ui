package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.selectSelectClassesMod.SelectClasses
import com.olvind.mui.muiJoy.selectSelectMod.SelectComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@mui/joy/Select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/joy/Select", JSImport.Default)
  @js.native
  val default: SelectComponent = js.native
  
  inline def getSelectUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/Select", "selectClasses")
  @js.native
  val selectClasses: SelectClasses = js.native
}
