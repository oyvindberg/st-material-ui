package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaautocomplete
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapIcon
import com.olvind.mui.muiMaterial.iconButtonClassesMod.IconButtonClasses
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  @JSImport("@mui/material/IconButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Refer to the [Icons](https://mui.com/components/icons/) section of the documentation
    * regarding the available icon options.
    *
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/IconButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    ReactElement | Null
  ] = js.native
  
  @scala.inline
  def getIconButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/IconButton", "iconButtonClasses")
  @js.native
  val iconButtonClasses: IconButtonClasses = js.native
}
