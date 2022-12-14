package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Cols
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListTypeMapul
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListImageListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/material-ui/react-image-list/)
    *
    * API:
    *
    * - [ImageList API](https://mui.com/material-ui/api/image-list/)
    */
  @JSImport("@mui/material/ImageList/ImageList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element] = js.native
  
  type ImageListProps[D /* <: ReactElement */, P] = OverrideProps[ImageListTypeMap[P, D], D]
  
  trait ImageListPropsVariantOverrides extends StObject
  
  trait ImageListTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Cols
  }
  object ImageListTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Cols): ImageListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListTypeMap[P, D]]
    }
    
    extension [Self <: ImageListTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (ImageListTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Cols): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element]
  
  /* This means you don't have to write `default`, but can instead just say `imageListImageListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element] = default
}
