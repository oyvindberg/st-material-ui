package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsImageListTypeMapul
import com.olvind.mui.muiMaterial.imageListClassesMod.ImageListClasses
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListMod {
  
  @JSImport("@mui/material/ImageList", JSImport.Namespace)
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
    * - [ImageList API](https://mui.com/api/image-list/)
    */
  @JSImport("@mui/material/ImageList", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsImageListTypeMapul, Element] = js.native
  
  inline def getImageListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("@mui/material/ImageList", "imageListClasses")
  @js.native
  val imageListClasses: ImageListClasses = js.native
}
