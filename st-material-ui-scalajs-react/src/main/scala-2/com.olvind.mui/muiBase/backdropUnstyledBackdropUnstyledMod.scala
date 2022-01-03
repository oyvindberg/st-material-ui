package com.olvind.mui.muiBase

import com.olvind.mui.muiBase.anon.BackdropUnstyledTypeMapdivprops
import com.olvind.mui.muiBase.anon.DefaultComponentPropsBackdropUnstyledTyp
import com.olvind.mui.muiTypes.mod.OverridableTypeMap
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backdropUnstyledBackdropUnstyledMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Backdrop](https://mui.com/components/backdrop/)
    *
    * API:
    *
    * - [BackdropUnstyled API](https://mui.com/api/backdrop-unstyled/)
    */
  @JSImport("@mui/base/BackdropUnstyled/BackdropUnstyled", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBackdropUnstyledTyp, Element] = js.native
  
  @js.native
  trait BackdropUnstyledComponentsPropsOverrides extends StObject
  
  @js.native
  trait ExtendBackdropUnstyledTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with BackdropUnstyledTypeMapdivprops = js.native
  }
  object ExtendBackdropUnstyledTypeMap {
    
    @scala.inline
    def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with BackdropUnstyledTypeMapdivprops
    ): ExtendBackdropUnstyledTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendBackdropUnstyledTypeMap[M]]
    }
    
    @scala.inline
    implicit class ExtendBackdropUnstyledTypeMapMutableBuilder[Self <: ExtendBackdropUnstyledTypeMap[_], M /* <: OverridableTypeMap */] (val x: Self with ExtendBackdropUnstyledTypeMap[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with BackdropUnstyledTypeMapdivprops
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBackdropUnstyledTyp, Element]
  
  /* This means you don't have to write `default`, but can instead just say `backdropUnstyledBackdropUnstyledMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBackdropUnstyledTyp, Element] = default
}
