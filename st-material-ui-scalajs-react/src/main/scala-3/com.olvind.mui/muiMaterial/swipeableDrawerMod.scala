package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.swipeableDrawerSwipeableDrawerMod.SwipeableDrawerProps
import com.olvind.mui.react.mod.JSXElementConstructor
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeableDrawerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Drawers](https://mui.com/components/drawers/)
    *
    * API:
    *
    * - [SwipeableDrawer API](https://mui.com/api/swipeable-drawer/)
    * - inherits [Drawer API](https://mui.com/api/drawer/)
    */
  @JSImport("@mui/material/SwipeableDrawer", JSImport.Default)
  @js.native
  val default: JSXElementConstructor[SwipeableDrawerProps] = js.native
  
  type _To = JSXElementConstructor[SwipeableDrawerProps]
  
  /* This means you don't have to write `default`, but can instead just say `swipeableDrawerMod.foo` */
  override def _to: JSXElementConstructor[SwipeableDrawerProps] = default
}
