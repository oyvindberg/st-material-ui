package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.speedDialIconClassesMod.SpeedDialIconClasses
import com.olvind.mui.muiMaterial.speedDialIconSpeedDialIconMod.SpeedDialIconProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedDialIconMod {
  
  @JSImport("@mui/material/SpeedDialIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Speed Dial](https://mui.com/components/speed-dial/)
    *
    * API:
    *
    * - [SpeedDialIcon API](https://mui.com/api/speed-dial-icon/)
    */
  /* Inlined (props : @mui/material.@mui/material/SpeedDialIcon/SpeedDialIcon.SpeedDialIconProps): react.react.<global>.JSX.Element & {  muiName :string} */
  object default {
    
    @scala.inline
    def apply(props: SpeedDialIconProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/SpeedDialIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/SpeedDialIcon", "default.muiName")
    @js.native
    def muiName: String = js.native
    @scala.inline
    def muiName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("muiName")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def getSpeedDialIconUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeedDialIconUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/SpeedDialIcon", "speedDialIconClasses")
  @js.native
  val speedDialIconClasses: SpeedDialIconClasses = js.native
}
