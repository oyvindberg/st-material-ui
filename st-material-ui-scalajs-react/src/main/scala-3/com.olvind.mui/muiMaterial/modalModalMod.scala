package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.modalUnstyledModalUnstyledMod.ExtendModalUnstyledTypeMap
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendModalUnstyled
import com.olvind.mui.muiMaterial.anon.`24`
import com.olvind.mui.muiTypes.mod.OverrideProps
import com.olvind.mui.react.mod.FC
import com.olvind.mui.react.mod.global.JSX.Element
import com.olvind.mui.std.Record
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalModalMod extends Shortcut {
  
  /**
    * Modal is a lower-level construct that is leveraged by the following components:
    *
    * *   [Dialog](https://mui.com/api/dialog/)
    * *   [Drawer](https://mui.com/api/drawer/)
    * *   [Menu](https://mui.com/api/menu/)
    * *   [Popover](https://mui.com/api/popover/)
    *
    * If you are creating a modal dialog, you probably want to use the [Dialog](https://mui.com/api/dialog/) component
    * rather than directly using Modal.
    *
    * This component shares many concepts with [react-overlays](https://react-bootstrap.github.io/react-overlays/#modals).
    *
    * Demos:
    *
    * - [Modal](https://mui.com/components/modal/)
    *
    * API:
    *
    * - [Modal API](https://mui.com/api/modal/)
    */
  @JSImport("@mui/material/Modal/Modal", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element] = js.native
  
  @JSImport("@mui/material/Modal/Modal", "ModalRoot")
  @js.native
  val ModalRoot: FC[ModalRootProps] = js.native
  
  @JSImport("@mui/material/Modal/Modal", "modalClasses")
  @js.native
  val modalClasses: ModalClasses_ = js.native
  
  type ModalClassKey = /* keyof std.NonNullable<@mui/base.anon.PartialModalUnstyledClasses | undefined> */ String
  
  type ModalClasses_ = Record[ModalClassKey, String]
  
  type ModalProps[D /* <: ElementType */, P] = OverrideProps[ModalTypeMap[D, P], D]
  
  type ModalRootProps = /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<@mui/base.anon.4 | undefined>['root'] */ js.Any
  
  type ModalTypeMap[D /* <: ElementType */, P] = ExtendModalUnstyledTypeMap[`24`[P, D]]
  
  type _To = js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element]
  
  /* This means you don't have to write `default`, but can instead just say `modalModalMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsExtendModalUnstyled, Element] = default
}
