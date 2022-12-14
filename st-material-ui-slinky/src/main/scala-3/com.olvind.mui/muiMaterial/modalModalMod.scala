package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.modalUnstyledModalUnstyledDottypesMod.ExtendModalUnstyledTypeMap
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendModalUnstyled
import com.olvind.mui.muiMaterial.anon.`24`
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod extends Shortcut {
  
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
  @JSImport("@mui/material/Modal/Modal", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element | Null] = js.native
  
  @JSImport("@mui/material/Modal/Modal", "ModalRoot")
  @js.native
  val ModalRoot: ReactComponentClass[ModalRootProps] = js.native
  
  @JSImport("@mui/material/Modal/Modal", "modalClasses")
  @js.native
  val modalClasses: ModalClasses_ = js.native
  
  type ModalClassKey = /* keyof std.NonNullable<@mui/base.anon.PartialModalUnstyledClasses | undefined> */ String
  
  type ModalClasses_ = Record[ModalClassKey, String]
  
  type ModalProps[D /* <: ReactElement */, P] = OverrideProps[ModalTypeMap[D, P], D]
  
  type ModalRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.Backdrop | undefined>['root'] */ js.Any
  
  type ModalTypeMap[D /* <: ReactElement */, P] = ExtendModalUnstyledTypeMap[`24`[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element | Null]
  
  /* This means you don't have to write `default`, but can instead just say `modalModalMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element | Null] = default
}
