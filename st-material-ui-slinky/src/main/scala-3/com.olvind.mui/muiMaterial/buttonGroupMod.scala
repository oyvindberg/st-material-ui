package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsButtonGroupTypeMapd
import com.olvind.mui.muiMaterial.buttonGroupButtonGroupClassesMod.ButtonGroupClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonGroupMod {
  
  @JSImport("@mui/material/ButtonGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/material-ui/react-button-group/)
    *
    * API:
    *
    * - [ButtonGroup API](https://mui.com/material-ui/api/button-group/)
    */
  @JSImport("@mui/material/ButtonGroup", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsButtonGroupTypeMapd, Element] = js.native
  
  @JSImport("@mui/material/ButtonGroup", "buttonGroupClasses")
  @js.native
  val buttonGroupClasses: ButtonGroupClasses = js.native
  
  inline def getButtonGroupUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonGroupUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
