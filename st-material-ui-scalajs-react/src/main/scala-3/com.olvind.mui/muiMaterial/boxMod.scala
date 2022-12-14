package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBoxTypeMapdiv
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Box](https://mui.com/material-ui/react-box/)
    *
    * API:
    *
    * - [Box API](https://mui.com/material-ui/api/box/)
    */
  @JSImport("@mui/material/Box", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = js.native
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `boxMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = default
}
