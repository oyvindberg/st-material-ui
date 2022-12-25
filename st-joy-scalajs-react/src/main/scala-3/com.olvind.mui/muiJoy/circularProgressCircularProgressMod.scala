package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsCircularProgressTyp
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circularProgressCircularProgressMod extends Shortcut {
  
  /**
    * ## ARIA
    *
    * If the progress bar is describing the loading progress of a particular region of a page,
    * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
    * attribute to `true` on that region until it has finished loading.
    */
  @JSImport("@mui/joy/CircularProgress/CircularProgress", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsCircularProgressTyp, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsCircularProgressTyp, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `circularProgressCircularProgressMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsCircularProgressTyp, Element | Null] = default
}
