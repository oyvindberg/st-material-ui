package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsStackTypeMapdiv
import com.olvind.mui.muiMaterial.anon.Direction
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackStackMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Stack](https://mui.com/components/stack/)
    *
    * API:
    *
    * - [Stack API](https://mui.com/api/stack/)
    */
  @JSImport("@mui/material/Stack/Stack", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element] = js.native
  
  type StackProps[D /* <: ReactElement */, P] = OverrideProps[StackTypeMap[P, D], D]
  
  @js.native
  trait StackTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with SystemProps[Theme] with Direction = js.native
  }
  object StackTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with SystemProps[Theme] with Direction): StackTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class StackTypeMapMutableBuilder[Self <: StackTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (StackTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with SystemProps[Theme] with Direction): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `stackStackMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsStackTypeMapdiv, Element] = default
}
