package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGrid2TypeMapdiv
import com.olvind.mui.muiSystem.unstableGridGridClassesMod.GridClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unstableGrid2Mod {
  
  @JSImport("@mui/material/Unstable_Grid2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Unstable_Grid2", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsGrid2TypeMapdiv, Element | Null] = js.native
  
  inline def getGrid2UtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGrid2UtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Unstable_Grid2", "grid2Classes")
  @js.native
  val grid2Classes: GridClasses = js.native
}
