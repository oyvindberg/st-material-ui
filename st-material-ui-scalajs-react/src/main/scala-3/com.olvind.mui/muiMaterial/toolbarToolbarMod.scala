package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsToolbarTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Variant
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarToolbarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/material-ui/react-app-bar/)
    *
    * API:
    *
    * - [Toolbar API](https://mui.com/material-ui/api/toolbar/)
    */
  @JSImport("@mui/material/Toolbar/Toolbar", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element] = js.native
  
  type ToolbarProps[D /* <: ElementType */, P] = OverrideProps[ToolbarTypeMap[P, D], D]
  
  trait ToolbarPropsVariantOverrides extends StObject
  
  trait ToolbarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Variant
  }
  object ToolbarTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Variant): ToolbarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarTypeMap[P, D]]
    }
    
    extension [Self <: ToolbarTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ToolbarTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Variant): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarToolbarMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsToolbarTypeMapdiv, Element] = default
}
