package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.gridGridClassesMod.GridClasses
import com.olvind.mui.muiMaterial.gridGridMod.GridTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
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
  val default: OverridableComponent[GridTypeMap[js.Object, "div"]] = js.native
  
  inline def getGridUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGridUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Grid", "gridClasses")
  @js.native
  val gridClasses: GridClasses = js.native
}
