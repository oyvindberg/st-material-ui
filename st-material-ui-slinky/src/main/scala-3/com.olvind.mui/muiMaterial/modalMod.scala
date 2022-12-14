package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.modalUnstyledModalUnstyledClassesMod.ModalUnstyledClasses
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendModalUnstyled
import com.olvind.mui.muiMaterial.modalModalMod.ModalClasses_
import com.olvind.mui.muiMaterial.modalModalMod.ModalRootProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.ReactComponentClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("@mui/material/Modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Modal is a lower-level construct that is leveraged by the following components:
    *
    * *   [Dialog](https://mui.com/material-ui/api/dialog/)
    * *   [Drawer](https://mui.com/material-ui/api/drawer/)
    * *   [Menu](https://mui.com/material-ui/api/menu/)
    * *   [Popover](https://mui.com/material-ui/api/popover/)
    *
    * If you are creating a modal dialog, you probably want to use the [Dialog](https://mui.com/material-ui/api/dialog/) component
    * rather than directly using Modal.
    *
    * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
    *
    * Demos:
    *
    * - [Modal](https://mui.com/material-ui/react-modal/)
    *
    * API:
    *
    * - [Modal API](https://mui.com/material-ui/api/modal/)
    */
  @JSImport("@mui/material/Modal", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element | Null] = js.native
  
  @JSImport("@mui/material/Modal", "ModalManager")
  @js.native
  open class ModalManager ()
    extends com.olvind.mui.muiBase.modalUnstyledMod.ModalManager
  
  @JSImport("@mui/material/Modal", "ModalRoot")
  @js.native
  val ModalRoot: ReactComponentClass[ModalRootProps] = js.native
  
  inline def ariaHidden(element: org.scalajs.dom.Element, show: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ariaHidden")(element.asInstanceOf[js.Any], show.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getModalUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getModalUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/Modal", "modalClasses")
  @js.native
  val modalClasses: ModalClasses_ = js.native
  
  @JSImport("@mui/material/Modal", "modalUnstyledClasses")
  @js.native
  val modalUnstyledClasses: ModalUnstyledClasses = js.native
}
