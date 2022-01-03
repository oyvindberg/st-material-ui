package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.DefaultComponentPropsModalUnstyledTypeMa
import com.olvind.mui.muiBase.anon.ModalUnstyledTypeMapdivprops
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalUnstyledModalUnstyledMod extends Shortcut {
  
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
    * - [ModalUnstyled API](https://mui.com/api/modal-unstyled/)
    */
  @JSImport("@mui/base/ModalUnstyled/ModalUnstyled", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsModalUnstyledTypeMa, Element] = js.native
  
  @js.native
  trait ExtendModalUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with ModalUnstyledTypeMapdivprops = js.native
  }
  object ExtendModalUnstyledTypeMap {
    
    @scala.inline
    def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with ModalUnstyledTypeMapdivprops
    ): ExtendModalUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendModalUnstyledTypeMap[M]]
    }
    
    @scala.inline
    implicit class ExtendModalUnstyledTypeMapMutableBuilder[Self <: ExtendModalUnstyledTypeMap[_], M /* <: OverridableTypeMap */] (val x: Self with ExtendModalUnstyledTypeMap[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with ModalUnstyledTypeMapdivprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModalUnstyledComponentsPropsOverrides extends StObject
  
  type _To = js.Function1[/* props */ DefaultComponentPropsModalUnstyledTypeMa, Element]
  
  /* This means you don't have to write `default`, but can instead just say `modalUnstyledModalUnstyledMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsModalUnstyledTypeMa, Element] = default
}
