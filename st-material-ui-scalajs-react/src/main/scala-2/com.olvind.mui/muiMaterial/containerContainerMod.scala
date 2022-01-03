package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsContainerTypeMapdiv
import com.olvind.mui.muiMaterial.anon.DisableGutters
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Container](https://mui.com/components/container/)
    *
    * API:
    *
    * - [Container API](https://mui.com/api/container/)
    */
  @JSImport("@mui/material/Container/Container", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element] = js.native
  
  type ContainerProps[D /* <: ElementType */, P] = OverrideProps[ContainerTypeMap[P, D], D]
  
  @js.native
  trait ContainerTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with DisableGutters = js.native
  }
  object ContainerTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with DisableGutters): ContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ContainerTypeMapMutableBuilder[Self <: ContainerTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (ContainerTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with DisableGutters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `containerContainerMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsContainerTypeMapdiv, Element] = default
}
