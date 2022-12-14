package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.speedDialIconSpeedDialIconClassesMod.SpeedDialIconClasses
import com.olvind.mui.muiMaterial.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialIconMod {
  
  @JSImport("@mui/material/SpeedDialIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Speed Dial](https://mui.com/material-ui/react-speed-dial/)
    *
    * API:
    *
    * - [SpeedDialIcon API](https://mui.com/material-ui/api/speed-dial-icon/)
    */
  /* Inlined (props : @mui/material.@mui/material/SpeedDialIcon/SpeedDialIcon.SpeedDialIconProps): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    inline def apply(props: SpeedDialIconProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/SpeedDialIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/SpeedDialIcon", "default.muiName")
    @js.native
    def muiName: String = js.native
    inline def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  inline def getSpeedDialIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/SpeedDialIcon", "speedDialIconClasses")
  @js.native
  val speedDialIconClasses: SpeedDialIconClasses = js.native
}
