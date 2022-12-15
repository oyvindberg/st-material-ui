package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsGridTypeMapdiv
import com.olvind.mui.muiMaterial.gridGridClassesMod.GridClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@mui/material/Grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Grid](https://mui.com/material-ui/react-grid/)
    *
    * API:
    *
    * - [Grid API](https://mui.com/material-ui/api/grid/)
    */
  @JSImport("@mui/material/Grid", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsGridTypeMapdiv, Element] = js.native
  
  inline def getGridUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGridUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Grid", "gridClasses")
  @js.native
  val gridClasses: GridClasses = js.native
}
