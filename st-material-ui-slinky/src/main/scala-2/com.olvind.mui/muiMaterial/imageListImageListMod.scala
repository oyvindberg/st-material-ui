package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Cols
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListTypeMapul
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListImageListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageList API](https://mui.com/api/image-list/)
    */
  @JSImport("@mui/material/ImageList/ImageList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element] = js.native
  
  type ImageListProps[D /* <: ReactElement */, P] = OverrideProps[ImageListTypeMap[P, D], D]
  
  @js.native
  trait ImageListPropsVariantOverrides extends StObject
  
  @js.native
  trait ImageListTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Cols = js.native
  }
  object ImageListTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P with Cols): ImageListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ImageListTypeMapMutableBuilder[Self <: ImageListTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (ImageListTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Cols): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element]
  
  /* This means you don't have to write `default`, but can instead just say `imageListImageListMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element] = default
}
