package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Component
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsBoxTypeMapdiv
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  type BoxProps[D /* <: ElementType */, P] = OverrideProps[BoxTypeMap[P, D], D]
  
  trait BoxTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SystemProps[Theme] & Component
  }
  object BoxTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & SystemProps[Theme] & Component): BoxTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxTypeMap[P, D]]
    }
    
    extension [Self <: BoxTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (BoxTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SystemProps[Theme] & Component): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element]
  
  /* This means you don't have to write `default`, but can instead just say `boxBoxMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsBoxTypeMapdiv, Element] = default
}
