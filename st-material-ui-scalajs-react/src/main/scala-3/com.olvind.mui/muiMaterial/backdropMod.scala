package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBackdropTypeMapspan
import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropClasses_
import com.olvind.mui.muiMaterial.backdropBackdropMod.BackdropRootProps
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Backdrop](https://mui.com/components/backdrop/)
    *
    * API:
    *
    * - [Backdrop API](https://mui.com/api/backdrop/)
    * - inherits [Fade API](https://mui.com/api/fade/)
    */
  @JSImport("@mui/material/Backdrop", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapspan, Element] = js.native
  
  @JSImport("@mui/material/Backdrop", "BackdropRoot")
  @js.native
  val BackdropRoot: FC[BackdropRootProps] = js.native
  
  @JSImport("@mui/material/Backdrop", "backdropClasses")
  @js.native
  val backdropClasses: BackdropClasses_ = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapspan, Element]
  
  /* This means you don't have to write `default`, but can instead just say `backdropMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBackdropTypeMapspan, Element] = default
}
