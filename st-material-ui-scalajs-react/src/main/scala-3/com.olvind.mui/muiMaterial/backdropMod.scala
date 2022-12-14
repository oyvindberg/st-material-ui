package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBackdropTypeMapdiv
import com.olvind.mui.muiMaterial.backdropBackdropClassesMod.BackdropClasses
import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropRootProps
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropMod {
  
  @JSImport("@mui/material/Backdrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Backdrop](https://mui.com/material-ui/react-backdrop/)
    *
    * API:
    *
    * - [Backdrop API](https://mui.com/material-ui/api/backdrop/)
    * - inherits [Fade API](https://mui.com/material-ui/api/fade/)
    */
  @JSImport("@mui/material/Backdrop", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapdiv, Element] = js.native
  
  @JSImport("@mui/material/Backdrop", "BackdropRoot")
  @js.native
  val BackdropRoot: FC[BackdropRootProps] = js.native
  
  @JSImport("@mui/material/Backdrop", "backdropClasses")
  @js.native
  val backdropClasses: BackdropClasses = js.native
  
  inline def getBackdropUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackdropUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
}
