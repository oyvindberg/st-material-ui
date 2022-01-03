package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaatomic
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapFabT
import com.olvind.mui.muiMaterial.fabClassesMod.FabClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabMod {
  
  @JSImport("@mui/material/Fab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Floating Action Button](https://mui.com/components/floating-action-button/)
    *
    * API:
    *
    * - [Fab API](https://mui.com/api/fab/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/Fab", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapFabT | DefaultComponentPropsExtendButtonBaseTypAriaatomic, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@mui/material/Fab", "fabClasses")
  @js.native
  val fabClasses: FabClasses = js.native
  
  @scala.inline
  def getFabUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFabUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
