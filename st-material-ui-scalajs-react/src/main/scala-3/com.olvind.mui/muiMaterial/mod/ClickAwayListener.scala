package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiBase.clickAwayListenerClickAwayListenerMod.ClickAwayListenerProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClickAwayListener {
  
  /**
    * Listen for click events that occur somewhere in the document, outside of the element itself.
    * For instance, if you need to hide a menu when people click anywhere else on your page.
    *
    * Demos:
    *
    * - [Click-Away Listener](https://mui.com/base/react-click-away-listener/)
    *
    * API:
    *
    * - [ClickAwayListener API](https://mui.com/base/api/click-away-listener/)
    */
  inline def apply(props: ClickAwayListenerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "ClickAwayListener")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "ClickAwayListener.propTypes")
  @js.native
  def propTypes: Any = js.native
  inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
