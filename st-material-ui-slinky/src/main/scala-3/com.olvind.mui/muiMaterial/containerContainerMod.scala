package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsContainerTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DisableGutters
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Container](https://mui.com/material-ui/react-container/)
    *
    * API:
    *
    * - [Container API](https://mui.com/material-ui/api/container/)
    */
  @JSImport("@mui/material/Container/Container", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element] = js.native
  
  type ContainerProps[D /* <: ReactElement */, P] = OverrideProps[ContainerTypeMap[P, D], D]
  
  trait ContainerTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & DisableGutters
  }
  object ContainerTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & DisableGutters): ContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContainerTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (ContainerTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableGutters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `containerContainerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element] = default
}
