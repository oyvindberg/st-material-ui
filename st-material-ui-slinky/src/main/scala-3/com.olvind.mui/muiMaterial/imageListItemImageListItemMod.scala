package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListItemTypeMa
import com.olvind.mui.muiMaterial.anon.Rows
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemImageListItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/material-ui/react-image-list/)
    *
    * API:
    *
    * - [ImageListItem API](https://mui.com/material-ui/api/image-list-item/)
    */
  @JSImport("@mui/material/ImageListItem/ImageListItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsImageListItemTypeMa, Element] = js.native
  
  type ImageListItemProps[D /* <: ReactElement */, P] = OverrideProps[ImageListItemTypeMap[P, D], D]
  
  trait ImageListItemTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Rows
  }
  object ImageListItemTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Rows): ImageListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListItemTypeMap[P, D]]
    }
    
    extension [Self <: ImageListItemTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (ImageListItemTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Rows): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsImageListItemTypeMa, Element]
  
  /* This means you don't have to write `default`, but can instead just say `imageListItemImageListItemMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsImageListItemTypeMa, Element] = default
}
