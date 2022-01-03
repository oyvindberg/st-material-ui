package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Component
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBoxTypeMapdiv
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

object boxBoxMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Box](https://mui.com/components/box/)
    *
    * API:
    *
    * - [Box API](https://mui.com/components/box/#api)
    * NOTE - As a CSS utility component, Box also supports all system props.
    * You can use them as props directly on the component.
    * Props use same syntax as `sx`. Not all props are listed in the API section.
    *
    * Example:
    *
    * // For instance, a Box with margin-top:
    * <Box mt={2}>
    */
  @JSImport("@mui/material/Box/Box", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = js.native
  
  type BoxProps[D /* <: ReactElement */, P] = OverrideProps[BoxTypeMap[P, D], D]
  
  @js.native
  trait BoxTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with SystemProps[Theme] with Component = js.native
  }
  object BoxTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with SystemProps[Theme] with Component): BoxTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class BoxTypeMapMutableBuilder[Self <: BoxTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (BoxTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with SystemProps[Theme] with Component): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `boxBoxMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = default
}
