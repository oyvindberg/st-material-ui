package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListItemTypeMa
import com.olvind.mui.muiMaterial.imageListItemClassesMod.ImageListItemClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemMod {
  
  @JSImport("@mui/material/ImageListItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageListItem API](https://mui.com/api/image-list-item/)
    */
  @JSImport("@mui/material/ImageListItem", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsImageListItemTypeMa, Element] = js.native
  
  inline def getImageListItemUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListItemUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ImageListItem", "imageListItemClasses")
  @js.native
  val imageListItemClasses: ImageListItemClasses = js.native
}
