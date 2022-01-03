package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAccessKey
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButt
import com.olvind.mui.muiMaterial.buttonClassesMod.ButtonClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("@mui/material/Button", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [Button API](https://mui.com/api/button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/Button", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@mui/material/Button", "buttonClasses")
  @js.native
  val buttonClasses: ButtonClasses = js.native
  
  @scala.inline
  def getButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
