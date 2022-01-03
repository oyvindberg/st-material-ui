package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriacolspan
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapTogg
import com.olvind.mui.muiMaterial.toggleButtonClassesMod.ToggleButtonClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleButtonMod {
  
  @JSImport("@mui/material/ToggleButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Toggle Button](https://mui.com/components/toggle-button/)
    *
    * API:
    *
    * - [ToggleButton API](https://mui.com/api/toggle-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/ToggleButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapTogg | DefaultComponentPropsExtendButtonBaseTypAriacolspan, 
    ReactElement | Null
  ] = js.native
  
  @scala.inline
  def getToggleButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getToggleButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ToggleButton", "toggleButtonClasses")
  @js.native
  val toggleButtonClasses: ToggleButtonClasses = js.native
}
