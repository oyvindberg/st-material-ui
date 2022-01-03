package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.hiddenHiddenMod.HiddenProps
import com.olvind.mui.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenMod extends Shortcut {
  
  /**
    * Responsively hides children based on the selected implementation.
    *
    * Demos:
    *
    * - [Hidden](https://mui.com/components/hidden/)
    *
    * API:
    *
    * - [Hidden API](https://mui.com/api/hidden/)
    */
  @JSImport("@mui/material/Hidden", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[HiddenProps] = js.native
  
  type _To = JSXElementConstructor[HiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `hiddenMod.foo` */
  override def _to: JSXElementConstructor[HiddenProps] = default
}
