package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAriaautocomplete
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapIcon
import com.olvind.mui.muiMaterial.iconButtonIconButtonClassesMod.IconButtonClasses
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconButtonMod {
  
  @JSImport("@mui/material/IconButton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Refer to the [Icons](https://mui.com/material-ui/icons/) section of the documentation
    * regarding the available icon options.
    *
    * Demos:
    *
    * - [Button](https://mui.com/material-ui/react-button/)
    *
    * API:
    *
    * - [IconButton API](https://mui.com/material-ui/api/icon-button/)
    * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/IconButton", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapIcon | DefaultComponentPropsExtendButtonBaseTypAriaautocomplete, 
    Element | Null
  ] = js.native
  
  inline def getIconButtonUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconButtonUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/IconButton", "iconButtonClasses")
  @js.native
  val iconButtonClasses: IconButtonClasses = js.native
}
