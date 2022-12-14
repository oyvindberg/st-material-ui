package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsLinearProgressTypeM
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearProgressLinearProgressMod extends Shortcut {
  
  /**
    * ## ARIA
    *
    * If the progress bar is describing the loading progress of a particular region of a page,
    * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
    * attribute to `true` on that region until it has finished loading.
    *
    * Demos:
    *
    * - [Linear Progress](https://mui.com/joy-ui/react-linear-progress/)
    *
    * API:
    *
    * - [LinearProgress API](https://mui.com/joy-ui/api/linear-progress/)
    */
  @JSImport("@mui/joy/LinearProgress/LinearProgress", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsLinearProgressTypeM, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsLinearProgressTypeM, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `linearProgressLinearProgressMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsLinearProgressTypeM, Element | Null] = default
}
