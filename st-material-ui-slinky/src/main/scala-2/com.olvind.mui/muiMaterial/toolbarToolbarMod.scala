package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsToolbarTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Variant
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarToolbarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/components/app-bar/)
    *
    * API:
    *
    * - [Toolbar API](https://mui.com/api/toolbar/)
    */
  @JSImport("@mui/material/Toolbar/Toolbar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element] = js.native
  
  type ToolbarProps[D /* <: ReactElement */, P] = OverrideProps[ToolbarTypeMap[P, D], D]
  
  @js.native
  trait ToolbarPropsVariantOverrides extends StObject
  
  @js.native
  trait ToolbarTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Variant = js.native
  }
  object ToolbarTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Variant): ToolbarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ToolbarTypeMapMutableBuilder[Self <: ToolbarTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (ToolbarTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Variant): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarToolbarMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element] = default
}
