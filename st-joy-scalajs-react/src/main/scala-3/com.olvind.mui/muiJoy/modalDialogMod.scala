package com.olvind.mui.muiJoy

import com.olvind.mui.muiJoy.anon.DefaultComponentPropsModalDialogTypeMapd
import com.olvind.mui.muiJoy.modalDialogModalDialogClassesMod.ModalDialogClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalDialogMod {
  
  @JSImport("@mui/joy/ModalDialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Modal](https://mui.com/joy-ui/react-modal/)
    *
    * API:
    *
    * - [ModalDialog API](https://mui.com/joy-ui/api/modal-dialog/)
    */
  @JSImport("@mui/joy/ModalDialog", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsModalDialogTypeMapd, Element | Null] = js.native
  
  inline def getModalDialogUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalDialogUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/joy/ModalDialog", "modalDialogClasses")
  @js.native
  val modalDialogClasses: ModalDialogClasses = js.native
}
