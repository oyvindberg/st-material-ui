package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsStackTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackStackMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Stack](https://mui.com/joy-ui/react-stack/)
    *
    * API:
    *
    * - [Stack API](https://mui.com/joy-ui/api/stack/)
    */
  @JSImport("@mui/joy/Stack/Stack", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element | Null] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `stackStackMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element | Null] = default
}
