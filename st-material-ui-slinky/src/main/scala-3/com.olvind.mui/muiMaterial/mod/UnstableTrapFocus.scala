package com.olvind.mui.muiMaterial.mod

import com.olvind.mui.muiBase.focusTrapFocusTrapDottypesMod.FocusTrapProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableTrapFocus {
  
  /**
    * Utility component that locks focus inside the component.
    *
    * Demos:
    *
    * - [Focus Trap](https://mui.com/base/react-focus-trap/)
    *
    * API:
    *
    * - [FocusTrap API](https://mui.com/base/react-focus-trap/components-api/#focus-trap)
    */
  inline def apply(props: FocusTrapProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@mui/material", "Unstable_TrapFocus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material", "Unstable_TrapFocus.propTypes")
  @js.native
  def propTypes: Any = js.native
  inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
