package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStackTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Stack](https://mui.com/material-ui/react-stack/)
    *
    * API:
    *
    * - [Stack API](https://mui.com/material-ui/api/stack/)
    */
  @JSImport("@mui/material/Stack", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `stackMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element] = default
}
